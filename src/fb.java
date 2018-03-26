import java.util.concurrent.TimeUnit;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.By;
    import org.openqa.selenium.chrome.ChromeDriver;




        public class fb
       {

        public static void main(String[] args) {
        // TODO Auto-generated method stub

        String expath = "C:\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();



        driver.get("http:\\www.facebook.com");


       

    }

}