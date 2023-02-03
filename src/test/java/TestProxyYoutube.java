import configuration.BaseProxy;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.Scanner;

public class TestProxyYoutube extends BaseProxy {
    @BeforeClass
    public static void openPage() {
        driver.get("https://www.youtube.com/");
    }

    @Test
    public void test1() {
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//*[@id=\"header-bar\"]/header/div/button")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"header-bar\"]/header/ytm-searchbox/form/div[1]/input[1]")).sendKeys("No war");
        driver.findElement(By.xpath("//*[@id=\"header-bar\"]/header/ytm-searchbox/form/div[1]/input[1]")).sendKeys(Keys.ENTER);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
       @Test
        public void test2() {
            Scanner.takeScreen(driver, "png2");
        }
    }

