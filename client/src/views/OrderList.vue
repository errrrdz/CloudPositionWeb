<template>

    <body>
        <div class="wrapper">
            <!-- header部分 -->
            <header>
                <p>我的信息</p>
            </header>
            <!-- 订单列表部分 -->
            <h3>求职信息：</h3>
            <ul class="order">
                <li v-for="(company, index) in companylist" :key="index">
                    <div class="order-info">
                        <p>
                            {{ company.name }}
                            <i class="fa fa-caret-down"></i>
                        </p>
                    </div>
                    <ul class="order-detailet">
                        <li v-for="(item,index) in positionlist" :key="index">
                            <p>{{ item.name }}</p>
                            <p>正在审核</p>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- 底部菜单部分 -->
            <Footer></Footer>
        </div>
    </body>
</template>

<script>
import store from "../store/index";
import Footer from "../components/Footer.vue";
export default {
    name: "OrderList",
    data() {
        return {
            userInfo: "",
            companyArr: [],
            companylist: [],
            positionlist: [],
        };
    },
    created() {
        this.userInfo = store.state.userInfo;
        this.$axios
            .post("/userposition/search", {
                username: this.userInfo.name,
            })
            .then((response) => {
                console.log(response);
                let positionuserInfo = response.data.data;
                for (let i = 0; i < positionuserInfo.length; i++) {
                    this.$axios
                        .post("/positions/search", {
                            id: positionuserInfo[i].positionId,
                        })
                        .then((response2) => {
                            let positionInfo = response2.data.data;
                            console.log(response2);
                            this.$axios
                                .post("/companies/search", {
                                    id: positionInfo.companyId,
                                })
                                .then((response3) => {
                                    console.log(response3.data.data);
                                    this.companylist.push(response3.data.data);
                                    console.log(this.companylist);
                                });
                        });
                }
            });
    },
    components: {
        Footer,
    },
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
/****************** 历史订单列表部分 ******************/
.wrapper h3 {
    margin-top: 12vw;
    box-sizing: border-box;
    padding: 4vw;
    font-size: 4vw;
    font-weight: 300;
    color: #999;
}
.wrapper .order {
    width: 100%;
}
.wrapper .order li {
    width: 100%;
}
.wrapper .order li .order-info {
    box-sizing: border-box;
    padding: 2vw 4vw;
    font-size: 4vw;
    color: #666;
    display: flex;
    justify-content: space-between;
    align-items: center;
}
.wrapper .order li .order-info .order-info-right {
    display: flex;
}
.wrapper .order li .order-info .order-info-right .order-info-right-icon {
    background-color: #f90;
    color: #fff;
    border-radius: 3px;
    margin-left: 2vw;
    user-select: none;
    cursor: pointer;
}
.wrapper .order li .order-detailet {
    width: 100%;
}
.wrapper .order li .order-detailet li {
    width: 100%;
    box-sizing: border-box;
    padding: 1vw 4vw;
    color: #666;
    font-size: 3vw;
    display: flex;
    justify-content: space-between;
    align-items: center;
}
/****************** 底部菜单部分 ******************/
.wrapper .footer {
    width: 100%;
    height: 14vw;
    border-top: solid 1px #ddd;
    background-color: #fff;
    position: fixed;
    left: 0;
    bottom: 0;
    display: flex;
    justify-content: space-around;
    align-items: center;
}
.wrapper .footer li {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    color: #999;
    user-select: none;
    cursor: pointer;
}
.wrapper .footer li p {
    font-size: 2.8vw;
}
.wrapper .footer li i {
    font-size: 5vw;
}
</style>