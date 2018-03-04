package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/*import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;*/

public class ExcelReadData {
	
	public static Map<String,Map<String,String>> getExcelData(String excelPath, String sheetName){
		Map<String,Map<String,String>> sheetData = new LinkedHashMap<String, Map<String,String>>();
		
		File file = new File(excelPath);
		InputStream is=null;
		try {
			is = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Please check the file path. Entered value is "+file.getAbsolutePath());
		}
		HSSFWorkbook workbook = null;
		try {
			workbook = new HSSFWorkbook(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Extracting sheet from Workbook
		HSSFSheet sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.getPhysicalNumberOfRows();
		
		for(int i =1;i<rowCount;i++){
			HSSFRow row = sheet.getRow(i);
			//Getting testcase number
			String testcase = row.getCell(0).getStringCellValue();
			
			//Creating row data
			Map<String, String> rowData = new LinkedHashMap<String,String>();
			int columnCount = row.getLastCellNum();
			
			for(int j=1;j<columnCount;j++){
				HSSFCell cell = row.getCell(j);
				String cellData=null;
				
				switch(cell.getCellType()){
				
				case HSSFCell.CELL_TYPE_STRING:
					cellData = cell.getStringCellValue();
					break;
				case HSSFCell.CELL_TYPE_NUMERIC:
					double doubleData = cell.getNumericCellValue();
					long roundedData = Math.round(doubleData);
					if(doubleData == roundedData){
						cellData = String.valueOf(roundedData);
					}else{
						cellData=String.valueOf(doubleData);
					}
					break;
				case HSSFCell.CELL_TYPE_BOOLEAN:
					cellData = String.valueOf(cell.getBooleanCellValue());
					break;
				default:
					//System.out.println("Data is not in proper format with cell address as "+cell.getAddress());
				
				}
				//Entering Cell header and cell value. Ex Country and USA
				rowData.put(sheet.getRow(0).getCell(j).getStringCellValue(), cellData);
			}
			
			//Entering testcase name and row data
			sheetData.put(testcase, rowData);
		}
		return sheetData;
	}
	
}
