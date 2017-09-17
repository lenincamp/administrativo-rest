package ei.contable.cliente.services;

import ei.contable.cliente.mdl.dto.RelacionSistemaFuenteParticipanteDTO;
import ei.contable.cliente.vo.RelacionSistemaFuenteParticipanteVO;

import java.util.List;

/**
 * @author Lenin-PC
 */
public interface IRelacionSistemaFuenteParticipanteService {
    void save(RelacionSistemaFuenteParticipanteVO modulo);
    RelacionSistemaFuenteParticipanteDTO getById(Integer id);
    void update(RelacionSistemaFuenteParticipanteVO modulo);
    List<RelacionSistemaFuenteParticipanteDTO> getAll();
}
