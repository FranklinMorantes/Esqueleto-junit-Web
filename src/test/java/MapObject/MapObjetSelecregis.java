package MapObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DemoNav.DemoBase;

public class MapObjetSelecregis extends DemoBase
{
	//CONSTRUCTOR DE LA CLASE
			public MapObjetSelecregis(WebDriver driver) 
			{
				super(driver);
				this.driver = driver;
				
			}
			
			protected By Elements = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]");
			protected By Table = By.xpath("//span[contains(text(),'Web Tables')]");
			protected By Add = By.xpath("//button[@id='addNewRecordButton']");
			protected By Name = By.xpath("//input[@id='firstName']");
			protected By Apellido = By.xpath("//input[@id='lastName']");
			//protected By Telefono = By.xpath("//input[@name='phone']");
			protected By Email = By.xpath("//input[@id='userEmail']");
			protected By Edad = By.xpath("//input[@id='age']");
			protected By Salario = By.xpath("//input[@id='salary']");
			protected By Departamento = By.xpath("//input[@id='department']");
			protected By Btnsubmit = By.xpath("//button[@id='submit']");
			protected By BtnEliminar = By.xpath("//span[@id=\"delete-record-1\"]");
			//protected By CodigoPostal = By.xpath("//input[@name='postalCode']");
			//protected By Pais = By.xpath("//select[@name='country']");
			//protected By UserName = By.xpath("//input[@name='email']");
			//protected By Password = By.xpath("//input[@name='password']");
			//protected By ConfirmPassword = By.xpath("//input[@name='confirmPassword']");
			//protected By enviar= By.xpath("//input[@name='submit']");
			//protected By ConfirmUser = By.xpath("//input[@name='email']");
			
			
		

}
