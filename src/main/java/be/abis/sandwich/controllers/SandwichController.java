package be.abis.sandwich.controllers;


import be.abis.sandwich.exception.PriceCanNotBeUpdatedException;
import be.abis.sandwich.exception.SandwichAlreadyExistsException;
import be.abis.sandwich.exception.SandwichCanNotBeDeletedException;
import dto.SandwichUpdatePriceRequestDTO;
import be.abis.sandwich.model.Sandwich;
import be.abis.sandwich.service.SandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sandwiches")
public class SandwichController {

    @Autowired
    SandwichService sandwichService;

    @GetMapping("")
    public List<Sandwich> getAllSandwich(){
        return sandwichService.findAllSandwich();
    }

    @PostMapping(path="")
    public void addSandwich(@RequestBody Sandwich sandwich) throws SandwichAlreadyExistsException {
        sandwichService.addSandwich(sandwich);
    }

    @DeleteMapping("{id}")
    public void deleteSandwich(@PathVariable("id") int id) throws SandwichCanNotBeDeletedException {
        sandwichService.deleteSandwich(sandwichService.findSandwichById(id));
    }

    @PutMapping("{id}/price")
    public void changePrice(@PathVariable("id") int id, @RequestBody SandwichUpdatePriceRequestDTO updatePriceRequestDTO) throws PriceCanNotBeUpdatedException {
 //       System.out.println("changing price to new price= " + sandwich.getBasePrice());

        sandwichService.changePrice(id, updatePriceRequestDTO);
    }


}
