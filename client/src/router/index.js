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
        component: Login,
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
        component: Register,
    },
    {
        path: "/filter",
        name:"Filter",
        component: Filter,
    }
];

const router = new VueRouter({
    routes,
});

export default router;
