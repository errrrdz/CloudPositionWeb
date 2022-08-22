<template>
  <div>
    <div class="common-layout">
      <el-container>
        <!--      头部-->
        <el-header>
          <div>
            <span @click="toIndex"><i class="el-icon-close" style="font-size: x-large;padding-top: 10px"></i></span>
            <span style="font-size: 4vw;padding-left: 237px"><strong>筛选</strong></span>
          </div>
        </el-header>
        <!--      侧边栏和主页-->
        <el-container>
          <el-aside style="overflow:hidden;width: 150px;position: fixed">
            <el-side-bar></el-side-bar>
          </el-aside>
          <el-main style="padding-left: 160px;padding-bottom: 82px">
            <el-filter-main @func="getForm"></el-filter-main>
          </el-main>
        </el-container>
      </el-container>
    </div>
  </div>
</template>

<script>
import SideBar from "../components/SideBar";
import FilterMain from "../components/FilterMain";
export default {
  name: "Filter",
  components: {'el-filter-main':FilterMain,'el-side-bar':SideBar},
  data(){
    return{
      selectedMsg:{},
    }
  },
  methods:{
    toIndex() {
      this.$router.push({
        path:"index"
      })
    },

    // 子组件选择参数传给筛选页
    getForm(data){
      this.selectedMsg = data;
      console.log(this.selectedMsg)
    },
  }
}
</script>

<style scoped>
.text {
  font-size: 14px;
}

.item {
  padding: 18px 0;
}

.box-card {
  width: 480px;
}
</style>