package com.example.library.Library.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.library.Library.Library;


@Repository
public interface LibDaoImpl extends JpaRepository<Library, Long> {

	
}
