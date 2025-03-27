package com.jmp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmp.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	@Query("select u from Usuario u where u.email = :param1")
	Usuario findByEmail(@Param("param1") String email);
	
	@Query("select u from Usuario u where u.email = :param1 and u.senha = :param2")
	Usuario findByEmailAndSenha(@Param("param1") String email, @Param("param2") String senha);
	
}
