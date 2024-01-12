import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class FindImage {
     WebDriver driver = new ChromeDriver();
     Data data = new Data();

    private By buttonOpenWindow = By.xpath("//div[@class='TkpKu']//button[@class='r7Rbd jpBZ0']");
    private By openFile = By.xpath("//div[@class='SzA9X sLMUO L2Q39']//input[@type='file']");

    private By textVisualSearch = By.xpath("//div[@class='Aa1sS yvvwE dvBHu oh0KJ Fu4vG']//h1[@class='dvBHu oh0KJ']");


    @Test
    public void findImage() throws InterruptedException {
        driver.get(data.getUrlMainSheet);

        // Используем явное ожидание для поиска кнопки
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(buttonOpenWindow)).click();

        // Теперь ожидаем появления поля для ввода файла
        wait.until(ExpectedConditions.presenceOfElementLocated(openFile));

        // Возможно, также имеет смысл подождать, пока поле станет видимым, если оно изначально скрыто
        //wait.until(ExpectedConditions.visibilityOfElementLocated(openFile));

        // Теперь вводим путь к изображению
        driver.findElement(openFile).sendKeys("C:\\Users\\1\\IdeaProjects\\QA\\src\\images\\931e5f11280f659030cfdd72512d2d0e.png");

        sleep(5000);
        String actualValue = driver.findElement(textVisualSearch).getText();

        Assert.assertEquals("Visual search", actualValue);

    }
}
