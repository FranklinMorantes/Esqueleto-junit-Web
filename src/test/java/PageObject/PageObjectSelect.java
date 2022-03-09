package PageObject;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import DemoNav.DemoBase;
import MapObject.MapObjectNewuser;
public class PageObjectSelect extends MapObjectNewuser
{
	
	DemoBase DemoB;
	public PageObjectSelect(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
	}
	
	public void urlAcceso(String url) 
	{
		driver.get(url);
		//busquedaInicial();
	}
	
	public void seleccionElements( File rutaCarpeta) throws Exception
		{
			//OBTENER EL NOMBRE DEL METODO A EJECUTAR
		    //String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
				
		    //CREAR CARPETA PARA EL ALMACENAMIENTO DE IMAGENES
			//File rutaCarpeta = crearCarpeta(propiedades,nomTest);
			
			
			//click(TxtBusquedaMercadoLibre, nomTest);
			//tiempoEspera(2000);
			
					
			//click(pro, nomTest);
			//tiempoEspera(2000);
			
			//METODO CLICK CON XPATCH DE BTN REGISTRO
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
			
			
			//click(btnContinuar,rutaCarpeta);
			//tiempoEspera(2000);
	
			
			//click(btnRevisar, rutaCarpeta);
			//tiempoEspera(2000);
			
			//sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"),"prueba2",1,2),txtMail,rutaCarpeta);
			//tiempoEspera(2000);
	
			
			
			
			//click(btnEnviarMail, nomTest);
			//driver.close();

		}

	

}
