package com.example.alo.demo.service;

import com.example.alo.demo.entity.BookEntity;
import com.example.alo.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository repository;

    public BookRepository getRepository() {
        return this.repository;
    }

    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }


    public List<BookEntity> viewAll() {
        return this.getRepository().findAll();
    }


    public BookEntity create(BookEntity bookEntity) {
        return this.getRepository().save(bookEntity);
    }
}
