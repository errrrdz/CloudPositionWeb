import Vue from "vue";
import VueRouter from "vue-router";
import Index from "../views/Index.vue";
import BusinessInfo from "../views/BusinessInfo.vue";
import BusinessList from "../views/BusinessList.vue";
import Login from "../views/Login.vue";
import Order from "../views/Order.vue";
import OrderList from "../views/OrderList.vue";
import Payment from "../views/Payment.vue";
import Register from "../views/Register.vue";
import Filter from "../views/Filter";
import Me from "../views/Me";
import Login2 from "../views/login2.vue";
import Register2 from "../views/register2.vue";
import store from "../store/index";
import Examine from "../views/Examine";

Vue.use(VueRouter);

const routes = [
    {
        path: "/",
        name: "home",
        component: Index,
    },
    {
        path: "/index",
        name: "Index",
        component: Index,
    },
    {
        path: "/businessInfo",
        name: "BusinessInfo",
        component: BusinessInfo,
    },
    {
        path: "/businessList",
        name: "BusinessList",
        component: BusinessList,
    },
    {
        path: "/login",
        name: "Login",
        component: Login2,
    },
    {
        path: "/order",
        name: "Order",
        component: Order,
    },
    {
        path: "/orderList",
        name: "OrderList",
        component: OrderList,
    },
    {
        path: "/payment",
        name: "Payment",
        component: Payment,
    },
    {
        path: "/register",
        name: "Register",
        component: Register2,
    },
    {
        path: "/me",
        name: "Me",
        component: Me,
    },
    {
        path: "/filter",
        name: "Filter",
        component: Filter,
    },
    {
        path: "/examine",
        name: "Examine",
        component: Examine,
    },
];
const originalPush = VueRouter.prototype.push;
VueRouter.prototype.push = function push(location) {
    return originalPush.call(this, location).catch((err) => err);
};
const router = new VueRouter({
    mode: "history",
    base: process.env.BASE_URL,
    routes,
});

export default router;
