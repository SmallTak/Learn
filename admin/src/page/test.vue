<template>
  <div id="Test">
    <div >where are you from</div>
    <select v-model="from">
      <option value="1">河南</option>
      <option value="2">北京</option>
      <option value="3">广州</option>
    </select>{{from}}

    <div>
      <label>
        男
        <input v-model="sexx" value="man" type="radio" />
      </label>
      <label>
        女
        <input v-model="sexx" value="woman" type="radio" />
      </label>
      {{sexx}}
    </div>

    <div>
      <input type="text" v-model="name" />
      <span v-show="name">你的名字是：{{name}}</span>
    </div>
    <div>
      <input type="text" v-model="age" />
      <span v-show="age">你的年龄是：{{age}}</span>
    </div>
    <div>
      <input type="text" v-model="sex" />
      <span v-show="sex">你的性别是：{{sex}}</span>
    </div>
    <!-- <div> -->
    <!-- <input type="text" v-model="sex1"/> -->
    <!-- if和show的区别就是if为false就在dom中删除 -->
    <!-- <span v-if="sex1">你的性别是：{{sex1}}</span> -->
    <!-- </div> -->
    <div>
      <ul>
        <li v-for="echart in echarts">{{echart.provincename}}:{{echart.datacount}}</li>
      </ul>
    </div>
    <div>
      <button v-on="{mouseenter: onEnter, mouseleave: onOut}" v-on:click="onclick">click</button>
    </div>
    <div>
      <form @keyup.enter="onEnter" @submit.prevent="onSubmit">
        <!-- v-on:submit.prevent="onSubmit" 关闭浏览器的提交默认行为-->
        <input type="text" />
        <button type="submit">submit</button>
      </form>
    </div>
    <div>
      <input v-model.trim="skr" type="text" />
      {{skr}}
    </div>
  </div>
</template>

<script>
import urlapi from "../const/url";
export default {
  name: "Test",
  data() {
    return {
      name: null,
      age: null,
      sex: null,
      echarts: [],
      skr: null,
      sexx: null,
      from: 1
    };
  },
  methods: {
    onclick: function() {
      alert("zz");
    },
    onEnter: function() {
      //alert("进来")
      this.$message("come in");
    },
    onOut: function() {
      //alert("出去")
      this.$message("get out");
    },
    onSubmit: function() {
      this.$message("submit success");
    },
    onEnter: function() {
      this.$message("enter success");
    }
  },
  mounted() {
    this.$http
      .get("/public/echarts")
      .then(response => {
        this.echarts = response.data.result;
        // alert(this.echarts.cfWsh);
      })
      .catch(error => {
        this.$message.error("系统提示:" + error.message);
      });
  },
  components: {}
};
</script>

<style scoped lang="less">
</style>
