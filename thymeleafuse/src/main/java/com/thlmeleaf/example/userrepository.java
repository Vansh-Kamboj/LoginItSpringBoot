package com.thlmeleaf.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
public interface userrepository extends JpaRepository<Register,Integer>{

//public List<Logincont> findByForm(String name);

	//public List<Logincont> findByToo(String address);

	//public List<Logincont> findByFormAndToo(String name, int age);
}

