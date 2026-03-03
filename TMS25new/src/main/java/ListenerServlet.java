import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;

@WebListener
public class ListenerServlet implements HttpSessionAttributeListener {
    public void attributeAdded(HttpSessionBindingEvent started) {
        if ("login".equals(started.getName())) {
            String login = (String) started.getValue();
            System.out.println("[New log] User " + login);
        }
    }
}
