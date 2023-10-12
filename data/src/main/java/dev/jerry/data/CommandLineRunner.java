package dev.jerry.data;

import dev.jerry.data.course.Course;
import dev.jerry.data.course.SpringDataJPA.CourseSpringDataJpaRepository;
import dev.jerry.data.course.jdbc.CourseJDBCRepository;
import dev.jerry.data.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

//    @Autowired
//    private CourseJDBCRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;


    @Override
    public void run(String... args) throws Exception{
        repository.save(new Course(1, "Learn AWS", "jerry"));
        repository.save(new Course(2, "Learn React", "jerry"));
        repository.save(new Course(3, "Learn SQL", "jerry"));

//        repository.delete(1);
        repository.deleteById(1l);

        System.out.println(repository.findById(3l));
        System.out.println(repository.findById(2l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("jerry"));
        System.out.println(repository.findByName("Learn React"));
    }
}
