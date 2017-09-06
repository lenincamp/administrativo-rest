package ei.contable.cliente.persistencia.dao;

import ei.contable.cliente.mdl.dto.PersonaDTO;

public interface IPersonaDAO extends IGenericDAO<PersonaDTO> {


    void guardar(PersonaDTO persona);


}
