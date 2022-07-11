package com.example.springbooddemo.repository;

import com.example.springbooddemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
