package dev.jerry.data.course.SpringDataJPA;

import dev.jerry.data.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    public List<Course> findByAuthor(String author);
    public List<Course> findByName(String name);
}
