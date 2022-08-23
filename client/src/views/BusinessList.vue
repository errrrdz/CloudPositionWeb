<template>
    <div>
        <div class="wrapper">
            <!-- header部分 -->
            <header>
                <p>公司列表</p>
            </header>
            <!-- 商家列表部分 -->
            <ul class="business">
                <li v-for="business in businessList" :key="business" @click="toBusinessInfo(business.id)">
                    <div class="business-img">
                        <img src="../assets/sj01.png">
                    </div>
                    <div class="business-info">
                        <h3>{{ business.name }}</h3>
                        <p>{{ business.details }}</p>
                    </div>
                </li>
            </ul>
            <!-- 底部菜单 -->
            <Footer></Footer>
        </div>
    </div>
</template>

<script>
import Footer from "../components/Footer.vue";
export default {
    name: "BusinessList",
    data() {
        return {
            orderTypeId: this.$route.query.orderTypeId,
            businessList: [],
            businessIdArr: this.$route.query.businessIdArr,
        };
    },
    created() {
        this.$axios
            .get("/companies", {
                id: parseInt(this.orderTypeId),
            })
            .then((response) => {
                console.log(response);
                console.log(response.data.data);
                this.businessList.push(response.data.data[0]);
            });
        console.log(parseInt(this.orderTypeId));
        // for (let i = 0; i < this.businessIdArr.length; i++) {
        //     this.$axios
        //         .get("/companies", { id: this.businessIdArr[i] })
        //         .then((response) => {
        //             this.businessList.push(response.data.data);
        //             console.log("2" + response.data.data);
        //         });
        // }
    },
    methods: {
        toBusinessInfo(BusinessId) {
            this.$router.push({
                path: "/businessInfo",
                query: {
                    BusinessId,
                },
            });
        },
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
/****************** 商家列表部分 ******************/
.wrapper .business {
    width: 100%;
    margin-top: 12vw;
    margin-bottom: 14vw;
}
.wrapper .business li {
    width: 100%;
    box-sizing: border-box;
    padding: 2.5vw;
    border-bottom: solid 1px #ddd;
    user-select: none;
    cursor: pointer;
    display: flex;
    align-items: center;
}
</style>