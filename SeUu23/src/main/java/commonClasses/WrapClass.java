package commonClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrapClass {

	public static void click(WebElement webE) {
		webE.click();
		}
	
	public static void sendkeys (WebElement webE,String textSend){
		webE.sendKeys(textSend);
	}
	
	public static String geText(WebElement webE) {
		return webE.getText();
	}
	
	
	public static boolean verifyelementDisplayed (WebElement webE){
		return webE.isDisplayed();
		
	}
	
	public static void takeScreenshot (WebDriver webdriver, String testCaseName) {
		
		File scrFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		
		String screenShotPath = "./test-output/ExecutionResults";
		
		try {
			FileHandler.createDir(new File (screenShotPath));
			FileHandler.copy(scrFile, new File (screenShotPath + File.separator + testCaseName + ".png"));
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static String getJsonValue(String jsonFileObk, String Jsonkey) {
        try {
            //JsonData
            InputStream inputStram = new FileInputStream(GlobalVariables.TEST_DATA + jsonFileObk + ".json"); //Utilizando la ruta para obtener el achivo JSON
            JSONObject jsonObject = new JSONObject (new JSONTokener(inputStram)); //Convirtiendo el archivo Json a un objeto de Java

            //Get Data
            String jsonValue = (String) jsonObject.getJSONObject(jsonFileObk).getString(Jsonkey);
            return jsonValue;

    }catch (FileNotFoundException e) {
        return null;
    }
    }

public static String getCellData(String excelName,int row, int column) {
	
	try {
	FileInputStream fis = new FileInputStream (GlobalVariables.TEST_DATA + excelName + ".xlsx");
	
	Workbook wb = new XSSFWorkbook (fis);
	Sheet sheet = wb.getSheetAt(0);
	Row rowObj = sheet.getRow(row);
	Cell cell = rowObj.getCell(column);
	
	String value = cell.getStringCellValue();
	return value;
	
}catch (FileNotFoundException e) {
	e.printStackTrace();
	return null;
}catch (IOException e) {
	e.printStackTrace();
	return null;
		}
	
	}	
	
}
