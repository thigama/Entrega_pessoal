import org.springframework.stereotype.Controller;

@Controller
public class TaskController {

    @GetMapping("/create")
    public String create(){
        return "pages/cadastro";
    }

}
