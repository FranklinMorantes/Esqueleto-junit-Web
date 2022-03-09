package MapObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DemoNav.DemoBase;

public class MapObjectWidgets extends DemoBase {

	
	
	public MapObjectWidgets(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	protected By BtnWidgets = By.xpath("//*[@class='left-pannel']/div/div[4]");
	protected By BtnDataPicker = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]\r\n");
	protected By BtnFecha = By.xpath("//input[@id='datePickerMonthYearInput']");
	
	protected By BtnHora = By.xpath("//input[@id='dateAndTimePickerInput']");
	
	//protected By BtnHora = By.id("dateAndTimePickerInput");
	//protected By BtnAño = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]");
	//protected By BtnAñoExacto = By.xpath("//option[@value=\"2018\"]");
	//protected By BtnMes = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]");
	//protected By BtnMesExacto = By.xpath("//option[@value=\"3\"]");
	//protected By BtnDia = By.xpath("//div[contains(text(),'16')]");
	//protected By BtnHoraExacta = By.xpath("//li[contains(text(),'16:30')]");
	
	
	
	
	
}

//option[@value="3"]