package com.sepideh.inheritance.service.singletable;

import com.sepideh.inheritance.dto.singletable.PenDto;
import com.sepideh.inheritance.mapper.singletable.PenMapper;
import com.sepideh.inheritance.model.singletable.Pen;
import com.sepideh.inheritance.repository.singletable.PenRepository;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PenService {
  
  private final PenRepository penRepository;
  private final PenMapper penMapper;

  public PenService(PenRepository penRepository, PenMapper penMapper) {
    this.penRepository = penRepository;
    this.penMapper = penMapper;
  }

  public PenDto create(PenDto penDto) {
    penDto.setProductId(null);
    Pen pen = penRepository.save(
        penMapper.create(penDto)
    );

    return penMapper.toDto(pen);
  }

  public PenDto update(PenDto penDto) throws NotFoundException {
    Pen pen = penRepository.findById(penDto.getProductId())
        .orElseThrow(NotFoundException::new);

    penDto = penMapper.toDto(
        penRepository.save(penMapper.update(penDto, pen))
    );

    return penDto;
  }

  public PenDto getPen(Long id) throws NotFoundException {
    Pen pen = penRepository.findById(id)
        .orElseThrow(NotFoundException::new);

    return penMapper.toDto(pen);
  }

  public void delete(Long id) {
    penRepository.deleteById(id);
  }
  
}
