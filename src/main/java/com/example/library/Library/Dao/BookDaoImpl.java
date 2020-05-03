package com.example.library.Library.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.Library.Book;

public interface BookDaoImpl extends JpaRepository<Book, Long>{



}
