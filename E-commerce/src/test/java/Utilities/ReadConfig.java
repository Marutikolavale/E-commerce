package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadConfig {
	//generic reusable method to read the property file
	public String readPropertyFile(String propPath,String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	//read the Data from excel

	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis =new FileInputStream(excelPath);
		XSSFWorkbook  wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(0);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		return data;
	}
	//how get Row count

	public int getRowCount(String execlPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(execlPath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheetName);
		int getrowvalues = sh.getLastRowNum();
		return getrowvalues;		
	}
	public int getcellCount(String execlPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(execlPath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheetName);
		int cellvalues = sh.getRow(0).getLastCellNum();
		return cellvalues;		
	}
	//write the data from excel file

	public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data ) throws IOException
	{
		FileInputStream fis=new FileInputStream(excelPath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);


		FileOutputStream fos=new FileOutputStream(excelPath);
		wb.write(fos);
	}
	// data provider method in testNG
	public  String[][]Daataprovider() throws EncryptedDocumentException, IOException
	{
		String pathName=System.getProperty("user.dir")+"\\Testdata\\demo.xlsx";
		int totlerow=getRowCount(pathName,"pathName");
		int totalcell=getcellCount(pathName,"pathName");
		String data[][]= new String[totlerow-1][totalcell];
		{
			for(int i=1;i<=totlerow;i++)
			{
				for (int j=0;j<=totalcell;j++) {
					data[1-1][j]=readExcelData(pathName, "pat", i, j);
				}
			}
		}
		return data;
	}
}

// 9359133940