package com.lf.mp.generator.tb.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@Controller
public class GlobalController {

    @GetMapping("/")
    public String query() {
        return "redirect:/swagger-ui.html";
    }
}
