import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
@RunAsClient
public class AbstractBase {
    @Deployment(testable = false)
    public static JavaArchive createDeployment() {
        return null;
    }

}
