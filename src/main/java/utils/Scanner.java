package utils;

import configuration.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Scanner extends BaseClass {
    public static byte[] takeScreen(WebDriver driver, String fileName){
        File screenshotfile=((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.FILE);


        try {
            FileUtils.copyFile(screenshotfile,new File("screen/",fileName+".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return  ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.BYTES);

    }



//    public static File takeScreen (WebDriver driver, String fileName){
//        File screenshotfile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        try {
//            FileUtils.copyFile(screenshotfile,new File("screen/",fileName+".png"));
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return screenshotfile;
//    }
}

