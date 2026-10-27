package be.abis.sandwich.mapper;

import be.abis.sandwich.model.Person;
import be.abis.sandwich.model.Sandwich;
import be.abis.sandwich.model.SandwichOrder;
import be.abis.sandwich.model.SandwichOrderDetail;
import dto.SandwichOrderDTO;
import dto.SandwichOrderDetailDTO;

import static be.abis.sandwich.mapper.PersonMapper.toPerson;
import static be.abis.sandwich.mapper.SandwichOrderMapper.toSandwichOrder;

public class SandwichOrderDetailMapper {


    public static SandwichOrderDetail toSandwichOrderDetail(SandwichOrderDetailDTO  sandwichOrderDetailDTO){
        SandwichOrderDetail sod = new SandwichOrderDetail();
        sod.setAmount(sandwichOrderDetailDTO.getAmount());
        sod.setBreadType(sandwichOrderDetailDTO.getBreadType());
        sod.setVegetables(sandwichOrderDetailDTO.isVegetables());
        sod.setComment(sandwichOrderDetailDTO.getComment());

        SandwichOrder so =   toSandwichOrder(sandwichOrderDetailDTO.getSandwichOrderDTO());
        sod.setSandwichOrder(so);

        Person p =   toPerson(sandwichOrderDetailDTO.getPersonDTO());
        sod.setPerson(p);

        Sandwich sandwich = new Sandwich(sandwichOrderDetailDTO.getId(), sandwichOrderDetailDTO.getName(), sandwichOrderDetailDTO.getDescription(), sandwichOrderDetailDTO.getCategory(), sandwichOrderDetailDTO.getBasePrice() );
        sod.setSandwich(sandwich);


        return sod;
    }

}
