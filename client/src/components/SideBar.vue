<template>
  <div style="width: 270px">
    <el-col :span="12">
      <el-menu
          default-active="2"
          class="el-menu-vertical-demo">
        <el-menu-item index="1">
          <i class="el-icon-alarm-clock"></i>
          <span slot="title"><a href="#a">时长</a></span>
        </el-menu-item>
        <el-menu-item index="2">
          <i class="el-icon-s-order"></i>
          <span slot="title"><a href="#b">出勤天数</a></span>
        </el-menu-item>
        <el-menu-item index="3">
          <i class="el-icon-coin"></i>
          <span slot="title"><a href="#c">日薪</a></span>
        </el-menu-item>
        <el-menu-item index="4">
          <i class="el-icon-user"></i>
          <span slot="title"><a href="#d">学历</a></span>
        </el-menu-item>
        <el-menu-item index="5">
          <i class="el-icon-s-cooperation"></i>
          <span slot="title"><a href="#e">行业</a></span>
        </el-menu-item>
        <el-menu-item index="6">
          <i class="el-icon-s-data"></i>
          <span slot="title"><a href="#f">公司规模</a></span>
        </el-menu-item>
        <el-menu-item index="7">
          <i class="el-icon-data-line"></i>
          <span slot="title"><a href="#g">融资</a></span>
        </el-menu-item>
      </el-menu>
    </el-col>
  </div>
</template>

<script>
export default {
  name: "SideBar",
}
</script>

<style scoped>

</style>