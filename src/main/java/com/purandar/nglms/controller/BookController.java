package com.purandar.nglms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.purandar.nglms.model.Book;
import com.purandar.nglms.repos.BookRepository;

@Controller
public class BookController {

	@Autowired
	private BookRepository bookRepository;

	@GetMapping("/")
	public String listBooks(Model model) {

		model.addAttribute("books", bookRepository.findAll());
		return "books";

	}

	@GetMapping("/book/new")
	public String showCreateForms(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return "create_book";

	}

	@PostMapping("/books")
	public String saveBook(Book book) {
		bookRepository.save(book);
		return "redirect:/";
	}
	

	@GetMapping("/book/{id}")
	public String showUpdateForms(@PathVariable("id") Long id, Model model) {
		Book book = bookRepository.findById(id).get();
		model.addAttribute("book", book);
		return "update_book";

	}
	
	@GetMapping("/book/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id) {
        bookRepository.deleteById(id);
        return "redirect:/";  // Redirect back to the list of books
    }
	
	@PostMapping("/book/update")
	public String updateBook(Book book) {
		bookRepository.save(book);
		return "redirect:/";
	}
	

	
	
}
