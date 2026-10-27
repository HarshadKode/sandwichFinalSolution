package be.abis.sandwich.service;

import be.abis.sandwich.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {

    public List<Course> findAllCourses();
    public Course findCourse(Long id);
    public Course findCourse(String title);
    public Course addCourse(Course course);
}
