package be.abis.sandwich.service;

import dto.SandwichUpdatePriceRequestDTO;
import be.abis.sandwich.model.Sandwich;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SandwichService {

    public List<Sandwich> findAllSandwich();
    public Sandwich findSandwichByName(String name);
    public Sandwich findSandwichById(int id);
    public Sandwich addSandwich(Sandwich sandwich);
    public Sandwich changePrice(int id, SandwichUpdatePriceRequestDTO updatePriceRequestDTO);
    public Sandwich deleteSandwich(Sandwich sandwich);

}
