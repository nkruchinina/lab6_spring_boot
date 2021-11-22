package edu.ntudp.sau.kruchinina.javaspringbootlab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DescriptionController {
    @GetMapping("/description")
    public String postcardName (Model model) {
        model.addAttribute("name", "Favourite moments!");
        return "description";
    }

    @GetMapping("/")
    public String init(Model model) {
        model.addAttribute("name", "Nataliia");
        return "index.html";
    }

    @GetMapping("/index")
    public String initIndex(Model model) {
        model.addAttribute("name", "Nataliia");
        return "index.html";
    }
}
