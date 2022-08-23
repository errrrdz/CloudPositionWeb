import axios from "axios";
import cookie from "../plugins/cookie";
import Toast from "assert";

/****** 创建axios实例 ******/
const service = axios.create({
    baseURL: "http://localhost:8001", // api的base_url
    timeout: 5000, // 请求超时时间
});

/****** request拦截器==>对请求参数做处理 ******/
service.interceptors.request.use(
    (config) => {
        // config.method === 'post'
        //     : config.params = {...config.params};
        // //发送json数据
        config.headers["Content-Type"] = "application/json;charset=UTF-8";

        //判断是否存在token，如果存在的话，则每个http header都加上token
        // console.log("cookie");
        // if (cookie.getAll()) {
        //     console.log(cookie.getAll());
        //     config.headers.Authorization = "123";
        // }
        // 判断是否存在token，如果存在的话，则每个http header都加上token
        if (cookie.get("token")) {
            config.headers.Authorization = cookie.get("token");
        }

        return config;
    },
    (error) => {
        //请求错误处理
        Toast.fail(error.toString());
        Promise.reject(error);
    }
);

export default service;
