<template>
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
          <side-bar></side-bar>
        </el-aside>
        <el-main style="padding-left: 170px">
          <filter-main></filter-main>
        </el-main>
      </el-container>
    </el-container>



  </div>
</template>

<script>
  import SideBar from "../components/SideBar";
  import FilterMain from "../components/FilterMain";
export default {
  name: "Filter",
  components: {FilterMain, SideBar},
  methods:{
    toIndex() {
      this.$router.push({
        path:"index"
      })
    }
  }
}
</script>

<style scoped>

</style>