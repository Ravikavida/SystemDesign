package com.dsa.systemdesign.Repository;

import com.dsa.systemdesign.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
    Book findBookByTitle(String bookName);
}
