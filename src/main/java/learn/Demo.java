package learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @Autowired
    Count count;

    @RequestMapping("/")
    int home() {
        return count.getCount();
    }
}
