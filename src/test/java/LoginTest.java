public class LoginTest {
    private ChromeDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void login(){
        driver.get("http://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("#login button")).click();
        assertTrue("Login failed",
                driver.findElement(By.cssSelector(".flash.success")).isDisplayed());

    }
Threed Sleep(1);
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
