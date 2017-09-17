package ei.contable.cliente.gestor;

import ei.contable.cliente.mdl.dto.RelacionSistemaFuenteParticipanteDTO;
import ei.contable.cliente.vo.RelacionSistemaFuenteParticipanteVO;

import java.util.List;

/**
 *@author Lenin-PC
 */
public interface IRelacionSistemaFuenteParticipanteGestor {
    /**
     *
     * @param sisFtePar
     */
    void save(RelacionSistemaFuenteParticipanteVO sisFtePar);

    /**
     *
     * @param id
     * @return
     */
    RelacionSistemaFuenteParticipanteDTO getById(Integer id);

    /**
     *
     * @param sisFtePar
     */
    void update(RelacionSistemaFuenteParticipanteVO sisFtePar);

    /**
     *
     * @return
     */
    List<RelacionSistemaFuenteParticipanteDTO> getAll();
}
