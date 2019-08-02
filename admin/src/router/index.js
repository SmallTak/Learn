import Vue from 'vue'
import Router from 'vue-router'
import Layout from '@/page/Layout'
import List from '@/page/List'
import Edit from "@/page/Edit"
import Hello from "@/page/Hello"
import Test from "@/page/Test"
import Login from '@/page/Login'



Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Login',
      component: Login
    },
    
    {
      path: '/List',
      name: 'List',
      component: List,
      // meta: {
      //   reqiredAuth: true
      // }
    },
    {
      path: '/Layout',
      name: 'Layout',
      component: Layout,
      meta: {
        reqiredAuth: true
      }
    },
    {
      path: '/Edit/:id',
      name: 'Edit',
      component: Edit,
      meta: {
        reqiredAuth: true
      }
    },
    {
      path: '/Hello',
      name: 'Hello',
      component: Hello
    },
    {
      path: '/Test',
      name: 'Test',
      component: Test,
      meta: {
        reqiredAuth: true
      }
    }
  ],
  mode:'history'

})
