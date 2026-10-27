package dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SandwichOrderDTO {



    private LocalDate orderDate;
    private CourseDTO course;

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public SandwichOrderDTO(LocalDate orderDate, CourseDTO course) {
        this.orderDate = orderDate;
        this.course = course;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public CourseDTO getCourseDTO() {
        return course;
    }

    public void setCourseDTO(CourseDTO course) {
        this.course = course;
    }



}
