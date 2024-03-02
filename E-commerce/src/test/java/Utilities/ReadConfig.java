package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.plaf.basic.BasicArrowButton;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadConfig implements IAutoConstant {
	//generic reusable method to read the property file
	public String ReadPropertyFile(String propPath,String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	//read the Data from excel

	public String ReadExcelData(String ExcelPath,String SheetName,int RowCount,int CellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis =new FileInputStream(ExcelPath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(SheetName);
		Row row = sh.getRow(RowCount);
		Cell cell = row.getCell(CellCount);
		String data =cell.getStringCellValue();
		return data;
		
		
		
	}
	//how get Row count

	public int GetRowCount(String execlPath,String sheetName) throws EncryptedDocumentException, IOException
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
	public  String[][]Dataprovider() throws EncryptedDocumentException, IOException
	{
		String PathName = System.getProperty("user.dir")+"\\Testdata\\demo.xlsx";
		int TotalRow = GetRowCount(PathName,"pathName");
		int TotalCell = getcellCount(PathName,"pathName");
		String data[][]= new String[TotalRow-1][TotalCell];
		{
			for(int i=1;i<=TotalRow;i++)
			{
				for (int j=0;j<=TotalCell;j++) {
					data[1-1][j]=ReadExcelData(PathName, "path", i, j);
				}
			}
		}
		return data;
	}
}
