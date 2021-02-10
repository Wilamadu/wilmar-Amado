package org.choucairtesting.Prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caso1 {
    public static void main(String[] args){

        WebDriver driver;
        String baseURL = "https://www.choucairtesting.com/empleos-testing/";
        String actualResult = "";
        String expectedResult = "CONVOCATORIAS";
        String chromePath = System.getProperty("user.dir") + "\\drivers\\chromedrivers.exe";

        System.getProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.get (baseURL);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Convocatorias")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/form/div[1]/div[4]/input")).click();
        actualResult = driver.findElement(By.cssSelector("//*[@id=\"content\"]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/ul/li[1]/a")).getText();
        System.out.println(actualResult.contentEquals(expectedResult) ?"CONVOCATORIAS!" + actualResult : "CONVOCATORIAS");

        driver.close();

    }

}
