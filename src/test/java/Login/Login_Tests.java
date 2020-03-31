package Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
class LoginTests {
    private WebDriver driver;
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver");
        driver = new ChromeDriver();
            driver.get("https://monosnap.com/welcome");
            Thread.sleep(5000);
            //1. maximize the window
            driver.manage().window().maximize();
            System.out.println(driver.getTitle());
            driver.findElement(By.className("headButton")).click();
            driver.findElement(By.xpath("//input[@class='w-100 textInput in']")).sendKeys("sulaimondamola96@gmail.com");
        driver.findElement(By.xpath("//input[@class='w-100 textInput']")).sendKeys("oyindamola@3029");
        driver.findElement(By.xpath("//button[@class='login']")).click();

    }
        public static void main(String[] args) throws InterruptedException {
            LoginTests test = new LoginTests();
            test.setUp();
        }
    }

