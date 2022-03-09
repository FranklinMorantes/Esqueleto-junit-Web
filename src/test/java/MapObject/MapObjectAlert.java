package MapObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DemoNav.DemoBase;

public class MapObjectAlert  extends DemoBase {

	public MapObjectAlert(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	protected By BtnAlert = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]");
	protected By BtnAlert2 = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]");
	protected By btnClick1 = By.xpath("//button[@id='alertButton']");
	protected By btnClick2 = By.xpath("//button[@id='timerAlertButton']");
	protected By btnClick3 = By.xpath("//button[@id='confirmButton']");
	protected By btnClick4 = By.xpath("//button[@id='promtButton']");
	protected By txtIngresar = By.xpath("");
	protected By alertsFrame= By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]");
	protected By alerts= By.xpath("//span[contains(text(),'Alerts')]");
	//protected By ClickMe1 = By.xpath("//button[@id='alertButton']");
	//protected By ClickMe2 = By.xpath("//button[@id='timerAlertButton']");
}
