import Vue from 'vue'
import Router from 'vue-router'
import Layout from '@/components/Layout'
import Home from '@/pages/Home'
import Student from '@/pages/Student'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      redirect: '/student'
    },
    {
      path: '/home',
      component: Layout,
      children: [
        {
          path: '/',
          components: {
            body: Home
          }
        }
      ]
    },
    {
      path: '/student',
      component: Layout,
      children: [
        {
          path: '/',
          components: {
            body: Student
          }
        }
      ]
    }
  ]
})
