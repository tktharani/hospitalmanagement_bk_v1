package com.pro.myproject.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pro.myproject.Model.Register;


public interface RegisterRepo extends JpaRepository<Register, Integer> {
	@Query(value =" SELECT * FROM REGISTER WHERE  username = :username AND password = :password",nativeQuery = true)
	List<Register> findBy(String username,String password);


}
