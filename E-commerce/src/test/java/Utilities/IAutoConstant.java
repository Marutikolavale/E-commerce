package Utilities;

import java.io.File;

public interface IAutoConstant {
	String EXCEL_PATH = System.getProperty("user.dir")+File.separator+"Data//TestData.xlsx";
	String PROP_PATH = System.getProperty("user.dir")+File.separator+"Configuration//config.properties";
}