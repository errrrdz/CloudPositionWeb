<template>

    <body>
        <div class="wrapper">
            <!-- header部分 -->
            <header>
                <p>用户注册</p>
            </header>
            <!-- 表单部分 -->
            <ul class="form-box">
                <li>
                    <div class="title">
                        手机号码：
                    </div>
                    <div class="content">
                        <input type="text" v-model="phone" placeholder="手机号码">
                    </div>
                </li>
                <li>
                    <div class="title">
                        密码：
                    </div>
                    <div class="content">
                        <input type="password" v-model="password" placeholder="密码">
                    </div>
                </li>
                <li>
                    <div class="title">
                        确认密码：
                    </div>
                    <div class="content">
                        <input type="password" v-model="confirmPassword" placeholder="确认密码">
                    </div>
                </li>
                <li>
                    <div class="title">
                        性别：
                    </div>
                    <div class="content" style="font-size: 3vw;">
<!--                      选择性别-->
                      <template>
                        <el-radio v-model="sex" label="男">男</el-radio>
                        <el-radio v-model="sex" label="女">女</el-radio>
                      </template>
                    </div>
                </li>
            </ul>
            <div class="button-login">
                <button @click="saveRegister">注册</button>
            </div>
            <div class="button-register">
                <button @click="toLogin">登陆</button>
            </div>
            <!-- 底部菜单部分 -->
            <Footer></Footer>
        </div>
        <el-dialog
            title="提示"
            :visible.sync="centerDialogVisible"
            width="30%"
            center>
          <span>{{msg}}</span>
          <span slot="footer" class="dialog-footer">
    <el-button type="primary" @click="centerDialogVisible = false">确 定</el-button>
  </span>
        </el-dialog>
    </body>
</template>

<script>
import Footer from "../components/Footer.vue";
export default {
    name: "Register",
    data() {
        return {
          msg: '',
          centerDialogVisible: false,
          phone: "",
          password: '',
          sex:"男",
          //确认密码
          confirmPassword:''
        };
    },
    methods: {
      //正则校验手机号
      validatePhone(mobile){
        const phone = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;
        if(mobile.length == 11){//手机号码
          if(phone.test(mobile)) {
            return true;
          }
        }else{
          return false;
        }
      },
        saveRegister() {
          if (this.password!==this.confirmPassword){
            this.msg="两次输入密码不一样"
            this.centerDialogVisible=true
            return
          }
          if ((!this.validatePhone(this.phone))){
            this.msg="手机号码格式不正确"
            this.centerDialogVisible=true
          }
          console.log(this.phone,this.password,this.confirmPassword,this.sex)
        },
      toLogin() {
          this.$router.push({
              path: "/login",
              query: {},
          });
      }
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
/****************** 表单部分 ******************/
.wrapper .form-box {
    width: 100%;
    margin-top: 12vw;
}
.wrapper .form-box li {
    box-sizing: border-box;
    padding: 4vw 3vw 0 3vw;
    display: flex;
    align-items: center;
}
.wrapper .form-box li .title {
    flex: 0 0 18vw;
    font-size: 3vw;
    font-weight: 700;
    color: #666;
}
.wrapper .form-box li .content {
    flex: 1;
}
.wrapper .form-box li .content input {
    border: none;
    outline: none;
    width: 100%;
    height: 4vw;
    font-size: 3vw;
}
.wrapper .button-login {
    width: 100%;
    box-sizing: border-box;
    padding: 4vw 3vw 0 3vw;
}
.wrapper .button-login button {
    width: 100%;
    height: 10vw;
    font-size: 3.8vw;
    font-weight: 700;
    color: #fff;
    background-color: #38ca73;
    border-radius: 4px;
    border: none;
    outline: none;
}
.wrapper .button-register {
    width: 100%;
    box-sizing: border-box;
    padding: 4vw 3vw 0 3vw;
}
.wrapper .button-register button {
    width: 100%;
    height: 10vw;
    font-size: 3.8vw;
    font-weight: 700;
    color: #666;
    background-color: #eee;
    border-radius: 4px;
    border: none;
    outline: none;
    border: solid 1px #ddd;
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
