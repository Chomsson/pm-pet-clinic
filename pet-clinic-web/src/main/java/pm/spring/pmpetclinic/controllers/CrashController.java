package pm.spring.pmpetclinic.controllers;
/* created by PM
  at 09.11.2020 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CrashController {

    @RequestMapping("/oups")
    public String triggerException(){
       throw new RuntimeException(
               "Expected: controller used to showcase what " + "happens when an exception is thrown"
       );

    }
}
