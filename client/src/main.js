import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import "font-awesome/css/font-awesome.min.css"
import axios from "axios"
import qs from 'qs';

//导入自定义模块
import {
  getCurDate,
  setSessionStorage,
  getSessionStorage,
  removeSessionStorage,
  setLocalStorage,
  getLocalStorage,
  removeLocalStorage,
} from './common.js'

Vue.config.productionTip = false
//设置axios请求url基础部分
axios.defaults.baseURL = "http://localhost:8083"

//将axios挂载到vue 使用另外的方法挂载
Vue.prototype.$axios = axios;
Vue.prototype.$qs = qs;
Vue.prototype.$getCurDate = getCurDate;
Vue.prototype.$setSessionStorage = setSessionStorage;
Vue.prototype.$getSessionStorage = getSessionStorage;
Vue.prototype.$removeSessionStorage = removeSessionStorage;
Vue.prototype.$setLocalStorage = setLocalStorage;
Vue.prototype.$getLocalStorage = getLocalStorage;
Vue.prototype.$removeLocalStorage = removeLocalStorage;

new Vue({
  router,
  store,
  render: function (h) { return h(App) }
}).$mount('#app')
