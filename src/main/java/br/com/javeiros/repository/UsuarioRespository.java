package br.com.javeiros.repository;

import br.com.javeiros.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRespository extends JpaRepository<UsuarioEntity, Long> {

}
