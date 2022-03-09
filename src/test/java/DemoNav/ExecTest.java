package DemoNav;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import PageObject.PageObjectAlert;
import PageObject.PageObjectSelect;
import PageObject.PageObjectTexto;
import PageObject.PageObjectWidgets;
import utilidadesExcel.ReadExcelFile;
import utilidadesExcel.WriteExcelFile;

public class ExecTest {
	
	     
		private WebDriver driver;
		Properties propiedades;
		ReadExcelFile leer;
		WriteExcelFile escribir;
		PageObjectSelect selecObject;
		String  url = null;
		PageObjectTexto paginas;
		PageObjectWidgets Widgets;
		PageObjectAlert Alerts;

		@Before
		public void setUp() throws InterruptedException, IOException 
		{
			

			driver= DemoBase.chromeDriverConnection();
			
			
			//ACCESOS PORTABLES DEL NAVEGADOR
			selecObject = new PageObjectSelect(driver);
			
			// INSTANCIAR LA CLASE PROPIEDADES DE JAVA UNIT
			propiedades = new Properties();
			//claseBase= new ClaseBase(driver);
			//ACCESOS PORTABLES DEL NAVEGADOR(VAN EN CADA CASO DE PRUEBA)
		    //driver = claseBase.chromeDriverConnection();
			paginas = new PageObjectTexto(driver);
			Widgets= new PageObjectWidgets(driver);
		    Alerts=new PageObjectAlert(driver);
		
			//INSTANCIAR CLASES DE EXCEL 
			leer = new ReadExcelFile();
			escribir = new WriteExcelFile();

			// CREAR LA VARIABLE TIPO INPUTSTRING
			InputStream entrada = null;

			// VALIDAR SI GENERA ERROR AL NO ENCONTRAR EL ARCHIVO
			try {
				entrada = new FileInputStream("./Properties/datos.properties");
				propiedades.load(entrada);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println(e);
				// TODO: handle exception
			}
			// INSTANCIAR LA CLASE PAGOBJET
			//paginas = new PagsObjeInicioPrueba(driver);

			// ASIGNAMOS LAS OPCIONES Y LA CONFIGURACION DEL NAVEGADOR A LA VARIABLE DRIVER

			//driver = paginas.chromeDriverConnection();

			// ACCEDER AL METODO DE ABRIR LA PAGINA

			
		}
		
		
		//METDODO DE ACCESO A MERCURY VIAJES
		@Test
		public void DemoQa() throws Exception
		{
			if(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",0,0).equals("Si")) 
			{ 
				
		    //OBTENER EL NOMBRE DEL METODO A EJECUTAR
		    String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
				
		    //CREAR CARPETA PARA EL ALMACENAMIENTO DE IMAGENES
		    File rutaCarpeta = paginas.crearCarpeta(propiedades,nomTest);
							
			//ACCESO AL DRIVER DEL NAVEGADOR
			//driver = DemoBase.chromeDriverConnection();
				
			//INSTANCIACION DE LA VARIABLE URL A UN DOCUMENTO EXCEL 
		    //url = leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",0,1);
		    
			//ENTRADAS AL METODO urlACCESO
		    paginas.urlAcceso(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,1));
		    //selecObject.seleccionElements(rutaCarpeta);
			
			paginas.EnvioTexto(leer, propiedades,"datos",rutaCarpeta );
			Widgets.seleccionWidgets(leer, propiedades, nomTest, rutaCarpeta);
			Alerts.seleccionAlert(leer, propiedades, nomTest, rutaCarpeta);
			
			}
			 
		}
		
	
			
		


		@After
		public void cerrar() {
			driver.quit();
		}
		

		
}

	

