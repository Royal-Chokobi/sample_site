package kollus_service.sample_site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sample")
public class testController {

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public ModelAndView test(Model model) {

        return new ModelAndView("hello_world");
    }

}
