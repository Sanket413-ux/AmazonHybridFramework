package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	
	// DataProvider 1
	
	@DataProvider(name="searchData")
	public String[][] getData() throws IOException
	{
		String path=".\\testData\\AmazonSearchProductData.xlsx";    // taking excel file from testdata
		
		ExcelUtility xlutil=new ExcelUtility(path);    // creating an object for xl utility
		
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1", 1);
		System.out.println("Total rows :"+totalrows+"  "+"Total Columns :"+totalcols);
		String logindata[][]=new String[totalrows][totalcols]; // created for two dimension array
		
		for(int i=1;i<=totalrows;i++)  // 1 // read the data from xl storing in twoDArray
		{
			
			for(int j=0;j<totalcols;j++) //0 i is rows j is col
			{
				logindata[i - 1][j]=xlutil.getCellData("Sheet1", i, j);   //1,0
			}
		}
		return logindata;    // returning two dimensional array
	}
	
	// Data Provider 2
	
	// Data Provider 3
	
	// Data Provider 4

}
