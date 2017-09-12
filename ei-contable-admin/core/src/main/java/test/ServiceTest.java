package test;

import ei.contable.cliente.gestor.IModuloGestor;
import ei.contable.cliente.vo.ModuloVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceTest {
    @Autowired
    private IModuloGestor moduloGestor;

    @Test
    public void guardarModulo() throws Exception {
        ModuloVO modulo = new ModuloVO;
        moduloGestor.guardarModulo(modulo);
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