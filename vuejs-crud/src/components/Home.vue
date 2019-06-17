<template>
  <div id="Home">
      <div class="right-items" style="float: right;">
        <el-button class="filter-item" style="margin-left: 10px;" type="primary" align="center" size="small"  @click="addProduct" round>新增商品</el-button>
        <el-button class="filter-item" style="margin-left: 10px;" type="info" align="center" size="small"   round>退出登录</el-button>
      </div>
      <!-- 取消全选注意 -->
      <el-table
      ref="multipleTable" 
      :data="products"
      size="medium "
      style="width: 100%"
      @selection-change="handleSelectionChange">
      <el-table-column
        type="selection"
        width="50"
        >
      </el-table-column>
      <el-table-column
        prop="productName"
        label="耳机名称"
        header-align="center"
        width="450">
      </el-table-column>
      
      <el-table-column
        prop="price"
        label="耳机价格"
        width="250">
      </el-table-column>
      <el-table-column
        prop="marketPrice"
        align="conter"
        label="市场价格">
      </el-table-column>
      <el-table-column
        prop="place"
        align="conter"
        label="产品产地">
      </el-table-column>
      <el-table-column header-align="conter"  label="操作">
                <template  slot-scope="scope">
                <el-button type="primary" icon="el-icon-edit" @click="handleEdit(scope.$index, scope.row)" ></el-button>
                <el-button type="danger" icon="el-icon-delete" @click="handleDelete(scope.$index, scope.row)" ></el-button>
                </template>
      </el-table-column>
    </el-table>
      <el-button @click="deleteFileOrDirectory(sels)" :disabled="this.sels.length === 0"> 批量删除</el-button>
      <el-button @click="toggleSelection()">取消</el-button>
    <!-- 分页1 -->
    <el-pagination              
        background
        layout="->,prev, pager, next,total,jumper"
        :total="total"
        :current-page="currentPage"
        @current-change="pageData">
    </el-pagination>
  </div>
</template>



<script>
import urlapi from '../const/url'
export default {
  name:'Home', 
  data() {
    return {
        products:[],
        total:1,
        currentPage:1,
        sels: [],
        multipleSelection: []
    }
  },
  methods: {
    addProduct:function () {
      this.$router.push("/new")
    },
    handleEdit:function (index, row) {
        var id = row.id;
        this.$router.push("/edit/" + id);
    },
    handleDelete:function (index, row) {
        var id = row.id;
        //var id = 2000001;
        this.$confirm('此操作将永久删除该文件, 是否继续?', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          this.$http.delete("/product/" + id).then(response => {
            console.log(id);
            if (response.data.status == 'success') {
              this.$message.success("删除成功");
              this.products.splice(index, 1); //将数组中的数据删除，刷新页面
            }else {
              this.$message.error(response.data.message);
            }
          }).catch(error => {
            this.$message.error("系统提示:" + error.message);
          })
        }).catch(() => {
          this.$message({
            type: 'info',
            message: '已取消删除'
          });          
        });
    },
    //分页2 
    pageData:function (pageNo) {
      // this.currentPage = pageNo;
      this.loadData(this.currentPage=pageNo)
      //this.loadData(pageNo)
    },
    //分页3
    loadData:function (pageNum) {
        this.$http.get(urlapi.productHome +"/?p=" + pageNum).then(response => {
          this.products = response.data.result.list;
          this.total = response.data.result.total;
        }).catch(error => {
            this.$message.error("系统提示" + error.message); 
        })
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
    toggleSelection (rows) {
      if (rows) {
        rows.forEach (row => {
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
    deleteFileOrDirectory:function(){//批量删除
        var idList= this.sels.map(item => item.id).join()//获取所有选中行的id组成的字符串，以逗号分隔
        var ids = JSON.stringify(idList);
        console.log(ids + "idList");
        this.$confirm('此操作将永久删除该文件, 是否继续?', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          this.$http.delete(urlapi.productHome + "/bathDel",{data:{test:idList}}).then(response => {
            if (response.data.status == 'success') {
              this.$router.push("/");
              this.$message.success("删除成功");
              this.$router.go(0);
              
            }else {
              this.$message.error(response.data.message);
            }
          }).catch(error => {
            this.$message.error("系统提示:" + error.message);
          })
        }).catch(() => {
          this.$message({
            type: ' ',
            message: '已取消删除'
          });          
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
      }

  },
  mounted:function() {
    //分页4
    this.loadData(this.currentPage);    
  }
}
</script>

<style scoped lang="less">
</style>
