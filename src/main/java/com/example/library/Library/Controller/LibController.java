package com.example.library.Library.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.Library.Book;
import com.example.library.Library.Library;
import com.example.library.Library.Dao.BookDaoImpl;
import com.example.library.Library.Dao.LibDaoImpl;

@CrossOrigin(origins="*")
@RestController
public class LibController {

	@Autowired
	LibDaoImpl libdao;
	
	@Autowired
	BookDaoImpl bookdao;
	
	@GetMapping("/getall")
	public List<Library> getall(){
		return libdao.findAll();
	}
	
	@GetMapping("/getbooks/{id}")
	public Optional<Book> getbook(@PathVariable("id") long id){
		return bookdao.findById(id);
	}
	
	@PutMapping("/book/update")
	public void update(@RequestBody Book book) {
//		Optional<Book> b = bookdao.findById(book.getId());
			bookdao.save(book);
    } 
	
	
	@PostMapping("/save")
	public void save(@RequestBody Library lib) {
		libdao.save(lib);
	}
	
	@DeleteMapping(path = { "/{id}" })
	public void deleteBook(@PathVariable("id") long id) {
		Library lib = libdao.getOne(id);
		libdao.deleteById(id);
		
	}
}
