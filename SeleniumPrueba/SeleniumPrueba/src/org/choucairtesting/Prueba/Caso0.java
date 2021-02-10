package org.choucairtesting.Prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caso0 {
    public static void main(String[] args) {
        //Instaciar un objeto WebDriver//
        WebDriver driver;

        //Declarar variables
        String baseURL = "https://www.choucairtesting.com/empleos-testing/";
        String actualResult = "";
        String expectedResult = "empleos testing – Choucair Testing";

        //Indicar localización del chromedriver.exe
        //System.getProperty("use.dir") = C:\..\..\..\SeleniumPrueba//
        System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedrivers.exe");


        //Abrir navegador//
        driver = new ChromeDriver();

        //Navegar a la pagina
        driver.get (baseURL);

        //Obtener el tiltulo
        actualResult = driver.getTitle();

        //Imprimir Resultado Usando operador tenario
        System.out.println(actualResult.contentEquals(expectedResult) ?"Prueba Pasada!" + actualResult : "Prueba Fallada");

        driver.close();

    }
}
