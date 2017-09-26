import java.util.List;

import org.jboss.arquillian.graphene.GrapheneElement;
import org.jboss.arquillian.graphene.page.Location;
import org.openqa.selenium.support.FindBy;

@Location("")
public class HomePage {

    //  @FindBy(css = "$$(\".post-inner-content .row\")")
    @FindBy(xpath = "//div[@class=\"post-inner-content\"]/div")
    private List<GrapheneElement> addLinks;

    public int getAantalPosts() {
        return addLinks.size();
    }
}
