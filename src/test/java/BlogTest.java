import static org.junit.Assert.assertEquals;

import java.net.URL;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.InitialPage;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlogTest extends AbstractBase {

    @Drone
    private WebDriver browser;

    @ArquillianResource
    private URL baseUrl;

    @Test
    public void testTagCloud(@InitialPage HomePage homePage) {

        assertEquals("mikesir87's blog", browser.getTitle());
        final WebElement element = browser.findElement(By.id("dsq-count-scr"));
        assertEquals("script", element.getTagName());
        assertEquals(27, homePage.getAantalPosts());
    }
}