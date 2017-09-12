package ei.contable.ws;

import ei.contable.cliente.services.IModuloService;
import ei.contable.cliente.vo.ModuloVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
@RequestMapping("configuracionsitemaws/")
public class ConfiguracionSistemaWS {

    @Autowired
    private IModuloService moduloService;

    @PostMapping("guardarModulo")
    public ResponseEntity<Void> guardar(@RequestBody ModuloVO modulo, UriComponentsBuilder builder)
    {
        moduloService.guardarModulo(modulo);
        return new ResponseEntity<Void>(HttpStatus.CREATED);

        /*boolean flag = articleService.addArticle(article);
        if (flag == false) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }*/
        //HttpHeaders headers = new HttpHeaders();
        //headers.setLocation(builder.path("/article/{id}").buildAndExpand(article.getArticleId()).toUri());
        //return new ResponseEntity<Void>(headers, HttpStatus.CREATED);

    }

}
