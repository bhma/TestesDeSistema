package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automacao {

    @Test
    public void sumTest() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");

        WebDriver navegador = new ChromeDriver();

        navegador.get("https://www.calculadora-online.xyz/");

        // Digita o valor 8
        navegador.findElement(By.id("huit")).click();

        // Verifica se o valor 8 foi digitado
        String valorOito = navegador.findElement(By.id("total")).getText();
        assertEquals("8", valorOito);

        // Digita o operador de soma
        navegador.findElement(By.id("addition")).click();

        // Digita o valor 6
        navegador.findElement(By.xpath("//*[@id=\"six\"]")).click();

        // Digita o operador igual
        navegador.findElement(By.xpath("//*[@id=\"egale\"]")).click();

        // Verificar o resultado
        String resultado = navegador.findElement(By.id("total")).getText();
        int resultadoInt = Integer.parseInt(resultado);

        assertEquals("14", resultado);
        assertEquals(14, resultadoInt);
        assertTrue(resultadoInt != 0);
        assertFalse(resultadoInt == 0);

    }

    @Test
    public void minusTest() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://www.calculadora-online.xyz/");

        // DIgita valor 9
        navegador.findElement(By.id("neuf")).click();
        // Digita valor 4
        navegador.findElement(By.id("quatre")).click();
        // Digita operador menos
        navegador.findElement(By.id("moins")).click();
        // DIgita valor 5
        navegador.findElement(By.id("cinq")).click();
        // Digita valor 9
        navegador.findElement(By.id("neuf")).click();
        // Digita o operador igual
        navegador.findElement(By.xpath("//*[@id=\"egale\"]")).click();

        // Pega o resultado
        String resultado = navegador.findElement(By.id("total")).getText();
        int resultadoInt = Integer.parseInt(resultado);
        
        assertEquals("35", resultado);
        assertEquals(35, resultadoInt);
        assertTrue(resultadoInt != 0);
        assertFalse(resultadoInt == 0);

    }

    @Test
    public void divisionTest() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://www.calculadora-online.xyz/");

        // Digita valor 9
        navegador.findElement(By.id("neuf")).click();
        // Digita valor 4
        navegador.findElement(By.id("quatre")).click();
        // Digita operador menos
        navegador.findElement(By.id("diviser")).click();
        // DIgita valor 5
        navegador.findElement(By.id("un")).click();
        // Digita valor 9
        navegador.findElement(By.id("zero")).click();
        // Digita o operador igual
        navegador.findElement(By.xpath("//*[@id=\"egale\"]")).click();

        // Pega o resultado
        String resultado = navegador.findElement(By.id("total")).getText();
        Double resultadoDouble = Double.parseDouble(resultado);
        
        assertEquals("9.4", resultado);
        assertEquals(9.4, resultadoDouble, resultadoDouble);
        assertTrue(resultadoDouble != 0);
        assertFalse(resultadoDouble == 0);
    }

}
