<template>

    <body>
        <!-- 总容器 -->
        <div class="wrapper">
            <!-- header部分 -->
            <header>
                <i class="el-icon-location-outline" style="font-size: x-large; color:white"></i>
                <div class="location-text">宜昌市西陵区<i class="fa fa-caret-down"></i>
                </div>
            </header>
            <!-- search部分 -->
            <!--
            搜索框部分（此块与search-fixed-top块宽度高度一致，用于当
            search-fixed-top块固定后，挡住下面块不要窜上去）
            -->
            <div class="search">
                <!-- 当滚动条超过上面的定位块时，search-fixed-top块变成固定在顶部。 -->
                <div class="search-fixed-top" id="fixedBox">
                    <!-- 搜索框部分中间的白框 -->
                    <div class="search-box">
                        <i class="fa fa-search"></i>搜索云职位企业、职位名称
                    </div>
                </div>
            </div>
            <!-- 工作分类部分 -->
            <ul class="worktype">
                <li @click="toBusinessList(1)">
                    <img src="../assets/position001.png">
                    <p>技术</p>
                </li>
                <li @click="toBusinessList(1)">
                    <img src="../assets/position002.png">
                    <p>产品</p>
                </li>
                <li @click="toBusinessList(1)">
                    <img src="../assets/position003.png">
                    <p>运营</p>
                </li>
                <li @click="toBusinessList(1)">
                    <img src="../assets/position004.png">
                    <p>设计</p>
                </li>
                <li @click="toBusinessList(1)">
                    <img src="../assets/position005.png">
                    <p>市场</p>
                </li>
                <li @click="toBusinessList(1)">
                    <img src="../assets/position006.png">
                    <p>人事/行政</p>
                </li>
                <li @click="toBusinessList(1)">
                    <img src="../assets/position007.png">
                    <p>高级管理</p>
                </li>
                <li @click="toBusinessList(1)">
                    <img src="../assets/position008.png">
                    <p>销售</p>
                </li>
                <li @click="toBusinessList(1)">
                    <img src="../assets/position009.png">
                    <p>传媒</p>
                </li>
                <li @click="toBusinessList(1)">
                    <img src="../assets/position010.png">
                    <p>教育培训</p>
                </li>
            </ul>

            <!-- 推荐工作部分 -->
            <div class="recommend">
                <div class="recommend-line"></div>
                <p>推荐职位</p>
                <div class="recommend-line"></div>
            </div>

            <ul class="recommendtype">
                <li>
                    <el-col :span="12">
                        <el-dropdown trigger="click">
                            <span class="el-dropdown-link">
                                综合排序<i class="el-icon-arrow-down el-icon--right"></i>
                            </span>
                            <el-dropdown-menu slot="dropdown">
                                <el-dropdown-item icon="el-icon-s-home">综合排序</el-dropdown-item>
                                <el-dropdown-item icon="el-icon-map-location">距离排序</el-dropdown-item>
                                <el-dropdown-item icon="el-icon-bank-card">工资排序</el-dropdown-item>
                                <el-dropdown-item icon="el-icon-school">城市排序</el-dropdown-item>
                            </el-dropdown-menu>
                        </el-dropdown>
                    </el-col>
                </li>
                <li>附近</li>
                <li>兼职</li>
                <li>
                    <el-button type="primary" @click="toFilter" style="background-color: #c3cad1; border-color: white;color: #555;padding: 0">
                        <div>
                            <span>
                                <svg t="1660827425250" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="2603" width="25" height="25">
                                    <path d="M872.533333 134.4c-12.8-10.666667-29.866667-17.066667-49.066666-17.066667H198.4C157.866667 117.333333 123.733333 151.466667 123.733333 192c0 17.066667 6.4 34.133333 17.066667 49.066667l256 302.933333v251.733333c0 12.8 6.4 23.466667 17.066667 27.733334l162.133333 81.066666c4.266667 2.133333 8.533333 4.266667 14.933333 4.266667 6.4 0 10.666667-2.133333 17.066667-4.266667 8.533333-6.4 14.933333-17.066667 14.933333-27.733333V541.866667l256-302.933334c12.8-14.933333 19.2-34.133333 17.066667-53.333333 2.133333-19.2-6.4-38.4-23.466667-51.2z m-38.4 64L569.6 509.866667c-4.266667 6.4-8.533333 12.8-8.533333 21.333333v292.266667l-98.133334-49.066667V531.2c0-8.533333-2.133333-14.933333-8.533333-21.333333L189.866667 198.4c0-2.133333-2.133333-4.266667-2.133334-6.4 0-6.4 4.266667-10.666667 10.666667-10.666667h625.066667c2.133333 0 4.266667 0 6.4 2.133334 2.133333 2.133333 4.266667 6.4 4.266666 6.4 2.133333 2.133333 2.133333 6.4 0 8.533333z" p-id="2604" fill="#2c2c2c"></path>
                                </svg>
                            </span>
                            <span style="padding: 5px;font-size: 3.5vw">筛选</span>
                        </div>
                    </el-button>
                </li>
            </ul>

            <!-- 推荐商家列表部分 -->
            <ul class="business">
                <li v-for="(item, index) in businessList" :key="index" @click="toBusinessList(item.id)">
                    <img src="../assets/sj01.png">
                    <div class="business-info">
                        <div class="business-info-h">
                            <h3>{{ item.name }}</h3>
                            <div class="business-info-like">&#8226;</div>
                        </div>
                        <div class="business-info-star">
                            <div class="business-info-star-left">
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                            </div>
                        </div>
                        <div class="business-info-delivery">
                            <p>基础要求1 | 基础要求2</p>
                            <!-- <p>3.22km | 30分钟</p> -->
                        </div>
                        <div class="business-info-explain">
                            <div>{{ item.details }}</div>
                        </div>
                    </div>
                </li>
            </ul>

            <!-- 底部菜单 -->
            <Footer></Footer>
        </div>
    </body>
</template>

<script>
import Footer from "../components/Footer.vue";
export default {
    name: "Index",
    data() {
        return {
            businessList: [],
        };
    },
    created() {
        this.$axios.get("/companies").then((response) => {
            console.log(response);
            console.log(response.data.data);
            this.businessList.push(response.data.data[0]);
        });
    },
    mounted() {
        window.onload = function () {
            document.onscroll = () => {
                //获取滚动条位置
                let s1 = document.documentElement.scrollTop;
                let s2 = document.body.scrollTop;
                let scroll = s1 == 0 ? s2 : s1;
                //获取视口宽度
                let width = document.documentElement.clientWidth;
                //获取顶部固定块
                let search = document.getElementById("fixedBox");
                //判断滚动条超过视口宽度的12%时，搜索块变固定定位
                if (scroll > width * 0.12) {
                    search.style.position = "fixed";
                    search.style.left = "0";
                    search.style.top = "0";
                } else {
                    search.style.position = "static";
                }
            };
        };
    },
    destroyed() {
        document.onscroll = null;
    },
    methods: {
        toBusinessList(orderTypeId) {
            this.$router.push({
                path: "businessList",
                query: { orderTypeId: orderTypeId },
            });
        },
        toFilter() {
            this.$router.push({
                path: "filter",
            });
        },
    },
    components: {
        Footer,
    },
};
</script>

<style scoped>
/****************** 新增 ******************/
.el-dropdown-link {
    cursor: pointer;
    color: #409eff;
}
.el-icon-arrow-down {
    font-size: 12px;
}
.demonstration {
    display: block;
    color: #8492a6;
    font-size: 14px;
    margin-bottom: 20px;
}
/****************** 总容器 ******************/
.wrapper {
    width: 100%;
    height: 100%;
}
/****************** header ******************/
.wrapper header {
    width: 100%;
    height: 12vw;
    background-color: #ffae00;
    display: flex;
    align-items: center;
}
.wrapper header .icon-location-box {
    width: 3.5vw;
    height: 3.5vw;
    margin: 0 1vw 0 3vw;
}
.wrapper header .location-text {
    font-size: 4.5vw;
    font-weight: 700;
    color: #fff;
}
.wrapper header .location-text .fa-caret-down {
    margin-left: 1vw;
}
/****************** search ******************/
.wrapper .search {
    width: 100%;
    height: 13vw;
}
.wrapper .search .search-fixed-top {
    width: 100%;
    height: 13vw;
    background-color: #ffae00;
    display: flex;
    justify-content: center;
    align-items: center;
}
.wrapper .search .search-fixed-top .search-box {
    width: 90%;
    height: 9vw;
    background-color: #fff;
    border-radius: 2px;
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 3.5vw;
    color: #aeaeae;
    font-family: "宋体";
    /*此样式是让文本选中状态无效*/
    user-select: none;
}
.wrapper .search .search-fixed-top .search-box .fa-search {
    margin-right: 1vw;
}
/****************** 点餐分类部分 ******************/
.wrapper .worktype {
    width: 100%;
    height: 48vw;
    display: flex;
    flex-wrap: wrap;
    justify-content: space-around;
    /*要使用align-content。10个子元素将自动换行为两行，而且两行作为一个整体垂直居中*/
    align-content: center;
}
.wrapper .worktype li {
    /*一共10个子元素，通过计算，子元素宽度在16.7 ~ 20 之间，才能保证换两行*/
    width: 18vw;
    height: 20vw;
    display: flex;
    /*弹性盒子主轴方向设为column，然后仍然是垂直水平方向居中*/
    flex-direction: column;
    justify-content: center;
    align-items: center;
    user-select: none;
    cursor: pointer;
}
.wrapper .worktype li img {
    width: 12vw;
    /*视频讲解时高度设置为12vw，实际上设置为10.3vw更佳*/
    height: 10.3vw;
}
.wrapper .worktype li p {
    font-size: 3.2vw;
    color: #666;
}
/****************** 横幅广告部分 ******************/
.wrapper .banner {
    /**
* 设置容器宽度95%，然后水平居中，这样两边留白;
* 这里不能用padding，因为背景图片也会覆盖padding
*/
    width: 95%;
    margin: 0 auto;
    height: 29vw;
    /*此三个样式组合，可以保证背景图片充满整个容器*/
    background-image: url(../assets/index_banner.png);
    background-repeat: no-repeat;
    background-size: cover;
    box-sizing: border-box;
    padding: 2vw 6vw;
}
.wrapper .banner h3 {
    font-size: 4.2vw;
    margin-bottom: 1.2vw;
}
.wrapper .banner p {
    font-size: 3.4vw;
    color: #666;
    margin-bottom: 2.4vw;
}
.wrapper .banner a {
    font-size: 3vw;
    color: #c79060;
    font-weight: 700;
}
/****************** 超级会员部分 ******************/
.wrapper .supermember {
    /*这里也设置容器宽度95%，不能用padding，因为背景色也会充满padding*/
    width: 95%;
    margin: 0 auto;
    height: 11.5vw;
    background-color: #feedc1;
    margin-top: 1.3vw;
    border-radius: 2px;
    color: #644f1b;
    display: flex;
    justify-content: space-between;
    align-items: center;
}
.wrapper .supermember .left {
    display: flex;
    align-items: center;
    margin-left: 4vw;
    user-select: none;
}
.wrapper .supermember .left img {
    width: 6vw;
    height: 6vw;
    margin-right: 2vw;
}
.wrapper .supermember .left h3 {
    font-size: 4vw;
    margin-right: 2vw;
}
.wrapper .supermember .left p {
    font-size: 3vw;
}
.wrapper .supermember .right {
    font-size: 3vw;
    margin-right: 4vw;
    cursor: pointer;
}
/****************** 推荐商家部分 ******************/
.wrapper .recommend {
    width: 100%;
    height: 14vw;
    display: flex;
    justify-content: center;
    align-items: center;
}
.wrapper .recommend .recommend-line {
    width: 6vw;
    height: 0.2vw;
    background-color: #888;
}
.wrapper .recommend p {
    font-size: 4vw;
    margin: 0 4vw;
}
/****************** 推荐方式部分 ******************/
.wrapper .recommendtype {
    width: 100%;
    height: 5vw;
    margin-bottom: 5vw;
    display: flex;
    justify-content: space-around;
    align-items: center;
}
.wrapper .recommendtype li {
    font-size: 3.5vw;
    color: #555;
}
/****************** 推荐商家列表部分 ******************/
.wrapper .business {
    width: 100%;
    margin-bottom: 14vw;
}
.wrapper .business li {
    width: 100%;
    box-sizing: border-box;
    padding: 2.5vw;
    user-select: none;
    border-bottom: solid 1px #ddd;
    display: flex;
}
.wrapper .business li img {
    width: 18vw;
    height: 18vw;
}
.wrapper .business li .business-info {
    width: 100%;
    box-sizing: border-box;
    padding-left: 3vw;
}
.wrapper .business li .business-info .business-info-h {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-bottom: 2vw;
}
.wrapper .business li .business-info .business-info-h h3 {
    font-size: 4vw;
    color: #333;
}
.wrapper .business li .business-info .business-info-h .business-info-like {
    width: 1.6vw;
    height: 3.4vw;
    background-color: #666;
    color: #fff;
    font-size: 4vw;
    margin-right: 4vw;
    display: flex;
    justify-content: center;
    align-items: center;
}
.wrapper .business li .business-info .business-info-star {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-bottom: 2vw;
    font-size: 3.1vw;
}
.wrapper
    .business
    li
    .business-info
    .business-info-star
    .business-info-star-left {
    display: flex;
    align-items: center;
}
.wrapper
    .business
    li
    .business-info
    .business-info-star
    .business-info-star-left
    .fa-star {
    color: #fec80e;
    margin-right: 0.5vw;
}
.wrapper
    .business
    li
    .business-info
    .business-info-star
    .business-info-star-left
    p {
    color: #666;
    margin-left: 1vw;
}
.wrapper
    .business
    li
    .business-info
    .business-info-star
    .business-info-star-right {
    background-color: #ffae00;
    color: #fff;
    font-size: 2.4vw;
    border-radius: 2px;
    padding: 0 0.6vw;
}
.wrapper .business li .business-info .business-info-delivery {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-bottom: 2vw;
    color: #666;
    font-size: 3.1vw;
}
.wrapper .business li .business-info .business-info-explain {
    display: flex;
    align-items: center;
    /* margin-bottom: 3vw; */
    justify-content: space-between;
}
.wrapper .business li .business-info .business-info-explain div {
    border: solid 1px #ddd;
    font-size: 2.8vw;
    color: #666;
    border-radius: 3px;
    padding: 0 0.1vw;
}
.wrapper .business li .business-info .business-info-promotion {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-bottom: 1.8vw;
}
.wrapper
    .business
    li
    .business-info
    .business-info-promotion
    .business-info-promotion-left {
    display: flex;
    align-items: center;
}
.wrapper
    .business
    li
    .business-info
    .business-info-promotion
    .business-info-promotion-left
    .business-info-promotion-left-incon {
    width: 4vw;
    height: 4vw;
    background-color: #70bc46;
    border-radius: 3px;
    font-size: 3vw;
    color: #fff;
    display: flex;
    justify-content: center;
    align-items: center;
}
.wrapper
    .business
    li
    .business-info
    .business-info-promotion
    .business-info-promotion-left
    p {
    color: #666;
    font-size: 3vw;
    margin-left: 2vw;
}
.wrapper
    .business
    li
    .business-info
    .business-info-promotion
    .business-info-promotionright {
    display: flex;
    align-items: center;
    font-size: 2.5vw;
    color: #999;
}
.wrapper
    .business
    li
    .business-info
    .business-info-promotion
    .business-info-promotion-right
    p {
    margin-right: 2vw;
}
</style>