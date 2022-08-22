<template>
    <div>
        <!--    条件1-->
        <a name="a"></a>
        <div>
            <div><strong>实习时长</strong>（单选）</div>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.InternshipDays=='不限'}">
                    <span @click="addLabel('InternshipDays','不限')">不限</span>
                </el-col>
                <el-col :span="6" :class="{'active':activeLabel.InternshipDays=='1天'}">
                    <span @click="addLabel('InternshipDays','1天')">1天</span>
                </el-col>
            </el-row>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.InternshipDays=='2天'}">
                    <span @click="addLabel('InternshipDays','2天')">2天</span>
                </el-col>
                <el-col :span="6" @click="addLabel('InternshipDays','3天')" :class="{'active':activeLabel.InternshipDays=='3天'}">
                    <span @click="addLabel('InternshipDays','3天')">3天</span>
                </el-col>
            </el-row>
            <el-row :gutter="20">
                <el-col :span="6" @click="addLabel('InternshipDays','4天')" :class="{'active':activeLabel.InternshipDays=='4天'}">
                    <span @click="addLabel('InternshipDays','4天')">4天</span>
                </el-col>
                <el-col :span="6" @click="addLabel('InternshipDays','5天及以上')" :class="{'active':activeLabel.InternshipDays=='5天及以上'}">
                    <span @click="addLabel('InternshipDays','5天及以上')">5天及以上</span>
                </el-col>
            </el-row>
        </div>
        <!--    条件2-->
        <a name="b"></a>
        <div>
            <div><strong>每周出勤天数</strong>（单选）</div>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.workDays=='不限'}">
                    <span @click="addLabel('workDays','不限')">不限</span>
                </el-col>
                <el-col :span="6" :class="{'active':activeLabel.workDays=='1天'}">
                    <span @click="addLabel('workDays','1天')">1天</span>
                </el-col>
            </el-row>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.workDays=='2天'}">
                    <span @click="addLabel('workDays','2天')">2天</span>
                </el-col>
                <el-col :span="6" :class="{'active':activeLabel.workDays=='3天'}">
                    <span @click="addLabel('workDays','3天')">3天</span>
                </el-col>
            </el-row>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.workDays=='4天'}">
                    <span @click="addLabel('workDays','4天')">4天</span>
                </el-col>
                <el-col :span="6" :class="{'active':activeLabel.workDays=='5天及以上'}">
                    <span @click="addLabel('workDays','5天及以上')">5天及以上</span>
                </el-col>
            </el-row>
        </div>
        <!--    条件3-->
        <a name="c"></a>
        <div>
            <div><strong>日薪</strong>（单选）</div>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.dailyWage=='不限'}">
                    <span @click="addLabel('dailyWage','不限')">不限</span>
                </el-col>
                <el-col :span="6" :class="{'active':activeLabel.dailyWage=='100以下'}">
                    <span @click="addLabel('dailyWage','100以下')">100以下</span>
                </el-col>
            </el-row>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.dailyWage=='100-150'}">
                    <span @click="addLabel('dailyWage','100-150')">100-150</span>
                </el-col>
                <el-col :span="6" :class="{'active':activeLabel.dailyWage=='150-200'}">
                    <span @click="addLabel('dailyWage','150-200')">150-200</span>
                </el-col>
            </el-row>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.dailyWage=='200-300'}">
                    <span @click="addLabel('dailyWage','200-300')">200-300</span>
                </el-col>
                <el-col :span="6" :class="{'active':activeLabel.dailyWage=='300以上'}">
                    <span @click="addLabel('dailyWage','300以上')">300以上</span>
                </el-col>
            </el-row>
        </div>
        <!--    条件4-->
        <a name="d"></a>
        <div>
            <div><strong>学历要求</strong></div>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.eduBackground=='不限'}">
                    <span @click="addLabel('eduBackground','不限')">不限</span>
                </el-col>
                <el-col :span="6" :class="{'active':activeLabel.eduBackground=='初中及以下'}">
                    <span @click="addLabel('eduBackground','初中及以下')">初中及以下</span>
                </el-col>
            </el-row>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.eduBackground=='中专'}">
                    <span @click="addLabel('eduBackground','中专')">中专</span>
                </el-col>
                <el-col :span="6" :class="{'active':activeLabel.eduBackground=='高中'}">
                    <span @click="addLabel('eduBackground','高中')">高中</span>
                </el-col>
            </el-row>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.eduBackground=='大专'}">
                    <span @click="addLabel('eduBackground','大专')">大专</span>
                </el-col>
                <el-col :span="6" :class="{'active':activeLabel.eduBackground=='本科'}">
                    <span @click="addLabel('eduBackground','本科')">本科</span>
                </el-col>
            </el-row>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.eduBackground=='硕士'}">
                    <span @click="addLabel('eduBackground','硕士')">硕士</span>
                </el-col>
                <el-col :span="6" :class="{'active':activeLabel.eduBackground=='博士'}">
                    <span @click="addLabel('eduBackground','博士')">博士</span>
                </el-col>
            </el-row>
        </div>
        <!--    条件5-->
        <a name="e"></a>
        <div>
            <div><strong>行业分类</strong></div>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.Industry=='不限'}">
                    <span @click="addLabel('Industry','不限')">不限</span>
                </el-col>
                <el-col :span="6" :class="{'active':activeLabel.Industry=='电子商务'}">
                    <span @click="addLabel('Industry','电子商务')">电子商务</span>
                </el-col>
            </el-row>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.Industry=='游戏'}">
                    <span @click="addLabel('Industry','游戏')">游戏</span>
                </el-col>
                <el-col :span="6" :class="{'active':activeLabel.Industry=='媒体'}">
                    <span @click="addLabel('Industry','媒体')">媒体</span>
                </el-col>
            </el-row>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.Industry=='广告营销'}">
                    <span @click="addLabel('Industry','广告营销')">广告营销</span>
                </el-col>
                <el-col :span="6" :class="{'active':activeLabel.Industry=='数据服务'}">
                    <span @click="addLabel('Industry','数据服务')">数据服务</span>
                </el-col>
            </el-row>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.Industry=='医疗健康'}">
                    <span @click="addLabel('Industry','医疗健康')">医疗健康</span>
                </el-col>
                <el-col :span="6" :class="{'active':activeLabel.Industry=='生活服务'}">
                    <span @click="addLabel('Industry','生活服务')">生活服务</span>
                </el-col>
            </el-row>
        </div>
        <!--    条件6-->
        <a name="f"></a>
        <div>
            <div><strong>公司规模</strong></div>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.companySize=='不限'}">
                    <span @click="addLabel('companySize','不限')">不限</span>
                </el-col>
                <el-col :span="6" :class="{'active':activeLabel.companySize=='0-20人'}">
                    <span @click="addLabel('companySize','0-20人')">0-20人</span>
                </el-col>
            </el-row>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.companySize=='20-99人'}">
                    <span @click="addLabel('companySize','20-99人')">20-99人</span>
                </el-col>
                <el-col :span="6" :class="{'active':activeLabel.companySize=='100-499人'}">
                    <span @click="addLabel('companySize','100-499人')">100-499人</span>
                </el-col>
            </el-row>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.companySize=='500-999人'}">
                    <span @click="addLabel('companySize','500-999人')">500-999人</span>
                </el-col>
                <el-col :span="6" :class="{'active':activeLabel.companySize=='1000-9999人'}">
                    <span @click="addLabel('companySize','1000-9999人')">1000-9999人</span>
                </el-col>
            </el-row>
            <el-row :gutter="20">
                <el-col :span="6" :class="{'active':activeLabel.companySize=='10000人以上'}">
                    <span @click="addLabel('companySize','10000人以上')">10000人以上</span>
                </el-col>
            </el-row>
        </div>
        <el-footer style="position: fixed;padding:0;bottom:0;height: 82px;left: 6px">
            <el-card class="box-card">
                <span>
                    <el-button @click="clean" style="margin-right: 20px;margin-left: 50px;width: 100px;font-size: large">清除</el-button>
                </span>
                <span>
                    <el-button @click="sendMsg" style="width: 250px;background-color: #d3dce6;font-size: large">选好了</el-button>
                </span>
            </el-card>
        </el-footer>
    </div>
</template>

<script>
export default {
    name: "FilterMain",
    data() {
        return {
            activeLabel: {
                InternshipDays: "",
                workDays: "",
                dailyWage: "",
                eduBackground: "",
                Industry: "",
                companySize: "",
            },
        };
    },
    methods: {
        addLabel(type, value) {
            this.activeLabel[type] = value;
            // console.log(this.activeLabel)
        },
        sendMsg() {
            this.$emit("func", this.activeLabel);
        },
        clean() {
            let obj = Object.keys(this.activeLabel);
            for (let i = 0; i < obj.length; i++) {
                this.activeLabel[obj[i]] = " ";
            }
        },
    },
};
</script>

<style scoped>
/*.el-row {*/
/*  margin-bottom: 20px;*/
/*}*/
.demo-button-style {
    margin-top: 24px;
}
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

.el-col-6 {
    width: 140px;
    text-align: center;
    padding-top: 10px;
    padding-bottom: 10px;
    background-color: #8492a6;
    margin: 10px;
}

.el-col-6.active {
    color: white;
    background-color: #666666;
}
</style>