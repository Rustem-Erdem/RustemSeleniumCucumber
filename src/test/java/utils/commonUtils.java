package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class commonUtils {
    public static String getURL(String PropFileName) throws IOException {
    Properties prop = new Properties();
    FileInputStream in = new FileInputStream(PropFileName);
    prop.load(in);
    return prop.getProperty("url");

}
    public static void getScreenshot(WebDriver driver, String fileName){
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String directoryName = "src/test/Resources/screenshots/";
        String FileName = directoryName + fileName + "_" + System.currentTimeMillis()+".png";
        try{
            FileUtils.copyFile(screenshotFile,new File(FileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
