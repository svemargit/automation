import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Browsers.SAFARI;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTestClass {

    public static void main(String args[]) {
        System.out.println("Starting...");
        Configuration.browser = SAFARI;
        Configuration.startMaximized = true;
        open("https://www.vodafone.cz/");
    }

    @AfterClass(alwaysRun = true)
    private static void afterClass() {
        System.out.println("Cleaning up...");
        closeWebDriver();
    }
}
