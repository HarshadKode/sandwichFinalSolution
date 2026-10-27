package be.abis.sandwich.repository;

import be.abis.sandwich.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {

    Course findCourseByTitleIgnoreCase(String title);

    Course findCourseById(Long id);

}
