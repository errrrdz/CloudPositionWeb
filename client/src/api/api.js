import service from "./request";

export const Login = (data) => {
    return service({
        url: "/sys/login",
        method: "post",
        data,
    });
};
