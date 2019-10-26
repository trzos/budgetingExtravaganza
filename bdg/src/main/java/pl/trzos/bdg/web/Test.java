package pl.trzos.bdg.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class Test {

    @ResponseBody
    public String test(){
        return "Hello";
    }
}
