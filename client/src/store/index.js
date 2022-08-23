import Vue from "vue";
import Vuex from "vuex";
Vue.use(Vuex);

const store = new Vuex.Store({
    state: {
        userInfo: JSON.parse(window.localStorage.getItem("userInfo")),
    },
    mutations: {},
    actions: {},
    modules: {},
});

export default store;
