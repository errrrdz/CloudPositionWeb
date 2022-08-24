<template>

    <body>
        <div class="wrapper">
            <!-- header部分 -->
            <header>
                <p>个人信息</p>
            </header>
            <!-- 订单信息部分 -->
            <div class="order-info">
                <div class="headImg">
                    <img class="personalpic" :src=userInfo.picture alt="头像">
                </div>
                <div class="info-content">
                    <p>{{ userInfo.name }}</p>
                    <p>邮箱: {{ userInfo.email }}</p>
                </div>
                <!-- <h5>订单配送至：</h5>
        <div class="order-info-address">
          <p>沈阳市浑南区智慧四街1-121号</p>
          <i class="fa fa-angle-right"></i>
        </div>
        <p>习近平先生 13656785432</p> -->
            </div>
            <div @click="toExamine" class="list-btn">公司审核</div>

            <div @click="userQuit" class="quit-btn">退出登录</div>
            <Footer></Footer>
        </div>
    </body>
</template>

<script>
import { userInfo } from "os";
import Footer from "../components/Footer.vue";
import store from "../store/index";
export default {
    name: "Me",
    data() {
        return {
            userInfo: JSON.parse(window.localStorage.getItem("userInfo")),
        };
    },
    created() {
        console.log(this.userInfo);
        console.log(this.userInfo.name);
    },
    methods: {
        toExamine() {
            if (this.userInfo.role == 0) {
                this.$message({
                    message: "非公司审核员，无法使用该功能",
                    type: "error",
                });
            } else {
                this.$message({
                    message: "为公司审核员，正在进入",
                    type: "success",
                });
                this.$router.push({
                    path: "/examine",
                    query: {
                        BusinessId: this.userInfo.role,
                    },
                });
            }
        },
        userQuit() {
            delete localStorage["userInfo"];
            store.state.userInfo = null;
            this.$router.push({
                path: "/",
            });
        },
    },
    components: { Footer },
};
</script>

<style scoped>
/****************** 总容器 ******************/
.wrapper {
    width: 100%;
    height: 100%;
}
/****************** header部分 ******************/
.wrapper header {
    width: 100%;
    height: 12vw;
    background-color: #ffae00;
    color: #fff;
    font-size: 4.8vw;
    position: fixed;
    left: 0;
    top: 0;
    z-index: 1000;
    display: flex;
    justify-content: center;
    align-items: center;
}
/****************** 订单信息部分 ******************/
.wrapper .order-info {
    /*注意这里，不设置高，靠内容撑开。因为地址有可能折行*/
    width: 100%;
    margin-top: 12vw;
    background-color: #ffae00;
    box-sizing: border-box;
    padding: 2vw;
    color: #fff;
    display: flex;
}
.wrapper .order-info h5 {
    font-size: 3vw;
    font-weight: 300;
}
.wrapper .order-info .order-info-address {
    width: 100%;
    display: flex;
    justify-content: space-between;
    align-items: center;
    font-weight: 700;
    user-select: none;
    cursor: pointer;
    margin: 1vw 0;
}
.wrapper .order-info .order-info-address p {
    width: 90%;
    font-size: 5vw;
}
.wrapper .order-info .order-info-address i {
    font-size: 6vw;
}
.wrapper .order-info p {
    font-size: 3vw;
}
.wrapper .list-btn {
    width: 100%;
    height: 50px;
    border-bottom: 1px solid #aaa;
    /* background-color: rgb(110, 110, 110); */
    text-align: center;
    line-height: 50px;
}
.wrapper .order-info .headImg {
    width: 20vw;
    height: 20vw;
    background-color: pink;
}
.wrapper .order-info .headImg .personalpic {
    width: 100%;
    height: 100%;
}
.wrapper .order-info .info-content {
    margin-left: 5vw;
}
.wrapper .order-info .info-content p:nth-child(1) {
    font-size: 6vw;
    margin-bottom: 2vw;
}
.wrapper .order-info .info-content p:nth-child(2) {
    font-size: 4vw;
}
.quit-btn {
    position: absolute;
    bottom: 10%;
    left: 50%;
    transform: translateX(-50%);
    width: 80%;
    height: 30px;
    background-color: #db1616e8;
    border-radius: 1vw;
    text-align: center;
    line-height: 30px;
    color: #fff;
}
/****************** 订单明细部分 ******************/
.wrapper .order-detailed {
    width: 100%;
}
.wrapper .order-detailed li {
    width: 100%;
    height: 16vw;
    box-sizing: border-box;
    padding: 3vw;
    color: #666;
    display: flex;
    justify-content: space-between;
    align-items: center;
}
.wrapper .order-detailed li .order-detailed-left {
    display: flex;
    align-items: center;
}
.wrapper .order-detailed li .order-detailed-left img {
    width: 10vw;
    height: 10vw;
}
.wrapper .order-detailed li .order-detailed-left p {
    font-size: 3.5vw;
    margin-left: 3vw;
}
.wrapper .order-detailed li p {
    font-size: 3.5vw;
}
.wrapper .order-deliveryfee {
    width: 100%;
    height: 16vw;
    box-sizing: border-box;
    padding: 3vw;
    color: #666;
    display: flex;
    justify-content: space-between;
    align-items: center;
    font-size: 3.5vw;
}

/****************** 订单合计部分 ******************/
.wrapper .total {
    width: 100%;
    height: 14vw;
    position: fixed;
    left: 0;
    bottom: 0;
    display: flex;
}
.wrapper .total .total-left {
    flex: 2;
    background-color: #505051;
    color: #fff;
    font-size: 4.5vw;
    font-weight: 700;
    user-select: none;
    display: flex;
    justify-content: center;
    align-items: center;
}
.wrapper .total .total-right {
    flex: 1;
    background-color: #38ca73;
    color: #fff;
    font-size: 4.5vw;
    font-weight: 700;
    user-select: none;
    cursor: pointer;
    display: flex;
    justify-content: center;
    align-items: center;
}
</style>
