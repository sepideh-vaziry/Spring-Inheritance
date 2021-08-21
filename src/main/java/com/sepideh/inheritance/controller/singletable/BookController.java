package com.sepideh.inheritance.controller.singletable;

import com.sepideh.inheritance.dto.singletable.BookDto;
import com.sepideh.inheritance.service.singletable.BookService;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/book")
public class BookController {

  private final BookService bookService;

  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @PostMapping
  public ResponseEntity<BookDto> create(@RequestBody BookDto bookDto) {
    return new ResponseEntity<>(bookService.create(bookDto), HttpStatus.CREATED);
  }

  @PutMapping
  public ResponseEntity<BookDto> update(@RequestBody BookDto bookDto) throws NotFoundException {
    return new ResponseEntity<>(bookService.update(bookDto), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<BookDto> get(@PathVariable("id") Long id) throws NotFoundException {
    return new ResponseEntity<>(bookService.getBook(id), HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Boolean> delete(@PathVariable("id") Long id) {
    bookService.delete(id);

    return new ResponseEntity<>(true, HttpStatus.OK);
  }

}
