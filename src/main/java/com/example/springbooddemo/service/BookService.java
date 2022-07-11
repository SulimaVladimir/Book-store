package com.example.springbooddemo.service;

import com.example.springbooddemo.model.Book;
import com.example.springbooddemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {


    private final BookRepository bookRepository;
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book findById(Long id){
        return bookRepository.getOne(id);
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public Book createBook(Book book){
        return bookRepository.save(book);

    }

    public void deleteById(Long id){
        bookRepository.deleteById(id);
    }
}
