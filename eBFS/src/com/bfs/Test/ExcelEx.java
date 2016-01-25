package com.bfs.Test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelEx {
	public void ExcelMan(){
		try {
		
		FileInputStream file = new FileInputStream(new File("C:\\Users\\BruteForce\\Desktop\\QA Batch Nov.xls"));
		
		HSSFWorkbook workbook = new HSSFWorkbook(file);
		
		
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}

