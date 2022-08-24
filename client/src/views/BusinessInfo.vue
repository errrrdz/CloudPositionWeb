 <template>
    <div class="wrapper">
        <!-- header部分 -->
        <header>
            <p>公司信息</p>
        </header>
        <!-- 商家logo部分 -->
        <div class="business-logo">
            <img src="../assets/sj01.png">
        </div>
        <!-- 商家信息部分 -->
        <div class="business-info">
            <h1>{{ BusinessInfo.name }}</h1>
            <p>{{ BusinessInfo.details }}</p>
        </div>
        <!-- 食品列表部分 -->
        <ul class="position">
            <li v-for="(position, index) in positionlist" :key="index">
                <div class="position-left">
                    <!-- <img :src=position.img> -->
                    <div class="position-left-info">
                        <h3>{{ position.name }}</h3>
                        <p>{{ position.detail }}</p>
                        <p>{{ position.price }}</p>
                    </div>
                </div>
                <div class="position-right">
                    <div class="position-right-item" @click="plusToOrder(position.id)">
                        {{ nextPositionArr.includes(position.id) ? '已添加' : '添加' }}
                    </div>
                    <div class="position-right-item" @click="reduceToOrder(position.id)">
                        删除
                    </div>
                </div>
            </li>
        </ul>

        <div class="cart">
            <div class="cart-left">
                <div class="cart-left-icon">
                    <i class="fa fa-shopping-cart"></i>
                    <!-- <div class="cart-left-icon-quantity">{{getCount}}</div> -->
                </div>
                <div class="cart-left-info">
                    <p>共有 {{ nextPositionArr.length }} 份记录</p>
                    <p>请确认</p>
                </div>
            </div>
            <div class="cart-right">
                <div class="cart-right-item" @click="toOrderList(nextPositionArr)">
                    提交
                </div>
            </div>
        </div>
    </div>
</template>

<script>
import store from "../store/index";
export default {
    name: "BusinessInfo",
    data() {
        return {
            nextPositionArr: [],
            userInfo: "",
            BusinessId: "",
            BusinessInfo: [],
            positionlist: [],
            positionNum: 0,
        };
    },
    created() {
        this.userInfo = store.state.userInfo;
        this.BusinessId = this.$route.query.BusinessId;
        this.$axios
            .get("/companies", { id: this.BusinessId })
            .then((response) => {
                this.BusinessInfo = response.data.data;
                console.log(response);
            });
        this.$axios
            .post("/positions/search", {
                company_id: this.BusinessId,
            })
            .then((response) => {
                console.log(response.data.data);
                this.positionlist = response.data.data;
            });
    },
    filters: {},
    methods: {
        toOrderList(positionArr) {
            for (let i = 0; i < positionArr.length; i++) {
                this.$axios
                    .post("/userposition", {
                        positionId: positionArr[i],
                        username: this.userInfo.username,
                    })
                    .then((response) => {
                        console.log(response);
                    });
            }

            this.$router.push({
                path: "orderList",
            });
        },
        plusToOrder(pid) {
            if (this.nextPositionArr.includes(pid)) {
                this.$message({
                    message: "已添加,不可再次添加",
                    type: "error",
                });
            } else {
                this.nextPositionArr.push(pid);
                this.$message({
                    message: "添加成功",
                    type: "success",
                });
            }

            console.log("添加记录");
        },
        reduceToOrder(pid) {
            if (this.nextPositionArr.includes(pid)) {
                this.$message({
                    message: "删除成功",
                    type: "success",
                });
                const index = this.nextPositionArr.indexOf(pid);
                console.log(index);
                this.nextPositionArr.splice(index, 1);
                console.log(this.nextPositionArr);
            } else {
                this.$message({
                    message: "删除失败,未添加",
                    type: "error",
                });
            }
        },
    },
    mounted() {},
    beforeDestroy() {},
    computed: {},
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
/****************** 商家logo部分 ******************/
.wrapper .business-logo {
    width: 100%;
    height: 35vw;
    /*使用上外边距避开header部分*/
    margin-top: 12vw;
    display: flex;
    justify-content: center;
    align-items: center;
}
.wrapper .business-logo img {
    width: 40vw;
    height: 30vw;
    border-radius: 5px;
}
/****************** 商家信息部分 ******************/
.wrapper .business-info {
    width: 100%;
    height: 20vw;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
}
.wrapper .business-info h1 {
    font-size: 5vw;
}
.wrapper .business-info p {
    font-size: 3vw;
    color: #666;
    margin-top: 1vw;
}
/****************** 食品列表部分 ******************/
.wrapper .position {
    width: 100%;
    /*使用下外边距避开footer部分*/
    margin-bottom: 14vw;
}
.wrapper .position li {
    width: 100%;
    box-sizing: border-box;
    padding: 2.5vw;
    user-select: none;
    display: flex;
    justify-content: space-between;
    align-items: center;
}
.wrapper .position li .position-left {
    display: flex;
    align-items: center;
}
.wrapper .position li .position-left img {
    width: 20vw;
    height: 20vw;
}
.wrapper .position li .position-left .position-left-info {
    margin-left: 3vw;
}
.wrapper .position li .position-left .position-left-info h3 {
    font-size: 3.8vw;
    color: #555;
}
.wrapper .position li .position-left .position-left-info p {
    font-size: 3vw;
    color: #888;
    margin-top: 2vw;
}
.wrapper .position li .position-right {
    /* width: 16vw; */
    display: flex;
    justify-content: space-between;
    align-items: center;
}
.wrapper .position li .position-right .position-right-item {
    width: 14vw;
    height: 8vw;
    text-align: center;
    line-height: 8vw;
    color: #fff;
}
.wrapper .position li .position-right .position-right-item:nth-child(1) {
    background-color: #38ca73;
}
.wrapper .position li .position-right .position-right-item:nth-child(2) {
    background-color: #d21414;
}
.wrapper .position li .position-right .fa-minus-circle {
    font-size: 5.5vw;
    color: #999;
    cursor: pointer;
}
.wrapper .position li .position-right p {
    font-size: 3.6vw;
    color: #333;
}
.wrapper .position li .position-right .fa-plus-circle {
    font-size: 5.5vw;
    color: #0097ef;
    cursor: pointer;
}
/****************** 购物车部分 ******************/
.wrapper .cart {
    width: 100%;
    height: 14vw;
    position: fixed;
    left: 0;
    bottom: 0;
    display: flex;
}
.wrapper .cart .cart-left {
    flex: 2;
    background-color: #505051;
    display: flex;
}
.wrapper .cart .cart-left .cart-left-icon {
    width: 16vw;
    height: 16vw;
    box-sizing: border-box;
    border: solid 1.6vw #444;
    border-radius: 8vw;
    background-color: #3190e8;
    font-size: 7vw;
    color: #fff;
    display: flex;
    justify-content: center;
    align-items: center;
    margin-top: -4vw;
    margin-left: 3vw;
    position: relative;
}
.wrapper .cart .cart-left .cart-left-icon-quantity {
    width: 5vw;
    height: 5vw;
    border-radius: 2.5vw;
    background-color: red;
    color: #fff;
    font-size: 3.6vw;
    display: flex;
    justify-content: center;
    align-items: center;
    position: absolute;
    right: -1.5vw;
    top: -1.5vw;
}
.wrapper .cart .cart-left .cart-left-info p:first-child {
    font-size: 4.5vw;
    color: #fff;
    margin-top: 1vw;
}
.wrapper .cart .cart-left .cart-left-info p:last-child {
    font-size: 2.8vw;
    color: #aaa;
}
.wrapper .cart .cart-right {
    flex: 1;
}
/*达到起送费时的样式*/
.cart-right-item {
    width: 100%;
    height: 100%;
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
/*不够起送费时的样式（只有背景色和鼠标样式的区别）*/
/*
.wrapper .cart .cart-right .cart-right-item{
width: 100%;
height: 100%;
background-color: #535356;
color: #fff;
font-size: 4.5vw;font-weight: 700;
user-select: none;
display: flex;
justify-content: center;
align-items: center;
}
*/
</style>
 