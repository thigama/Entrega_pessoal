import org.springframework.stereotype.Controller;

import com.recode.entregapessoal.model.CadastroModel;

@Controller
public class CadastroController {

    List<CadastroModel> cadastro = new ArrayList<>();

    @GetMapping("/cadastro")
    public String cadastro(){
        return "pages/cadastro";
    }

    @PostMapping("/cadastro")
    public String cadastro(CadastroModel CadastroModel){
        cadastro.add(new CadastroModel(CadastroModel.getTxtNome(), CadastroModel.getTxtCPF(), CadastroModel.getDataNasc(), CadastroModel.getTxtEmail(), CadastroModel.getTxtTelefone()))
        
        return "redirect:/pages/confirmarcadastro";
    }

    @GetMapping("/confirmarcadastro")
    public ModeAndView confirmarcadastro(){
        ModeAndView mv = new ModeAndView(viewName: "confirmarcadastro");
        mv.addObject(attributeName: "cadastro", cadastro);
        return mv;
    }


}
