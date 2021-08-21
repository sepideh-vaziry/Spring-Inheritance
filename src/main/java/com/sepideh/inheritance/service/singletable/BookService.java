package com.sepideh.inheritance.service.singletable;

import com.sepideh.inheritance.dto.singletable.BookDto;
import com.sepideh.inheritance.mapper.singletable.BookMapper;
import com.sepideh.inheritance.model.singletable.Book;
import com.sepideh.inheritance.repository.singletable.BookRepository;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public class BookService {
  
  private final BookRepository bookRepository;
  private final BookMapper bookMapper;

  public BookService(BookRepository bookRepository, BookMapper bookMapper) {
    this.bookRepository = bookRepository;
    this.bookMapper = bookMapper;
  }

  public BookDto create(BookDto bookDto) {
//    bookDto.setProductId(null);
    Book book = bookRepository.save(
        bookMapper.create(bookDto)
    );

    return bookMapper.toDto(book);
  }

  public BookDto update(BookDto bookDto) throws NotFoundException {
    Book book = bookRepository.findById(bookDto.getProductId())
        .orElseThrow(NotFoundException::new);

    bookDto = bookMapper.toDto(
        bookRepository.save(bookMapper.update(bookDto, book))
    );

    return bookDto;
  }

  public BookDto getBook(Long id) throws NotFoundException {
    Book book = bookRepository.findById(id)
        .orElseThrow(NotFoundException::new);

    return bookMapper.toDto(book);
  }

  public void delete(Long id) {
    bookRepository.deleteById(id);
  }
  
}
