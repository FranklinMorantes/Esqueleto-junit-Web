package PageObject;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import MapObject.MapObjetSelecregis;
import utilidadesExcel.ReadExcelFile;

public class PageObjectTexto extends  MapObjetSelecregis
{
	public PageObjectTexto(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
	}
	
	public void urlAcceso(String url) 
	{
		driver.get(url);
		//busquedaInicial();
	}
	
	public void EnvioTexto(ReadExcelFile leer, Properties propiedades,String numHoja,File rutaCarpeta ) throws Exception 
	{
		
		
		//String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
		//File rutaCarpeta = crearCarpeta(propiedades,nomTest);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		click( Elements, rutaCarpeta);
		tiempoEspera(1000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1000)");
		click(Table, rutaCarpeta);
		tiempoEspera(1000);
		click(Add, rutaCarpeta);
		tiempoEspera(1000);
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,2),Name,rutaCarpeta);
	
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,3),Apellido,rutaCarpeta);
		
		//sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,4),Telefono,rutaCarpeta);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,4),Email,rutaCarpeta);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,5),Edad,rutaCarpeta);
	
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,6),Salario,rutaCarpeta);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,7),Departamento,rutaCarpeta);
		
		click(Btnsubmit, rutaCarpeta);
		tiempoEspera(3000);
		click(BtnEliminar, rutaCarpeta);
		tiempoEspera(3000);
		
		//sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,9),CodigoPostal,rutaCarpeta);
		
		//sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,10),Pais,rutaCarpeta);
		//scrollpage(1,20);
		
		//sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,11),UserName,rutaCarpeta);
		//submit(txtUserName, rutaCarpeta);
		
		//sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,12),Password,rutaCarpeta);
		//submit(txtPassword, rutaCarpeta);
		
		//sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,13),ConfirmPassword,rutaCarpeta);
		//click( enviar, rutaCarpeta);
		//tiempoEspera(1000);
		
		
		
	}
	
	

}
