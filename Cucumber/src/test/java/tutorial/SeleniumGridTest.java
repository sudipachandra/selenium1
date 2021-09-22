package tutorial;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridTest {
    public static void main(String args[]) throws Throwable{
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setBrowserName("chrome");
        caps.setPlatform(Platform.MAC);
        URL url = new URL("http://localhost:4444/wd/hub");
        WebDriver driver = new RemoteWebDriver(url,caps);
        //driver.quit();

    }
}
