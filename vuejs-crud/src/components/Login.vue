<template>
  <div id="Login">
    <br />
    <br />
    <br />
    <br />
    <br />
    <br />
    <br />
    <br />
    <el-form
      style="margin-top:20px"
      ref="form"
      :rules="formtheadAllianceChaRules"
      :model="account"
      label-width="80px"
    >
      <el-form-item label="username" prop="username">
        <el-input v-model="account.userName"></el-input>
      </el-form-item>
      <el-form-item label="password" prop="password">
        <el-input type="password" v-model="account.password"></el-input>
      </el-form-item>

      <div class="right-items" style="float: right;">
        <el-button type="primary" @click="onSubmit" size="small">登录</el-button>
      </div>
    </el-form>
  </div>
</template>

<script type="text/ecmascript-6">
export default {
  name: "Login",
  data() {
    //   let usernameRules = (rule, value, callback) => {
    //   let reg =/^(0|86|17951)?(13[0-9]|15[012356789]|16[6]|17[0123456789]|18[0-9]|14[57]|19[89])[0-9]{8}$/;
    //   if (!reg.test(value)) {
    //     callback(new Error("手机号输入有误，请重新输入"));
    //   } else {
    //     callback();
    //   }
    // };
    let passwordRules = (rule, value, callback) => {
      let reg =/[A-Za-z].*[0-9]|[0-9].*[A-Za-z]/;
      if (!reg.test(value)) {
        callback(new Error("密码输入有误，请重新输入"));
      } else {
        callback();
      }
    };
    return {
      account: {},
      //表单验证
      formtheadAllianceChaRules: {
        //   username: [
        //   { required: true, message: "手机号输入有误，请重新输入?", trigger: "blur" },
        //   { validator: usernameRules, trigger: "blur" }
        // ],
        password: [
          { required: true, message: "密码输入有误，请重新输入", trigger: "blur" },
        //   { min: 1, max: 7, message: "长度在 1 到 7 个字符", trigger: "blur" },
          { validator: passwordRules, trigger: 'blur' }
        ]
      }
    };
  },
  methods: {
    onSubmit: function() {
      this.$refs.form.validate(valid => {
        if (valid) {
          //通过验证后执行的操作
          this.$http
            .post("/login", this.account)
            .then(response => {
              var token = localStorage.getItem("token");
              if (response.data.status == "success") {
                var token = response.data.result;
                window.localStorage.setItem("jwtToken", token);
                this.$message.success("登录成功");
                this.$router.push("/Home");
              } else {
                this.$message.error(response.data.message);
              }
            })
            .catch(error => {
              this.$message.error(error.message);
            });
        }
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