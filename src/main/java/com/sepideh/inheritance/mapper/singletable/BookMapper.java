package com.sepideh.inheritance.mapper.singletable;

import com.sepideh.inheritance.dto.singletable.BookDto;
import com.sepideh.inheritance.model.singletable.Book;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface BookMapper {

  BookDto toDto(Book book);

  Book create(BookDto bookDto);

  Book update(BookDto bookDto, @MappingTarget Book book);

}
