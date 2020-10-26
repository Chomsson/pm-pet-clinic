package pm.spring.pmpetclinic.controllers;
/* created by PM
  at 26.10.2020 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    @RequestMapping({"/", "/index", "/index.html", ""})
    public String listOwners(){
        return "owners/index";
    }
}
