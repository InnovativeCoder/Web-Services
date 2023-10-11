package dev.jerry.data;

import dev.jerry.data.course.jdbc.CourseJDBCRepository;
import dev.jerry.data.course.jdbc.course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

    @Autowired
    private CourseJDBCRepository repository;

    @Override
    public void run(String... args) throws Exception{
        repository.insert(new course(1, "Learn AWS", "jerry"));
        repository.insert(new course(2, "Learn React", "jerry"));
        repository.insert(new course(3, "Learn SQL", "jerry"));

        repository.delete(1);

        System.out.println(repository.findById(3));
        System.out.println(repository.findById(2));
    }
}
