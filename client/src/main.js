import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import "font-awesome/css/font-awesome.min.css";
import ElementUI from "element-ui";
import "element-ui/lib/theme-chalk/index.css";
import axios from "axios";
import qs from "qs";

import { Loading, MessageBox, Message, Notification } from "element-ui";

Vue.use(Loading.directive);

Vue.prototype.$loading = Loading.service;
Vue.prototype.$msgbox = MessageBox;
Vue.prototype.$alert = MessageBox.alert;
Vue.prototype.$confirm = MessageBox.confirm;
Vue.prototype.$prompt = MessageBox.prompt;
Vue.prototype.$notify = Notification;
Vue.prototype.$message = Message;

//导入自定义模块
import {
    getCurDate,
    setSessionStorage,
    getSessionStorage,
    removeSessionStorage,
    setLocalStorage,
    getLocalStorage,
    removeLocalStorage,
} from "./common.js";

Vue.use(ElementUI);

Vue.config.productionTip = false;
//设置axios请求url基础部分
axios.defaults.baseURL = "http://localhost:8001";

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

router.beforeEach(function (to, from, next) {
    let user = store.state.userInfo;
    if (
        !(
            to.path == "/" ||
            to.path == "/index" ||
            to.path == "/businessList" ||
            to.path == "/businessInfo" ||
            to.path == "/login" ||
            to.path == "/filter" ||
            to.path == "/order" ||
            to.path == "/register"
        )
    ) {
        if (user == null) {
            router.push("/login");
            console.log("daozhele");
            location.reload();
        }
    }
    next();
});

new Vue({
    router,
    store,
    render: function (h) {
        return h(App);
    },
}).$mount("#app");
