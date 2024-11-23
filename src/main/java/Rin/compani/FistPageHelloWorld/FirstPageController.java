package Rin.compani.FistPageHelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstPageController {
    @GetMapping("/")
    public String hello() {
        return "<h1><center><font color=red>Hello world!</font><p> It's my first page in spring web.</center></h1>";
    }

}
