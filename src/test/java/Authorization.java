import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authorization extends Data {
      private By inputEmail = By.xpath("//label[@class='kY1UI NP3uw']//input[@tabindex='1']");
      private By inputPassword = By.xpath("//label[@class='kY1UI NP3uw']//input[@tabindex='2']");
      private By buttonLogIn =  By.xpath("//form[@class='pQf8x']//button[@tabindex='3']");

    private By getErrorText = By.xpath("//div[@class='ZSK2C']//p[@class='s1dXf oh0KJ']");


    @Test
    public void authorization() {
       WebDriver driver = new ChromeDriver();
       Data data = new Data();

       driver.get(data.getUrlSignIn);

       driver.findElement(inputEmail).sendKeys(data.email);
       driver.findElement(inputPassword).sendKeys(data.password);

       driver.findElement(buttonLogIn).click();
       driver.quit();
    }

    @Test
    public void negAuthorization() {
        WebDriver driver = new ChromeDriver();
        Data data = new Data();

        driver.get(data.getUrlSignIn);

        driver.findElement(inputEmail).sendKeys(data.email);
        driver.findElement(inputPassword).sendKeys(data.password);

        driver.findElement(buttonLogIn).click();

        String getError  = driver.findElement(getErrorText).getText();

        Assert.assertEquals("Invalid email or password.", getError);


    }
}
