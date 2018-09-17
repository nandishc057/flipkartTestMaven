package com.flipkart.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExeclData  {
	
	public static String getData(String filepath, String sheetName, int rwNo, int clNo) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		try {
			File file= new File(filepath);
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = WorkbookFactory.create(fis);
			Cell c = wb.getSheet(sheetName).getRow(rwNo).getCell(clNo);
			String data = c.toString();
			return data;
			
		} catch (Exception e) {
			// TODO: handle exception
			return "   ";
		}
 
		
	}
	
	public static int getRowCnt(String filepath, String sheetName){
		try {
			FileInputStream fis = new FileInputStream(new File(filepath));
			Workbook wb = WorkbookFactory.create(fis);
			int rc = wb.getSheet(sheetName).getLastRowNum();
			return rc;
			
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
		
		
	}

}
