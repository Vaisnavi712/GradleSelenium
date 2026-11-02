
package org.example;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MainTest {

    @Test
    public void testWebsite() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");

        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("data:text/html,<title>Gradle Selenium Test</title>");

            String title = driver.getTitle();

            Assert.assertEquals(title, "Gradle Selenium Test");

            System.out.println("Selenium Test Passed!");

        } finally {
            driver.quit();
        }
    }
}
