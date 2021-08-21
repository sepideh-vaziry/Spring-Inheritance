package com.sepideh.inheritance.repository.singletable;

import com.sepideh.inheritance.model.singletable.Pen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PenRepository extends JpaRepository<Pen, Long> {

}
