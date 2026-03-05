package com.practice.TestAutomation_Excel_Implementation;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;

public class InputStream_File {
    public static void main(String [] args) {
        try{
            FileInputStream fis = new FileInputStream(new File("testData/data.xlsx"));
            Workbook workbook= new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);
            //iterate through rows
            for (Row row: sheet){
                for (Cell cell: row){
                    switch (cell.getCellType()){
                        case STRING:
                            System.out.println(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            System.out.println(cell.getNumericCellValue());
                            break;
                        case BOOLEAN:
                            System.out.println(cell.getBooleanCellValue());
                            break;
                        default:
                            System.out.println("\t");
                    }
                }
                System.out.println();
            }
            fis.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
