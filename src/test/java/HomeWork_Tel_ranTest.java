import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.graalvm.compiler.nodes.PauseNode.pause;

public class HomeWork_Tel_ranTest extends TestBase {

    @Test
    public  void  testTopMenu() throws InterruptedException {
        openSite("https://www.tel-ran.com/");
        pause(5000);


    }

    private void pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }
//    @BeforeMethod
////    public void setUp(){
////
////    }
////
////    @AfterMethod
////    public void tearDown(){
////
////    }













}
