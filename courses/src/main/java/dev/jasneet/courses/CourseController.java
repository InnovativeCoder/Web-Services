package dev.jasneet.courses;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"Web Services", "Joseph"),
                new Course(2,"Web Development", "Harry"),
                new Course(3,"Machine Learning", "James"),
                new Course(4,"JavaScript", "dsdf"),
                new Course(4,"fadsa", "dsfd"),
                new Course(4,"asd", "dsfdsfd"),
                new Course(4,"JavaScript", "Tom"),
                new Course(4,"JavaScript", "Tosasasasm")
        );
    }
}
