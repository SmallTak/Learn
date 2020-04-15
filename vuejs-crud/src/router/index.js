import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/components/Login'
import Home from '@/components/Home'
import addProduct from '@/components/addProduct'
import editProduct from '@/components/editProduct'


Vue.use(Router)

export default new Router({
  // base: '/dist/',加这个的话会出现刷新页面404的错误 部署在nginx的情况下
  mode: 'history',

  routes: [
    {
      path: '/',
      name: 'Login',//该名字不是必须的
      component: Login
    },
    {
      path: '/Home',
      name: 'Home',
      component: Home, 
      // meta: {
      //   reqiredAuth: true//标记这个是需要认证之后才能访问的地址  即使不加该标签也是没办法绕过登录的，因为后端每个请求都会从拦截器中获取token
      // }
    },
    {
      path: '/new',
      name: 'addProduct',
      component: addProduct,
      // meta: {
      //   reqiredAuth: true
      // }
    }
    ,
    {
      path: '/edit/:id',
      name: 'editProduct',
      component: editProduct,
      meta: {
        reqiredAuth: true
      }
    }
     
  ]
})
