<template>
  <div id="Edit" class="right-items" style="float: conter;">
      <div id="editProduct" class="right-items" style="float: conter;">
      
      <el-form style="margin-top:20px" ref="form" :model="punish" label-width="80px">
            <el-form-item label="耳机名称">
                <el-input v-model="punish.cfWsh"></el-input>
            </el-form-item>
            
            <br/><br/><br/><br/>
            <div class="right-items" style="float: right;">
                <el-form-item>
                    <el-button type="primary" size="small" @click="onSubmit" round>立即修改</el-button>
                </el-form-item>
            </div>
        </el-form>

        
  </div>
  </div>
</template>

<script type="text/ecmascript-6">
import urlapi from "../const/url";
export default {
  name: "Edit",
  data() {
    return {
      punish:{}
    };
  },
  methods:{
    onSubmit:function () {
        
    }
  },
   mounted() {
      var id = this.$route.params.id;
      alert(id);
      this.$http.get("public/" + id).then(response =>{
          this.punish = response.data.result;
          alert(this.punish.cfWsh)
      }).catch(error =>{
          this.$message.error("系统提示:" + error.message);
      })
  },
  components: {}
};
</script>

<style scoped lang="less">
</style>
