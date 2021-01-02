package com.example.alo.demo.controller;

import com.example.alo.demo.entity.BookEntity;
import com.example.alo.demo.repository.BookRepository;
import com.example.alo.demo.service.BookService;
import com.example.alo.demo.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class demoController {
//    @PostMapping("/sum")
//    public int result(@RequestBody Number number){
//        return number.sum();
//    }
//    @GetMapping("/sum2")
//        public int result2(@RequestParam("a") int a, @RequestParam("b") int b){
//        return a+b;
//    }
   @Autowired BookService bookService;



    @GetMapping("/books")
    public List<BookEntity> viewAll(){
        return bookService.viewAll();
    }
    @PostMapping("/books")
    public BookEntity create(@RequestBody BookEntity bookEntity){
        return bookService.create(bookEntity);
    }
}
