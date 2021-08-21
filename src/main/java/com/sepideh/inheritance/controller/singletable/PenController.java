package com.sepideh.inheritance.controller.singletable;

import com.sepideh.inheritance.dto.singletable.PenDto;
import com.sepideh.inheritance.service.singletable.PenService;
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
@RequestMapping("api/pen")
public class PenController {

  private final PenService penService;

  public PenController(PenService penService) {
    this.penService = penService;
  }

  @PostMapping
  public ResponseEntity<PenDto> create(@RequestBody PenDto penDto) {
    return new ResponseEntity<>(penService.create(penDto), HttpStatus.CREATED);
  }

  @PutMapping
  public ResponseEntity<PenDto> update(@RequestBody PenDto penDto) throws NotFoundException {
    return new ResponseEntity<>(penService.update(penDto), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<PenDto> get(@PathVariable("id") Long id) throws NotFoundException {
    return new ResponseEntity<>(penService.getPen(id), HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Boolean> delete(@PathVariable("id") Long id) {
    penService.delete(id);

    return new ResponseEntity<>(true, HttpStatus.OK);
  }
  
}
