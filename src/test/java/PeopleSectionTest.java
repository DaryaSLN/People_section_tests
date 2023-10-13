import model.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class PeopleSectionTest extends BaseTest {
    @Test
    public void testPeopleSectionAsOwner() {
        boolean peoplePresent = new LoginPage(getDriver())
                .loginAsOwner()
                .isPeoplePresent();

        Assert.assertTrue(peoplePresent);
    }

}
