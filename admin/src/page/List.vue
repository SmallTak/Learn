<template>
  <div>
    <div id="List">
      <el-table
        :data="punishs"
        size="medium"
        style="width: 100%"
        :row-class-name="tableRowClassName"
      >
        <el-table-column label="相对人" width="300" >
          <template slot-scope="scope">
            <el-popover trigger="hover" placement="top">
              <p>处罚相对人：{{ scope.row.cfXdr }}</p>
              <p>处罚事由：{{ scope.row.cfSy }}</p>
              <p>处罚结果：{{ scope.row.cfJieguo }}</p>
              <div slot="reference" class="name-wrapper">
                <el-tag size="medium">{{ scope.row.cfXdr }}</el-tag>
              </div>
            </el-popover>
          </template>
        </el-table-column>
        <el-table-column prop="cfWsh" label="处罚文书号" high="10" width="180"></el-table-column>
        <el-table-column prop="cfCfmc" label="处罚名称" width="430"></el-table-column>
        <el-table-column prop="cfJg" label="处罚机关" width="230"></el-table-column>
        <el-table-column header-align="conter" label="操作">
          <template slot-scope="scope">
            <el-button
              type="primary"
              size="small"
              icon="el-icon-edit"
              @click="handleEdit(scope.$index, scope.row)"
            ></el-button>
            <el-button
              type="danger"
              size="small"
              icon="el-icon-delete"
              @click="handleDelete(scope.$index, scope.row)"
            ></el-button>
          </template>
        </el-table-column>
      </el-table>
      <el-pagination
        background
        layout="->,prev, pager, next,total,jumper"
        :total="total"
        :current-page="currentPage"
        @current-change="pageData"
      ></el-pagination>
    </div>
  </div>
</template>

<script type="text/ecmascript-6">
import Layout from "./Layout";
import hander from "./hander";
import urlapi from "../const/url";
export default {
  name: "List",
  data() {
    return {
      tableData: [],
      punishs: [],
      total: 1,
      currentPage: 1,
      sels: [],
      multipleSelection: []
    };
  },
  methods: {
    //分页2
    pageData: function(pageNo) {
      // this.currentPage = pageNo;
      this.loadData((this.currentPage = pageNo));
      //this.loadData(pageNo)
    },
    //分页3
    loadData: function(pageNum) {
      console.log(pageNum + "页数");
      this.$http
        .get(urlapi.punishHome + "/?p=" + pageNum)
        .then(response => {
          this.punishs = response.data.result.list;
          this.total = response.data.result.total;
        })
        .catch(error => {
          this.$message.error("系统提示" + error.message);
        });
    },
    toggleSelection(rows) {
      if (rows) {
        rows.forEach(row => {
          this.$refs.multipleTable.toggleRowSelection(row);
        });
      } else {
        this.$refs.multipleTable.clearSelection();
      }
    },
    toggleSelection(rows) {
      if (rows) {
        rows.forEach(row => {
          this.$refs.multipleTable.toggleRowSelection(row);
        });
      } else {
        this.$refs.multipleTable.clearSelection();
      }
    },
    handleSelectionChange(sels) {
      this.sels = sels;
      console.log(this.sels + "sels");
    },
    toggleSelection(rows) {
      if (rows) {
        rows.forEach(row => {
          this.$refs.multipleTable.toggleRowSelection(row);
        });
      } else {
        this.$refs.multipleTable.clearSelection();
      }
    },
    tableRowClassName({ row, rowIndex }) {
      if (rowIndex === 1) {
        return "warning-row";
      } else if (rowIndex === 3) {
        return "success-row";
      }
      return "";
    },
    //修改处罚
    handleEdit:function (index, row) {
        var id = row.idkey;
        //alert(id);
        this.$router.push("edit/" + id);
    },
  },
  mounted: function() {
    //分页4
    this.loadData(this.currentPage);
  },
  components: {
    Layout,
    hander
  }
};
</script>

<style scoped lang="less">
.el-table .warning-row {
  background: oldlace;
}

.el-table .success-row {
  background: #f0f9eb;
}
</style>

