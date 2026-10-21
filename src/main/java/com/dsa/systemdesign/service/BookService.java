package com.dsa.systemdesign.service;

import com.dsa.systemdesign.repository.BookRepository;
import com.dsa.systemdesign.dto.BookDto;
import com.dsa.systemdesign.entity.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository){
        this.repository = repository;
    }

    public Book addBook(BookDto bookDto) {
        Book book = new Book();
        book.setAuthor(bookDto.getAuthor());
        book.setTitle(bookDto.getTitle());
        book.setGenre(bookDto.getGenre());
        return repository.save(book);
    }

    @Transactional
    public Book getBook(String booktitle) {
        return repository.findBookByTitle(booktitle);
    }
}
