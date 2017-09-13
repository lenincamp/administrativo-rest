package test;

import ei.contable.cliente.gestor.IModuloGestor;
import ei.contable.cliente.vo.ModuloVO;
import ei.contable.core.services.ModuloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ModuloServiceTest {

    private ModuloService moduloService;
    private IModuloGestor modu;



    /*@TestConfiguration
    static class ModuloServiceTestContextConfiguration {

        @Bean
        public ModuloService moduloService() {
            return new ModuloService();
        }
    }

    @Autowired
    private ModuloService moduloService;

    @MockBean
    private IModuloGestor moduloGestor;*/


    @Test
    public void guardarModulo() throws Exception {
        ModuloVO modulo = new ModuloVO();
        modulo.setCodigo("codigo");
        modulo.setNombre("nombre");
        modulo.setDescripcion("Desc");
        modulo.setCodigoUsuarioRegistro(21);
        moduloService.guardarModulo(modulo);
    }

    @Test
    public void buscarModuloPorId() throws Exception {
    }

    @Test
    public void editarModulo() throws Exception {
    }

    @Test
    public void eliminarModulo() throws Exception {
    }

}