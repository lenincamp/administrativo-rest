package ei.contable.ws;

import ei.contable.cliente.mdl.dto.ModuloDTO;
import ei.contable.cliente.services.IModuloService;
import ei.contable.cliente.vo.ModuloVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collection;

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

    @GetMapping("mobuloPorId/{id}")
    public ResponseEntity<ModuloDTO> getArticleById(@PathVariable("id") Integer id) {
        ModuloDTO modulo = moduloService.buscarModuloPorId(id);
        return new ResponseEntity<ModuloDTO>(modulo, HttpStatus.OK);
    }

    @GetMapping("mobuloAll")
    public ResponseEntity<Collection<ModuloDTO>> getAll() {
        Collection<ModuloDTO> modulo = moduloService.getAll();
        return new ResponseEntity<Collection<ModuloDTO>>(modulo, HttpStatus.OK);
    }

}
