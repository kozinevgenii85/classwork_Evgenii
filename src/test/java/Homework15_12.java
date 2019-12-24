import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Homework15_12 extends TestBase {

    @Test
    public void WikiElementsTest() throws InterruptedException {
        openSite("https://htmlacademy.ru/");
//       driver.findElement(By.xpath("//p[@class='start-home__btn-wrapper']")).click();
//       Thread.sleep(5000);
//       driver.findElement(By.xpath("//button[@class='button button--close']")).click();
//       Thread.sleep(5000);
//       driver.findElement(By.xpath("//div[@class='page-footer__item page-footer__item--courses-professions']//div[1]//li[1]")).click();
//       Thread.sleep(5000);
//        driver.findElement(By.xpath("//body//div[1]//div[1]//div[2]//section[1]//a[2]//h2[1]")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//section[@id='part297']//div[@class='chapter__wagon chapter__wagon--right']//button[@class='chapter__on button button--transparent']")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("")).click();
//        Thread.sleep(5000);
        driver.findElement(By.cssSelector("p.start-home__btn-wrapper")).click();
       Thread.sleep(5000);
        driver.findElement(By.cssSelector("button.button--close")).click();
       Thread.sleep(5000);
       driver.findElement(By.cssSelector("div.page-footer__item.page-footer__item--courses-professions > div:nth-child(1) > ul > li:nth-child(1)")).click();
       Thread.sleep(5000);
      driver.findElement(By.cssSelector("div.module-group-container > div:nth-child(1) > div > div.module-group__right > section:nth-child(1) > a.module__title-link > h2")).click();
       Thread.sleep(5000);
        driver.findElement(By.cssSelector("#part297 > div > div.chapter__wagon.chapter__wagon--right > div.chapter__col.chapter__col--practice > button")).click();
        Thread.sleep(5000);
//        driver.findElement(By.cssSelector("button.body > section > section:nth-child(3) > div > div > div.chapter__content-wrap > div > div > a")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.cssSelector("button.button--close")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.cssSelector("button.button--close")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.cssSelector("button.button--close")).click();
//        Thread.sleep(5000);
//       // driver.navigate(By.name("Windows")).click();
        //driver.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(@class,'')][contains(text(),\"Today's Deals\")]")).click();






    }
}
