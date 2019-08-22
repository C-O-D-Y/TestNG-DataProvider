package Atmecs.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * In this Class i'm reading excel file using maven
 */
public class sdfc {
	// Calling getData method.
	public static void main(String[] args) throws IOException {
		getData();
	}

	/*
	 * In this method i'm reading excel file using dependency of apache-poi
	 */
	public static Iterator<Row> getData() throws IOException {
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\saurabh.chauhan\\Desktop\\Book1.xlsx"));
		// Class used to read excel file and read the data
		XSSFWorkbook file = new XSSFWorkbook(fis);
		XSSFSheet worksheet = file.getSheetAt(0);
		// iterating through rows and getting row number
		Iterator<Row> rows = worksheet.iterator();
		return rows;
	}
}
