package com.yunfei.vuecrudproduct.service.impl;

import com.yunfei.vuecrudproduct.entity.Account;
import com.yunfei.vuecrudproduct.service.ExportTest;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import org.apache.poi.ss.usermodel.*;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

@Service
public class ExportTestImpl implements ExportTest {

    //设置样式
    private CellStyle getColumnTopStyle(Workbook workbook) {
        CellStyle cellStyle=workbook.createCellStyle();
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBorderLeft(BorderStyle.THIN);
        cellStyle.setBorderRight(BorderStyle.THIN);
        cellStyle.setBorderTop(BorderStyle.THIN);
        //设置自动换行
        cellStyle.setWrapText(false);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        return cellStyle;
    }

    //写入EXCLE
    @Override
    public void exportTest(List<Account> list, HttpServletResponse response) throws IOException {
        File file=new File("用来测试的表.xlsx");
        Workbook workbook=new XSSFWorkbook();
        //设置表的牙样式
        CellStyle cellStyle=getColumnTopStyle(workbook);
        Sheet sheet=workbook.createSheet("测试表");
        int index=0;
        Row row0=sheet.createRow(index++);
        //设置第一行
        row0.createCell(0).setCellValue("编号");
        row0.createCell(1).setCellValue("名字");
        //把查询结果放入到对应的列
        for (Account account : list) {
            Row row=sheet.createRow(index++);
            row.createCell(0).setCellValue(account.getId());
            row.createCell(1).setCellValue(account.getUserName());
        }

        for(int m=0;m<=sheet.getLastRowNum();m++){
            Row rowStyle=sheet.getRow(m);
            for(int n=0;n<rowStyle.getLastCellNum();n++){
                rowStyle.getCell(n).setCellStyle(cellStyle);
            }
        }
        response.reset();
        response.setHeader("Content-Disposition","attachment;filename=\""+new String(file.getName().getBytes("utf-8"),"ISO8859-1")+"\"");
        response.setContentType("application/octet-stream;charset=UTF-8");
        OutputStream os=new BufferedOutputStream(response.getOutputStream());
        workbook.write(os);
        os.flush();

    }

}
