package com.example.alo.demo.service;

import com.example.alo.demo.entity.BookEntity;
import com.example.alo.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface BookService {
    public List<BookEntity> viewAll();
    public BookEntity create(BookEntity bookEntity);
}
