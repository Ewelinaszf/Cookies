import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Example extends TestBase{


    @Test
    public void test() throws InterruptedException {
// saving the GUI element reference into a "element" variable of WebElement type
        Thread.sleep(5000);
        driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
// Initialize and wait till element(link) became clickable - timeout in 10 seconds
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
// Print the first result
        System.out.println(firstResult.getText());
//        try {
//            new WebDriverWait(driver,  Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("identifierId"))).click();
//            System.out.println("Element was clicked");
//        }
//        catch(TimeoutException e) {
//            System.out.println("Element wasn't clicked");
//        }
//      //  WebElement element = driver.findElement(By.id("identifierId"));
//// entering username
//     //   element.sendKeys("ewelinaszymaniak@gmail.com");
//    //    element.sendKeys(Keys.RETURN);
//        Thread.sleep(5000);
//// entering password
//        driver.findElement(By.id("Passwd")).sendKeys("password");
//// clicking signin button
//        driver.findElement(By.id("signIn")).click();
//// explicit wait - to wait for the compose button to be click-able
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
//// click on the compose button as soon as the "compose" button is visible
//        driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
    }



}