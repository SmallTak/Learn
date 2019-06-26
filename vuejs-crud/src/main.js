// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
// 导入饿了么
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
// 导入axios
import axios from 'axios'
//导入psfjs
import htmlToPdf from './utils/htmlToPdf.js'


Vue.use(htmlToPdf)

Vue.use(ElementUI);

Vue.prototype.$http = axios;
//配置axios默认属性
axios.defaults.baseURL ="http://localhost:9090"

Vue.config.productionTip = false

router.beforeEach((to,from,next)=>{
  if ((to.meta.reqiredAuth)) {
    var token = localStorage.getItem("jwtToken");
    if (!token) {
      router.push("/");
      return;
    }
  }
  next();
})
//axios 请求拦截器，将token放入到http header中发送给服务端,在所有的请求之前执行
axios.interceptors.request.use(config => {
  var token = localStorage.getItem("jwtToken");
  console.log(token);
  if (token) {
    console.log(token);
    config.headers.Authorization = token;
  }  
  return config;
}, error => {
  return Promise.reject(error);
});

//axios 响应拦截器 为了判断服务端返回的是200 还是401 所有的响应之前
axios.interceptors.response.use(response => {
  return response;
}, error => {
  if (error.response) {
    if (error.response.status == 401) {
      //删除token
      localStorage.removeItem("jwtToken");
      router.push("/");
    }
  }
  return Promise.reject(error.response.data);
});

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
