package be.abis.sandwich.service;

import be.abis.sandwich.model.Course;
import be.abis.sandwich.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbisCourseService implements CourseService {
    @Autowired
    CourseRepository courseRepository;

    @Override
    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course findCourse(Long id) {
        return courseRepository.findCourseById(id);
    }

    @Override
    public Course findCourse(String title) {
        return courseRepository.findCourseByTitleIgnoreCase(title);
    }

    @Override
    public Course addCourse(Course c) {
        return courseRepository.save(c);
    }

}
