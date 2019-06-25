<template>
  <div id="editProduct" class="right-items" style="float: conter;">
      
      <div class="right-items" style="float: right;">
          <el-button class="filter-item" type="danger" size="small" @click="backProduct"  round>返回首页</el-button>
      </div>
      <br/><br/>
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
            <br/><br/><br/><br/>
            <div class="right-items" style="float: right;">
                <el-form-item>
                    <el-button type="primary" size="small" @click="onSubmit" round>立即修改</el-button>
                </el-form-item>
            </div>
        </el-form>

        
  </div>
</template>

<script type="text/ecmascript-6">
import urlapi from '../const/url'
export default {
  name:'editProduct', 
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
       this.$http.put("/product/" + this.product.id, this.product).then(response => {
           if (response.data.status == 'success') {
               this.$message.success("修改成功");
               this.$router.push("/");
           }else {
               this.$message.error(response.data.message)
           }
       }).catch(error => {
           this.$message.error("系统提示:" + error.message);
       })
    }
  },
  mounted() {
      var id = this.$route.params.id;
      this.$http.get("/product/" + id).then(response =>{
          this.product = response.data.result;
      }).catch(error =>{
          this.$message.error("系统提示:" + error.message);
      })
  },
}
</script>

<style scoped lang="less">
</style>
