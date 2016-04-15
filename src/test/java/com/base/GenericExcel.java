package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class GenericExcel 
{
	 public static String filepath = "D:/Rajath/automationmobile/TestCaseReport2.xlsx";
	 public static String sheetName = "TestData";
	 ArrayList<String> dataSheetList= new ArrayList<String>();
	
	public ArrayList<String> readDataFromExcel (String testCaseName) throws Exception
    {
        FileInputStream inputStream=new FileInputStream(new File(filepath));
        Workbook Excel=WorkbookFactory.create(inputStream);
        Sheet sheet = Excel.getSheet(sheetName);
        int rowCount=sheet.getLastRowNum();
        for(int i=1;i<=rowCount;i++)
        {
            Row row=sheet.getRow(i);
            String testId=row.getCell(0).toString();
            int cellCount = row.getLastCellNum();
            
            if (testId.equals(testCaseName))
            {
                for(int j=0;j<cellCount;j++)
                {
                    dataSheetList.add(row.getCell(j).toString());
                }    
            }
        }
            return dataSheetList;
            
            
    }
	public void WriteData(String Data,String testcase,String exception) throws EncryptedDocumentException, IOException, InvalidFormatException
	{
		
		String path="D:/Rajath/automationmobile/TestCaseReport2.xlsx";
		FileInputStream file=new FileInputStream(path);
		Workbook Excel=WorkbookFactory.create(file);
		Sheet sheet = Excel.getSheet("Testdata");
		int lastrow=sheet.getLastRowNum();
		for(int i=0;i<=lastrow;i++)
		{
			if (sheet.getRow(i).getCell(0).toString().equals(testcase))
			{
				Row row=sheet.getRow(i);
				Cell celldata=row.createCell(4);
				celldata.setCellType(celldata.CELL_TYPE_STRING);
				celldata.setCellValue(Data);
				Cell cellExpt=row.createCell(5);
				cellExpt.setCellType(celldata.CELL_TYPE_STRING);
				cellExpt.setCellValue(exception);
				FileOutputStream out=new FileOutputStream(path);
				Excel.write(out);
				out.close();
				System.out.println("HI    hi");
			}
		}
	
	}
}