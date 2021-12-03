import Pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HomePageTests extends BaseTests {

    @Test
    public void checkUserDetails() {
        HomePage homePage = signIn.getHomePage();

        //assertEquals(welcome, "What would you like to start?");
    }
}

