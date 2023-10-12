package dev.jerry.data;

import dev.jerry.data.course.Course;
import dev.jerry.data.course.jdbc.CourseJDBCRepository;
import dev.jerry.data.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

//    @Autowired
//    private CourseJDBCRepository repository;

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception{
        repository.insert(new Course(1, "Learn AWS", "jerry"));
        repository.insert(new Course(2, "Learn React", "jerry"));
        repository.insert(new Course(3, "Learn SQL", "jerry"));

//        repository.delete(1);
        repository.deleteById(1);

        System.out.println(repository.findById(3));
        System.out.println(repository.findById(2));
    }
}
