package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(1L,
                        "Mateusz",
                        22,
                        LocalDate.of(1999, Month.OCTOBER, 6),
                        "mateuszdylewski@yahoo.com"
                ),
                new Student(2L,
                        "Adam",
                        32,
                        LocalDate.of(1988, Month.APRIL, 28),
                        "adamturek@gmail.com"
                )
        );
    }
}
