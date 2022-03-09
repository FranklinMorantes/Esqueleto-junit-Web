package PageObject;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import DemoNav.DemoBase;
import MapObject.MapObjectWidgets;
import utilidadesExcel.ReadExcelFile;

public class PageObjectWidgets extends MapObjectWidgets {
	


	public PageObjectWidgets(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
		
	}

	public void urlAcceso(String url) 
	{
		driver.get(url);
		//busquedaInicial();
}
	
	public void seleccionWidgets( ReadExcelFile leer, Properties propiedades,String numHoja,File rutaCarpeta ) throws Exception 
	{
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,1000)");
		click( BtnWidgets, rutaCarpeta);
		tiempoEspera(1000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,1000)");
		click( BtnDataPicker, rutaCarpeta);
		tiempoEspera(1000);
		click(BtnFecha, rutaCarpeta);
		tiempoEspera(1000);
		controla(BtnFecha, rutaCarpeta);
		teclaBorrar(BtnFecha,rutaCarpeta);
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,9),BtnFecha,rutaCarpeta);
		tiempoEspera(1000);
		enter(BtnFecha,rutaCarpeta);
		tiempoEspera(1000);
		click( BtnHora, rutaCarpeta);
		tiempoEspera(1000);
		controla(BtnHora, rutaCarpeta);
		teclaBorrar(BtnHora,rutaCarpeta);
		tiempoEspera(1000);
        
		String datos = (leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,9)+","+(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,10)));
		sendkey(datos,BtnHora,rutaCarpeta);
		enter(BtnHora,rutaCarpeta);
		//tiempoEspera(1000);
		//click(BtnAño, rutaCarpeta);
		//tiempoEspera(500);
		
		//click(BtnAñoExacto, rutaCarpeta);
		//tiempoEspera(500);
		//click(BtnMes, rutaCarpeta);
		//tiempoEspera(500);
		//click( BtnMesExacto, rutaCarpeta);
		//tiempoEspera(500);
		//click(BtnDia, rutaCarpeta);
		//tiempoEspera(500);
		//click(BtnHora, rutaCarpeta);
		//tiempoEspera(500);
		
		//scrollpage(1,40);
		//sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,10),BtnAño,rutaCarpeta);
	}	
		
		
	}