import service from './request'

export const Login = data => {
    return service({
        url: '/user/login',
        method: 'post',
        data
    })
};
