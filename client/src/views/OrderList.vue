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
                <li>
                    <div class="order-info">
                        <p>
                            云之未
                            <i class="fa fa-caret-down"></i>
                        </p>
                    </div>
                    <ul class="order-detailet">
                        <li v-for="position in positionlist" :key="position">
                            <p>{{ position.name }}</p>
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
import Footer from "../components/Footer.vue";
export default {
    name: "OrderList",
    data() {
        return {
            companyid: this.$route.query.companyid,
            companylist: [],
            positionlist: [],
        };
    },
    created() {
        this.$axios
            .post("/positions/search", {
                company_id: this.companyid,
            })
            .then((response) => {
                this.positionlist = response.data.data;
                console.log("成功了吗" + response);
                console.log(this.positionlist);
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