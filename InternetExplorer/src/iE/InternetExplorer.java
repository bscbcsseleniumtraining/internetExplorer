package iE;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) 
	{
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
//		driver.get("http://localhost:8888");
//		
//		driver.findElement(By.name("user_name")).sendKeys("admin");
//		driver.findElement(By.name("user_password")).sendKeys("manager",Keys.ENTER);
		int p = driver.manage().window().getPosition().getX();
		System.out.println(p);
		System.out.println("Change 1 by User 1");
		System.out.println("Change 2 by User 2");
		System.out.println("Change 3 by User 2");
	}

}
