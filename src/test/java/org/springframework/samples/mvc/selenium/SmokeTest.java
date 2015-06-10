package org.springframework.samples.mvc.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class SmokeTest {

    public static final String APP_URL = "http://localhost:8080/spring-mvc-showcase/";
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
    }

    @Test
    public void validateHeader() throws Exception {
        driver.get(APP_URL);
        WebElement headerElement = driver.findElement(By.xpath("/html/body/h1/a"));
        assertEquals("spring-mvc-showcase", headerElement.getText());
    }

    @Test
    public void validateSubHeader() throws Exception {
        driver.get(APP_URL);
        WebElement subHeader = driver.findElement(By.xpath("/html/body/p"));
        assertEquals("Recommended: Using a Web Developer tool such a Firebug to inspect the client/server interaction",
                subHeader.getText());
    }

    @After
    public void tearDown(){
        driver.close();
    }
}

