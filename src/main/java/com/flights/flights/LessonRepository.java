package com.flights.flights;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lessons")

public interface LessonRepository extends CrudRepository<Lesson, Long> {

}
