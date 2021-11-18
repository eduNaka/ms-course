package br.com.estudos.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudos.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
