package learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;

@RestController
public class Demo {

    @Autowired
    Count count;

    @RequestMapping("/")
    int home() {
        return count.getCount();
    }

    @RequestMapping("/http-request-demo")
    String httpRequestDemo() throws IOException {
        HttpRequestDemo httpRequestDemo = new HttpRequestDemo();
        return httpRequestDemo.getRequest();
    }
}
