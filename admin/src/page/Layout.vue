<template>
  <!-- <el-radio-group v-model="isCollapse" style="margin-bottom: 50px;">
        <el-radio-button :label="true">ON</el-radio-button>
        <el-radio-button :label="false">OFF</el-radio-button>
  </el-radio-group>-->
  <el-row class="tac">
    <el-col :span="12">
      <el-menu
        default-active="1-4-1"
        class="el-menu-vertical-demo"
        @open="handleOpen"
        @close="handleClose"
        :collapse="isCollapse">
        <el-menu-item index="1" @click="changePage">
          <i class="el-icon-location"></i>
          <span slot="title">用户</span>
        </el-menu-item>
        <el-menu-item index="2" >
          <i class="el-icon-menu"></i>
          <span slot="title">角色</span>
        </el-menu-item>
        <el-menu-item index="3">
          <i class="el-icon-setting"></i>
          <span slot="title">权限</span>
        </el-menu-item>
      </el-menu>
    </el-col>
  </el-row>
</template>

<script>
import urlapi from '../const/url'

export default {
  name: "Layout",
  data() {
    return {
      isCollapse: false
    };
  },
  components: {
    // List: {
    //   template: "/List"
    // }
  },
  methods: {
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    },
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    changePage() {
      this.$router.push("/List");
    }
    ,
    changePageEdit() {
      this.$router.push("/Edit");
    }
  }
};
</script>

<style scoped lang="less">
.el-menu-vertical-demo:not(.el-menu--collapse) {
  width: 160px;
  min-height: 400px;
}
.el-aside {
  height: 100vh;
}
.el-header,
.el-footer {
  background-color: #b3c0d1;
  color: #333;
  text-align: center;
  line-height: 60px;
}

.el-aside {
  color: #333;
  text-align: center;
  line-height: 220px;
}

.el-main {
  color: #333;
  text-align: center;
  line-height: 160px;
}
</style>
