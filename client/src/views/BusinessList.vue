<template>
    <div>
        <div class="wrapper">
            <!-- header部分 -->
            <header>
                <p>商家列表</p>
            </header>
            <!-- 商家列表部分 -->
            <ul class="business">
                <li @click="toBusinessInfo(1)">
                    <div class="business-img">
                        <img src="../assets/sj01.png">
                        <div class="business-img-quantity">3</div>
                    </div>
                    <div class="business-info">
                        <h3>万家饺子（软件园E18店）</h3>
                        <p>&#165;15起送 | &#165;3配送</p>
                        <p>各种饺子炒菜</p>
                    </div>
                </li>
                <li @click="toBusinessInfo(1)">
                    <div class="business-img">
                        <img src="../assets/sj02.png">
                        <div class="business-img-quantity">2</div>
                    </div>
                    <div class="business-info">
                        <h3>小锅饭豆腐馆（全运店）</h3>
                        <p>&#165;15起送 | &#165;3配送</p>
                        <p>特色美食</p>
                    </div>
                </li>
                <li @click="toBusinessInfo(1)">
                    <div class="business-img">
                        <img src="../assets/sj03.png">
                        <div class="business-img-quantity">1</div>
                    </div>
                    <div class="business-info">
                        <h3>麦当劳麦乐送（全运路店）</h3>
                        <p>&#165;15起送 | &#165;3配送</p>
                        <p>汉堡薯条</p>
                    </div>
                </li>
                <li @click="toBusinessInfo(1)">
                    <div class="business-img">
                        <img src="../assets/sj04.png">
                    </div>
                    <div class="business-info">
                        <h3>米村拌饭（浑南店）</h3>
                        <p>&#165;15起送 | &#165;3配送</p>
                        <p>各种炒菜拌饭</p>
                    </div>
                </li>
                <li @click="toBusinessInfo(1)">
                    <div class="business-img">
                        <img src="../assets/sj05.png">
                    </div>
                    <div class="business-info">
                        <h3>申记串道（中海康城店）</h3>
                        <p>&#165;15起送 | &#165;3配送</p>
                        <p>烤串炸串</p>
                    </div>
                </li>
                <li @click="toBusinessInfo(1)">
                    <div class="business-img">
                        <img src="../assets/sj06.png">
                    </div>
                    <div class="business-info">
                        <h3>半亩良田排骨米饭</h3>
                        <p>&#165;15起送 | &#165;3配送</p>
                        <p>排骨米饭套餐</p>
                    </div>
                </li>
                <li @click="toBusinessInfo(1)">
                    <div class="business-img">
                        <img src="../assets/sj07.png">
                    </div>
                    <div class="business-info">
                        <h3>茶兮鲜果饮品（国际软件园店）</h3>
                        <p>&#165;15起送 | &#165;3配送</p>
                        <p>甜品饮品</p>
                    </div>
                </li>
                <li @click="toBusinessInfo(1)">
                    <div class="business-img">
                        <img src="../assets/sj08.png">
                    </div>
                    <div class="business-info">
                        <h3>唯一水果捞（软件园E18店）</h3>
                        <p>&#165;15起送 | &#165;3配送</p>
                        <p>新鲜水果</p>
                    </div>
                </li>
                <li @click="toBusinessInfo(1)">
                    <div class="business-img">
                        <img src="../assets/sj09.png">
                    </div>
                    <div class="business-info">
                        <h3>满园春饼（全运路店）</h3>
                        <p>&#165;15起送 | &#165;3配送</p>
                        <p>各种春饼</p>
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
        return {};
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
    background-color: #0097ff;
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