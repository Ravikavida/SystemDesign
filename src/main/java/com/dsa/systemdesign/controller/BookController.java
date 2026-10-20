package com.dsa.systemdesign.controller;


import com.dsa.systemdesign.dto.BookDto;
import com.dsa.systemdesign.entity.Book;
import com.dsa.systemdesign.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book/v1")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService =  bookService;
    }

    @PostMapping("/addbook")
    public ResponseEntity<Book> addBook(@RequestBody BookDto bookDto){
        Book book = bookService.addBook(bookDto);
            return ResponseEntity.ok(book);
    }

    @GetMapping("/{booktitle}")
    public ResponseEntity<Book> fetch(@PathVariable("booktitle") String booktitle){
        Book book = bookService.getBook(booktitle);
        return ResponseEntity.ok(book);
    }

}
