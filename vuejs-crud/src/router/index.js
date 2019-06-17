import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/components/Login'
import Home from '@/components/Home'
import addProduct from '@/components/addProduct'
import editProduct from '@/components/editProduct'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Login',
      component: Login
    },
    {
      path: '/Home',
      name: 'Home',
      component: Home
    },
    {
      path: '/new',
      name: 'addProduct',
      component: addProduct
    }
    ,
    {
      path: '/edit/:id',
      name: 'editProduct',
      component: editProduct
    }
  ]
})
