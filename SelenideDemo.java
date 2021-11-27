package SelenideDemo.SelendeDemo;
import static com.codeborne.selenide.Selenide.*;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.*;
public class SelenideDemo 
{
	
	@Test
	public void startBrowser()
	{
		open("https://www.google.com");
		$("input[title='Search']").setValue("selenium");
		System.out.println($$(By.xpath("//img")).size());
		//$("div[class='FPdoLc lJ9FBc'] input[name='btnK']").click();
		/*
		 * $(By.xpath("//img[@alt=\"Google\"]")).shouldHave(Condition.appear); String
		 * text=$(By.xpath("//h3[normalize-space()='Selenium']")).getText();
		 * System.out.print(text);
		 */
		
		
	}
	
	
}
