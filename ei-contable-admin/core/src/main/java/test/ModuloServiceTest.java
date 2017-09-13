package test;

import ei.contable.cliente.services.IModuloService;
import ei.contable.cliente.vo.ModuloVO;
import ei.contable.core.services.ModuloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ModuloServiceImplTest {

    @TestConfiguration
    static class ModuloServiceImplTestContextConfiguration {

        @Bean
        public ModuloService moduloService() {
            return new ModuloService();
        }
    }

    @Autowired
    private IModuloService moduloService;
/*
    @MockBean
    private EmployeeRepository employeeRepository;*/

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