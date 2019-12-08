package tt.kole.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Create With: checkline
 * Create By: kole
 * Date: 2019/12/8
 */
@RestController()
public class HomeController {

    private String appName = "home";

    @GetMapping("/index")
    public String index(String name) {
        return this.appName + "  ??242  " +  name + " = kole =" + (new Date()).toLocaleString();
    }

}
