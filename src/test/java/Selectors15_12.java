import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Selectors15_12 extends TestBase {



    @Test
    public void WikiElementsTest() throws InterruptedException {
        //open site
        openSite("https://www.wikipedia.com/");

        selectLangEn();
        initLogin();

        //driver.findElement(By.cssSelector("#js-link-box-ru")).click();
        //select lang en
        //driver.findElement(By.cssSelector("#js-link-box-ru")).click();
        fillLoginForm("kozinevgenii","stekla136");
        driver.findElement((By.id("wpLoginAttempt")).click();
//        driver.findElement(By.id("js-link-box-ru")).click();
//        driver.findElement(By.id("pt-login")).click();
//        driver.findElement(By.name("wpName1")).click();
//        driver.findElement(By.name("wpName1")).clear();
        //driver.findElement(By.name("wpName1")).("kozinevgenii");

        //back
        //fillLoginForm
        driver.findElement(By.id("wpPassword1")).click();
        driver.findElement(By.id("wpPassword1")).clear();
        //driver.findElement(By.id("wpPassword1")).sendKeys("stekla136");
        driver.findElement(By.id("wpLoginAttempt")).click();

        driver.navigate().back();

        //driver.findElement(By.id("//*[@id='js-link-box-ru']")).click();






//    }
//
//
//}









