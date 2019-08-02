<template>
  <el-form style="margin-top:20px" ref="form" :model="account" label-width="80px">
    <el-form-item label="accountMobile">
      <el-input v-model="account.accountMobile"></el-input>
    </el-form-item>
    <el-form-item label="accountPassword">
      <el-input type="password" v-model="account.accountPassword"></el-input>
    </el-form-item>

    <div class="right-items" style="float: right;">
      <el-button type="primary" @click="onSubmit" size="small">登录</el-button>
    </div>
  </el-form>
</template>

<script type="text/ecmascript-6">
export default {
  name: "Login",
  data() {
    return {
      account: {}
    };
  },
  methods: {
    onSubmit: function() {
      this.$http
        .post("/login", this.account)
        .then(response => {
          var token = localStorage.getItem("token");
          if (response.data.status == "success") {
            var token = response.data.result;
            window.localStorage.setItem("jwtToken", token);
            this.$message.success("登录成功");
            this.$router.push("/List");
          } else {
            this.$message.error(response.data.message);
          }
        })
        .catch(error => {
          this.$message.error(error.message);
        });
    }
  }
};
</script>

<style lang="less" scoped>
#Login {
  width: 400px;
  margin: 0px auto;
}
</style>