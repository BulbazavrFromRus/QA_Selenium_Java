import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration extends Data{

    //private By buttonJoinFree =
            //By.xpath("//div[@class='Lgygz IKU9M']");
            private By inputFirstName = By.xpath("//div[@class='form-group']//input[@id='user_first_name']");
            private By inputLastName = By.xpath("//div[@class='form-group']//input[@id='user_last_name']");
            private By inputEmail = By.xpath("//div[@class='form-group']//input[@id='user_email']");
            private By inputUsername = By.xpath("//div[@class='form-group']//input[@id='user_username']");
            private By inputPassword = By.xpath("//div[@class='form-group']//input[@id='user_password']");

            private By buttonJoin  =By.xpath("//div[@class='form-group']//input[@class='btn btn-default btn-block-level']");

            @Test
            public void registration(){
                WebDriver driver = new ChromeDriver();
                Data getDate =  new Data();

                driver.get(getDate.getUrl);
                //here must be button but i will not have it
                //driver.findElement()

                driver.findElement(inputFirstName).sendKeys(getDate.firstName);
                driver.findElement(inputLastName).sendKeys(getDate.lastName);
                driver.findElement(inputEmail).sendKeys(getDate.email);
                driver.findElement(inputUsername).sendKeys(getDate.userName);
                driver.findElement(inputPassword).sendKeys(getDate.password);
                driver.findElement(buttonJoin).click();
            }
}
