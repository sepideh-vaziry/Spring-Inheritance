package com.sepideh.inheritance.mapper.singletable;

import com.sepideh.inheritance.dto.singletable.PenDto;
import com.sepideh.inheritance.model.singletable.Pen;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PenMapper {

  PenDto toDto(Pen pen);

  Pen create(PenDto penDto);

  Pen update(PenDto penDto, @MappingTarget Pen pen);

}
