package PageObject;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import MapObject.MapObjectAlert;
import utilidadesExcel.ReadExcelFile;

public class PageObjectAlert extends MapObjectAlert {

	public PageObjectAlert(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void urlAcceso(String url) 
	{
		driver.get(url);
		//busquedaInicial();
}
	
	
	public void seleccionAlert (ReadExcelFile leer, Properties propiedades,String numHoja,File rutaCarpeta  ) throws Exception{ 
		click( BtnAlert, rutaCarpeta);
		tiempoEspera(1000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,1000)");
		click( BtnAlert2, rutaCarpeta);
		tiempoEspera(1000);
		click( btnClick1, rutaCarpeta);
		driver.switchTo().alert().dismiss();
		tiempoEspera(100);
		click(btnClick2, rutaCarpeta);
		tiempoEspera(7000);
		driver.switchTo().alert().dismiss();
		tiempoEspera(500);
		click(btnClick3, rutaCarpeta);
		tiempoEspera(500);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		tiempoEspera(500);
		click(btnClick3, rutaCarpeta);
		tiempoEspera(500);
		driver.switchTo().alert().dismiss();
		tiempoEspera(500);
		click(btnClick4, rutaCarpeta);
		tiempoEspera(500);
		driver.switchTo().alert().sendKeys(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,3));
		alert();
	
		
		
}


}
