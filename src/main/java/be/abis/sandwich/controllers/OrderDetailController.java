package be.abis.sandwich.controllers;


import be.abis.sandwich.mapper.SandwichOrderDetailMapper;
import be.abis.sandwich.model.SandwichOrderDetail;
import be.abis.sandwich.service.SandwichOrderingService;
import dto.SandwichOrderDetailDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderDetailController {

    @Autowired
    SandwichOrderingService sandwichOrderingService;

    @PostMapping(path = "details")
    public void addSandwichOrderDetail(@RequestBody SandwichOrderDetailDTO sandwichOrderDetailDTO){
        System.out.println("sandwichOrderDetailDTO: " + sandwichOrderDetailDTO.toString());
        SandwichOrderDetail sod = SandwichOrderDetailMapper.toSandwichOrderDetail(sandwichOrderDetailDTO);
        System.out.println("sod: "+ sod.toString());
        sandwichOrderingService.addSandwichOrderDetail(sod);
    }


    @PostMapping(path = "detailsdemo")
    public void addSandwichOrderDetailDemo(@RequestBody SandwichOrderDetail SandwichOrderDetail){

        System.out.println("sod: "+ SandwichOrderDetail.toString());
        sandwichOrderingService.addSandwichOrderDetail(SandwichOrderDetail);
    }

}
