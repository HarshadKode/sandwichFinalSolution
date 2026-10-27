package be.abis.sandwich.mapper;

import be.abis.sandwich.model.Course;
import be.abis.sandwich.model.Person;
import dto.CourseDTO;
import dto.PersonDTO;

public class CourseMapper {
    public static Course toCourse(CourseDTO courseDTO) {
        return new Course(courseDTO.getTitle());
    }

}
