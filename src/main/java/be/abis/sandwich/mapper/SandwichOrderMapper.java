package be.abis.sandwich.mapper;

import be.abis.sandwich.model.SandwichOrder;
import be.abis.sandwich.model.SandwichOrderDetail;
import dto.SandwichOrderDTO;
import dto.SandwichOrderDetailDTO;

import static be.abis.sandwich.mapper.CourseMapper.toCourse;

public class SandwichOrderMapper {


    public static SandwichOrder toSandwichOrder(SandwichOrderDTO sandwichOrderDTO){
        return new SandwichOrder(sandwichOrderDTO.getOrderDate(),toCourse(sandwichOrderDTO.getCourseDTO()));
    }
}
