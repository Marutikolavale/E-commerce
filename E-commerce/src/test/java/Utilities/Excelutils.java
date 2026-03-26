package Utilities;

import static org.testng.Assert.assertListContainsObject;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {

	public static Object[][] readExcelData(String FileName, String sheetName) {
		String filePath = GlobalIdentifiers.getProjectBasePath() + "\\src\\test\\resources\\testdata\\" + FileName;
		File file = new File(filePath);
		FileInputStream fi = null;
		XSSFSheet sheet = null;
		XSSFWorkbook workbook = null;
		Object[][] data = null;
		int r = 0;
		int c = 0;

		try {
			fi = new FileInputStream(file);
		} catch (Exception e) {
			throw new Error(filePath + " file not found\n" + e.getMessage());
		}

		try {
			workbook = new XSSFWorkbook(fi);
			sheet = workbook.getSheet(sheetName);
			r = sheet.getLastRowNum();
			c = sheet.getRow(0).getLastCellNum();
			System.out.println("Total Rows:" + (r + 1));
			System.out.println("Total Columns:" + c);

			data = new Object[r][c];
			DataFormatter df = new DataFormatter();

			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));
					// data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				}
			}

			System.out.println("data\n" + data);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return data;

	}

	public static Object[][] readExcelDataWithKeyAndValuePair(String FileName, String sheetName) {
		String filePath = GlobalIdentifiers.getProjectBasePath() + "\\src\\test\\resources\\testdata\\" + FileName;
		File file = new File(filePath);
		FileInputStream fi = null;
		XSSFSheet sheet = null;
		XSSFWorkbook workbook=null;
		List<Map<String, String>> list=null;
		int r = 0;
		int c = 0;

		try {
			fi = new FileInputStream(file);
		} catch (Exception e) {
			throw new Error(filePath + " file not found\n" + e.getMessage());
		}

		try {
			workbook = new XSSFWorkbook(fi);
			sheet = workbook.getSheet(sheetName);
			r = sheet.getLastRowNum();
			c = sheet.getRow(0).getLastCellNum();
			System.out.println("Total Rows:" + (r + 1));
			System.out.println("Total Columns:" + c);

			DataFormatter df = new DataFormatter();
			list = new ArrayList<>();

			for (int i = 0; i < r; i++) {
				Map<String, String> map = new HashMap<String, String>();
				for (int j = 0; j < c; j++) {
					String key = df.formatCellValue(sheet.getRow(0).getCell(j));
					String value = df.formatCellValue(sheet.getRow(i + 1).getCell(j));
					map.put(key, value);
				}
				list.add(map);
			}
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		

		Object[][] data = new Object[list.size()][1];
		for (int i = 0; i < list.size(); i++) {
			data[i][0] = list.get(i);
		}

		return data;

	}

}
