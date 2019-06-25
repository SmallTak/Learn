<template>
  <div id="addProduct">
        <div class="right-items" style="float: right;">
            <el-button class="filter-item" type="danger" size="small" @click="backProduct"  round>返回首页</el-button>
        </div>
        <br>
      <el-form style="margin-top:20px" ref="form" :model="product" label-width="80px">
            <el-form-item label="耳机名称">
                <el-input v-model="product.productName"></el-input>
            </el-form-item>
            <el-form-item label="耳机价格">
                <el-input v-model="product.price"></el-input>
            </el-form-item>
            <el-form-item label="市场价格">
                <el-input v-model="product.marketPrice"></el-input>
            </el-form-item>
            <el-form-item label="产品产地" prop="travelStartTime">
                <el-input v-model="product.place"></el-input>
            </el-form-item>
            
            <el-form-item>
                <el-button type="primary" @click="onSubmit">立即创建</el-button>
            </el-form-item>
        </el-form>
  </div>
</template>

<script type="text/ecmascript-6">
import urlapi from '../const/url'
export default {
  name:'addProduct', 
  data() {
    return {
        product:{}
    }
  },
  methods: {
    backProduct:function () {
         this.$router.push("/Home");
    },
    onSubmit:function () {
        this.$http.post(urlapi.addproduct,this.product).then(response => {
            if (response.data.status == 'success') {
                this.$message({
                    message:"添加成功",
                    type:'success'
                });
                this.$router.push("/");
            } else{
                this.$message.error(response.data.message)
            }
        }).catch(error =>{
            this.$message.error("系统提示:" + error.message);
        })
    }
  },
}
</script>

<style scoped lang="less">
</style>
