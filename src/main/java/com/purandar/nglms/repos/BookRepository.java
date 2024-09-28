package com.purandar.nglms.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.purandar.nglms.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
