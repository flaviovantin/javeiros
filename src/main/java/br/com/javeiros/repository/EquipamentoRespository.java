package br.com.javeiros.repository;

import br.com.javeiros.entity.EquipamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipamentoRespository extends JpaRepository<EquipamentoEntity, Long> {

}
