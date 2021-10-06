package stepDefinitions;

import com.sun.javafx.util.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends Utils {
    @Before
    public void initialise_test(){
        WebDriverManager.chromedriver().setup();
        stepDefinition.driver = new ChromeDriver();
    }
    @After
    public void close_test(){
        stepDefinition.driver.close();
    }
}
