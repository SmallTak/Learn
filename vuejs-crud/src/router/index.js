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
      component: Home, 
      meta: {
        reqiredAuth: true
      }
    },
    {
      path: '/new',
      name: 'addProduct',
      component: addProduct,
      meta: {
        reqiredAuth: true
      }
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
