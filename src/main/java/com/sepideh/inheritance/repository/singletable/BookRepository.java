package com.sepideh.inheritance.repository.singletable;

import com.sepideh.inheritance.model.singletable.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
