import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tel_ran_Torment extends TestBase {
    @Test
    public void testTopMenu() throws InterruptedException {
        openSite("https://www.tel-ran.com/");
        pause(5000);

        String menuTitle = getString(By.xpath("//nav//li[2]"));

        driver.findElement(By.xpath("//nav//li[2]")).click();
        pause(5000);

        String pageTitle = getString(By.cssSelector("h1"));
        //menu:nnnnn; page:nnnnnn
        System.out.println("menu:" + menuTitle + "page" + pageTitle);

        Assert.assertEquals(menuTitle, pageTitle);

        driver.navigate().back();


    }

    private String getString(By xpath) {
        return driver.findElement(xpath).getText();
    }

    private void pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }

}
