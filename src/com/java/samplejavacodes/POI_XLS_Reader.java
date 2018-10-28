package com.java.samplejavacodes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

 
public class POI_XLS_Reader {
	
	private File file = null;
	private FileInputStream inputStream=null;
	private Workbook Workbook = null;
	private String filePath=null;
	private String fileName=null;
	
	//public FileInputStream inputStream = null;
	
	public POI_XLS_Reader(String filePath, String fileName) throws IOException{
		
		// Constructor for XLS_Reader
		
		this.fileName = fileName;
		this.filePath=filePath;
		 file = new File(filePath+"\\"+fileName);     
		 try{//Create an object of FileInputStream class to read excel file     
		 inputStream = new FileInputStream(file);
		 }catch(Exception e){
			 
		 System.out.println(e.getLocalizedMessage());
			 }
		 
		     //Find the file extension by spliting file name in substring and getting only extension name     
		String fileExtensionName = fileName.substring(fileName.indexOf("."));     //Check condition if the file is xlsx file     

		if(fileExtensionName.equals(".xlsx")){     //If it is xlsx file then create object of XSSFWorkbook class     

			Workbook = new XSSFWorkbook(inputStream);     
		}     //Check condition if the file is xls file     
		else if(fileExtensionName.equals(".xls")){         //If it is xls file then create object of XSSFWorkbook class         
			Workbook = new HSSFWorkbook(inputStream);    
		}     //Read sheet inside the workbook by its name     
		
		// End of XLS_Reader Constructor
	}
	
	public String getCellData(String sheetName,int RowNum, Object ColumnNameOrNumber){
			Sheet XLS_Sheet = Workbook.getSheet(sheetName);     //Find number of rows in excel file     
			String sval = ColumnNameOrNumber.getClass().getSimpleName();
			
			
			
	//	int rowCount = XLS_Sheet.getLastRowNum()-XLS_Sheet.getFirstRowNum();     //Create a loop over all the rows of excel file to read it     
			int col = -1 ;
			String xColVal;
			int j ;
			
			if(sval.equals("Integer")){
				int colNo = (Integer) ColumnNameOrNumber;
					j = colNo;
					col = j;
					
				}else
				{String colName = (String) ColumnNameOrNumber;	
					Row row = XLS_Sheet.getRow(0);		//Create a loop to print cell values in a row
				
					for (j = 0; j < row.getLastCellNum(); j++) {             //Print excel data in console             
						xColVal= row.getCell(j).getStringCellValue();
						if (xColVal.equalsIgnoreCase(colName)){
								col = j;								
							}
						}
				}
		//for (int i = 0; i < 1; i++) {         
				
				//	}         
			Row row1 = XLS_Sheet.getRow(RowNum);		   
		
			if(col != -1) {
				//System.out.println(row1.getCell(col).getStringCellValue());
				return row1.getCell(col).getStringCellValue();
			}
			else{
				System.out.println("Error: Unable to find column in XLS");
				return null;
			}
			
			// End of getCellData Function
	}
	public void setCellData(String sheetName,String ColumnName,int RowNum, String dataToWrite) throws IOException{
	 		//FileInputStream inputStream1 = new FileInputStream(file);
		//Workbook 
		File file =    new File(filePath+"\\"+fileName);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook Workbook = null;
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		 
        //Check condition if the file is xlsx file
 
        if(fileExtensionName.equals(".xlsx")){
         //If it is xlsx file then create object of XSSFWorkbook class
         	Workbook = new XSSFWorkbook(inputStream);
         }
         //Check condition if the file is xls file
         else if(fileExtensionName.equals(".xls")){
             //If it is xls file then create object of XSSFWorkbook class
         	Workbook = new HSSFWorkbook(inputStream);
         }
		Sheet sheet = Workbook.getSheet(sheetName);     //Get the current count of rows in excel file
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();     //Get the first row from the sheet     
		Row row = sheet.getRow(0);     //Create a new row and append it at last of sheet     
		//Row newRow = sheet.createRow(rowCount+1);     //Create a loop over the cell of newly created Row     
		
		int col = -1 ;
		String xColVal;
		int j = 0;
		Cell cell = null;
		
		for ( j = 0; j < row.getLastCellNum(); j++) {             //Print excel data in console             
			xColVal= row.getCell(j).getStringCellValue();
			if (xColVal.equalsIgnoreCase(ColumnName)){
						col = j;	
						break;
					}
				}
		if(col !=-1){
			if(RowNum >rowCount ){
				int xval = RowNum - rowCount;
				Row newRow = sheet.createRow(rowCount+xval);
				 cell = newRow.createCell(RowNum);
				cell = sheet.getRow(RowNum).getCell(j);
			}else{
				cell = sheet.getRow(RowNum).getCell(j); 
				//cell=row.getCell(RowNum);
			}
			cell.setCellValue(dataToWrite);          //Close input stream     
			//inputStream.close();     //Create an object of FileOutputStream class to create write data in excel file     
			FileOutputStream outputStream = new FileOutputStream(file);     //write data in the excel file     
			Workbook.write(outputStream);     //close output stream     
			outputStream.close(); 
		}else{
			System.out.println("Error: Unable to find column"+ColumnName +" in XLS");
		}
	       
		// End of WriteXL Function
	}
	public int GetRowCount(String sheetName){
		Sheet sheet = Workbook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
				
		return rowCount;
		//End of GetRowCount class
	}
	
		
	public int CountSheets(){
		int val = -1;
		val = Workbook.getNumberOfSheets();
		
		if(val!=-1){
			return val;
		}else
		{return 0;
		}
		
		//End of CountSheets Function
	
	}
	@SuppressWarnings("null")
	public int GetColumnCount(String sheetName){
		Sheet sheet = Workbook.getSheet(sheetName);
		
		Row row = sheet.getRow(0);
		int nRow = -1; 
		nRow = row.getLastCellNum();
		
		if(nRow!=-1){
			return nRow;
		}else
		{System.out.println("Error while returning the column count");
			return (Integer) null;
		
		}
		//End of GetColumnCount Function	
	}
		public boolean IsSheetExists(String sheetName){
			int iSheet = Workbook.getSheetIndex(sheetName);
			if(iSheet== -1)
				return false;
			else
				return true;
					
			}
		public static void main(String[] args) {
			POI_XLS_Reader xls_reader=null;
			try {
				xls_reader = new POI_XLS_Reader("D:\\Languages\\EclipseMarsWorkspace\\JavaCodes\\src\\com\\java\\samplejavacodes", "OED.xlsx");
				xls_reader.setCellData("Sheet1", "TC_ID", 2, "OFC_NB_01");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(xls_reader.getCellData("Sheet1",2,"TC_ID"));
			
			
		}	
		// End of Class XLS_Reader 
}																			
