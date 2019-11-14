package com.jd.ascpect.common.utils;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Excel生成方法类
 * @author xuzhangwang
 * @date 2019/11/12 17:25
 */
@Setter
@Getter
@Slf4j
public class ExcelUtils<T> {

    /**
     * 对于最基本的excel生成, 一般是名称会修改, 头会修改, 查询的数据会修改
     */

    private String name;

    private String[] params;

    private List<T> data;

    // HSSF 提供读写Microsoft Excel 格式档案的功能

    // 导出excel中的数据到List

    /**
     * 1 //获取指定行，索引从0开始
     *  2 hssfRow=hssfSheet.getRow(1);
     *  3 //获取指定列，索引从0开始
     *  4 hssfCell=hssfRow.getCell((short)6);
     *  5
     *  6 //获取总行数
     *  7 //int rowNum=hssfSheet.getLastRowNum();
     *  8 //获取一个excel表格中的总记录数
     *  9 int rowNum=storagesList.size();
     * 10 //获取总列数
     * 11 int columnNum=hssfRow.getPhysicalNumberOfCells();
     * 12
     * 13 FileInputStream inp = new FileInputStream("E:\\WEIAN.xls");
     * 14 HSSFWorkbook wb = new HSSFWorkbook(inp);
     * 15 HSSFSheet sheet = wb.getSheetAt(2); // 获得第三个工作薄(2008工作薄)
     * 16 // 填充上面的表格,数据需要从数据库查询
     * 17 HSSFRow row5 = sheet.getRow(4); // 获得工作薄的第五行
     * 18 HSSFCell cell54 = row5.getCell(3);// 获得第五行的第四个单元格
     * 19 cell54.setCellValue("测试纳税人名称");// 给单元格赋值
     * 20 //获得总列数
     * 21 int coloumNum=sheet.getRow(0).getPhysicalNumberOfCells();
     * 22 int rowNum=sheet.getLastRowNum();//获得总行数
     * @return
     */
    public List<T> importXLS() {
        List<T> data = new ArrayList<>();
        // 获取文件
        try {

            InputStream inputStream = new FileInputStream("D:\\git\\ascpect\\tmp\\门店信息报表_201911120541.xlsx");
            // 获取Excel工作薄对象
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            // 3、得到Excel工作表对象
            XSSFSheet sheet = workbook.getSheetAt(0);
            // 4、获取当前的表中有多少列
            Row row = sheet.getRow(0);
            int rowNum = sheet.getLastRowNum();
            int colNum = row.getPhysicalNumberOfCells();
            log.info("行数: {}, 列数: {}", rowNum, colNum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
