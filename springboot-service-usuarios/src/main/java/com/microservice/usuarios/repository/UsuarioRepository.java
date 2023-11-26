package com.microservice.usuarios.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.microservice.usuarios.entity.Usuario;

public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long>{
	
	//select u from Usuario u where u.ysername = ?1
	public Usuario findByUsername(String username);
	
	//select u from Usuario u where u.username = ?1 and u.email = ?2
	public Usuario findByUsernameAndEmail(String username, String email);
	
	@Query(value = "select u from Usuario u where u.ysername = ?1")
	public Usuario obtenerPorUsername(String username);
	
	@Query(value = "select u from Usuario u where u.username = ?1 and u.email = ?2")
	public Usuario obtenerPorUsernameYEmail(String username, String email);
}
