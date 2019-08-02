<template>
  <div id="Hello">
    <div ref="myChart" style="width:1000px;height:400px;"></div>
  </div>
</template>

<script>
import echarts from "echarts";
import urlapi from "../const/url";

export default {
  data() {
    return {
      echart: []
      // echart: [
      //   { id: 1, provincename: "南召", datacount: 440008, datatype: null },
      //   { id: 2, provincename: "宛城区", datacount: 480520, datatype: null },
      //   { id: 3, provincename: "淅川", datacount: 240003, datatype: null },
      //   { id: 4, provincename: "西峡", datacount: 377861, datatype: null },
      //   { id: 5, provincename: "社旗", datacount: 363686, datatype: null },
      //   { id: 6, provincename: "镇平", datacount: 207097, datatype: null },
      //   { id: 7, provincename: "新野", datacount: 165218, datatype: null },
      //   { id: 8, provincename: "卧龙区", datacount: 362912, datatype: null },
      //   { id: 9, provincename: "内乡", datacount: 182074, datatype: null },
      //   { id: 10, provincename: "唐河", datacount: 286764, datatype: null },
      //   { id: 11, provincename: "桐柏", datacount: 170675, datatype: null },
      //   { id: 12, provincename: "方城", datacount: 197044, datatype: null }
      // ]
    };
  },
  mounted() {
    this.loadDataCount();
  },
  methods: {
    echartss() {
      // 基于准备好的dom，初始化echarts实例
      let myChart = echarts.init(this.$refs.myChart);
      let arr = [];
      let arr1 = [];
      for (let i of this.echart) {
        arr.push(i.provincename);
        arr1.push(i.datacount);
      }
      console.log(arr);
      console.log(arr1);
      // 绘制图表
      myChart.setOption({
        title: { text: "在Vue中使用echarts" },
        tooltip: {},
        xAxis: {
          name: "地域名称",
          data: arr
        },
        yAxis: {},
        series: [
          {
            name: "数据总量",
            type: "bar",
            data: arr1
          }
        ]
      });
    },
    loadDataCount: function() {
      this.$http
        .get("public/echarts")
        .then(response => {
          this.echart = response.data.result;
          this.echartss();
        })
        .catch(error => {
          this.$message.error("系统提示" + error.message);
        });
    }
  }
};
</script>