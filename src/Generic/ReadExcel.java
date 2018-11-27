package Generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel 
{
	static String data;
	public static String getdata (String ExcelPath, String sheet, int row, int column)
	{
		try
		{
			FileInputStream f = new FileInputStream(ExcelPath);
			Workbook book = WorkbookFactory.create(f);
			data = book.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
		}
		catch (Exception e)
		{
			
		}
		return data;
	}
}