package dev.jasneet.soap.soap.service;

import dev.jasneet.soap.soap.bean.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourseDetailsService {
    private static List<Course> courses = new ArrayList<>();

    static {

        Course course1 = new Course(1, "Spring", "Spring course");
        courses.add(course1);

        Course course2 = new Course(2, "Spring MVC", "Course on Sporing MVC");
        courses.add(course2);

        Course course3 = new Course(3, "Spring Web", "Spring Web Course");
        courses.add(course3);

        Course course4 = new Course(4, "Maven", "Course on Maven");
        courses.add(course4);

    }

    // /course/id
    // fingById(id)

    public Course findById(int id){
        for(Course course: courses){
            if(course.getId()==id){
                return course;
            }
        }
        return null;
    }

    // /course
    // findAll()

    public List<Course> findAll() {
        return courses;
    }
}
