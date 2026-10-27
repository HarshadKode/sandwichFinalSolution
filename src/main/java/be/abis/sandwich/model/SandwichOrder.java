package be.abis.sandwich.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

    @Data
    @Entity
    @Table(name = "sandwich_orders")
    public class SandwichOrder {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "order_date", nullable = false)
        private LocalDate orderDate;

        @ManyToOne
        @JoinColumn(name = "course_id", nullable = false)
        private Course course;


        @OneToMany
        private List<SandwichOrderDetail> details = new ArrayList<>();


        public SandwichOrder() {

        }

        public SandwichOrder(LocalDate orderDate, Course course) {
            this.orderDate = orderDate;
            this.course = course;
        }

        public LocalDate getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(LocalDate orderDate) {
            this.orderDate = orderDate;
        }

        public Course getCourse() {
            return course;
        }

        public void setCourse(Course course) {
            this.course = course;
        }

    }

