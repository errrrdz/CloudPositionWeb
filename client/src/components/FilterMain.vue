<template>
  <div>
    <!--    条件1-->
    <a name="a"></a>
    <div>
      <div><strong>实习时长</strong>（单选）</div>
      <el-row :gutter="20">
        <el-col :span="6">不限</el-col>
        <el-col :span="6">1天</el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="6">2天</el-col>
        <el-col :span="6">3天</el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="6">4天</el-col>
        <el-col :span="6">5天及以上</el-col>
      </el-row>
    </div>
    <!--    条件2-->
    <a name="b"></a>
    <div>
      <div><strong>每周出勤天数</strong>（单选）</div>
      <el-row :gutter="20">
        <el-col :span="6">不限</el-col>
        <el-col :span="6">1天</el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="6">2天</el-col>
        <el-col :span="6">3天</el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="6">4天</el-col>
        <el-col :span="6">5天及以上</el-col>
      </el-row>
    </div>
    <!--    条件3-->
    <a name="c"></a>
    <div>
      <div><strong>日薪</strong>（单选）</div>
      <el-row :gutter="20">
        <el-col :span="6">不限</el-col>
        <el-col :span="6">100以下</el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="6">100-150</el-col>
        <el-col :span="6">150-200</el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="6">200-300</el-col>
        <el-col :span="6">300以上</el-col>
      </el-row>
    </div>
    <!--    条件4-->
    <a name="d"></a>
    <div>
      <div><strong>学历要求</strong></div>
      <el-row :gutter="20">
        <el-col :span="6">不限</el-col>
        <el-col :span="6">初中及以下</el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="6">中专/中技</el-col>
        <el-col :span="6">高中</el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="6">大专</el-col>
        <el-col :span="6">本科</el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="6">硕士</el-col>
        <el-col :span="6">博士</el-col>
      </el-row>
    </div>
    <!--    条件5-->
    <a name="e"></a>
    <div>
      <div><strong>行业分类</strong></div>
      <el-row :gutter="20">
        <el-col :span="6">不限</el-col>
        <el-col :span="6">电子商务</el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="6">游戏</el-col>
        <el-col :span="6">媒体</el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="6">广告营销</el-col>
        <el-col :span="6">数据服务</el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="6">医疗健康</el-col>
        <el-col :span="6">生活服务</el-col>
      </el-row>
    </div>
    <!--    条件6-->
    <a name="f"></a>
    <div>
      <div><strong>公司规模</strong></div>
      <el-row :gutter="20">
        <el-col :span="6">不限</el-col>
        <el-col :span="6">0-20人</el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="6">20-99人</el-col>
        <el-col :span="6">100-499人</el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="6">500-999人</el-col>
        <el-col :span="6">1000-9999人</el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="6">10000人以上</el-col>
      </el-row>
    </div>
    <!--    条件7-->
    <a name="g"></a>
    <div>
      <div><strong>融资阶段</strong></div>
      <el-row :gutter="20">
        <el-col :span="6">不限</el-col>
        <el-col :span="6">未融资</el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="6">天使轮</el-col>
        <el-col :span="6">A轮</el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="6">B轮</el-col>
        <el-col :span="6">C轮</el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="6">D轮及以上</el-col>
        <el-col :span="6">已上市</el-col>
      </el-row>
      <el-row :gutter="20">
        <el-col :span="6">不需要融资</el-col>
      </el-row>
    </div>
  </div>
</template>

<script>
export default {
  name: "FilterMain"
}
</script>

<style scoped>
/*.el-row {*/
/*  margin-bottom: 20px;*/
/*}*/
.el-row:last-child {
  margin-bottom: 0;
}
.el-col {
  border-radius: 4px;
}

.grid-content {
  border-radius: 4px;
  min-height: 36px;
}

.el-col-6{
  width: 140px;
  text-align: center;
  padding-top: 10px;
  padding-bottom: 10px;
  background-color: #8492a6;
  margin: 10px;
}
.el-col-6:hover{
  background-color: white;
}
</style>