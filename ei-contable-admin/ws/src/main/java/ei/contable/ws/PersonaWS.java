package ei.contable.ws;

import ei.contable.cliente.mdl.dto.ArticleDTO;
import ei.contable.cliente.mdl.dto.PersonaDTO;
import ei.contable.cliente.services.IArticleService;
import ei.contable.cliente.services.IPersonaService;
import ei.contable.cliente.vo.PersonaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
@RequestMapping("person")
public class PersonaWS {

    @Autowired
    private IPersonaService servicePersona;

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@RequestBody PersonaVO persona, UriComponentsBuilder builder)
    {
        servicePersona.guardar(persona);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @PostMapping("/guardar2")
    public ResponseEntity<Void> guardar2(@RequestBody PersonaVO persona, UriComponentsBuilder builder)
    {
        servicePersona.guardar2(persona);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @GetMapping("/findById/{id}")
    public ResponseEntity<PersonaDTO> buscarPorId(@PathVariable("id") Integer id )
    {
        PersonaDTO per= servicePersona.buscarPersona(id);
        return new ResponseEntity<PersonaDTO>(per, HttpStatus.OK);
    }

}
