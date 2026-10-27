package be.abis.sandwich.service;

import dto.SandwichUpdatePriceRequestDTO;
import be.abis.sandwich.model.Sandwich;
import be.abis.sandwich.repository.SandwichRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SandwichAdminService implements SandwichService {

 @Autowired
 SandwichRepository sandwichRepository;

    @Override
    public List<Sandwich> findAllSandwich() {
        return sandwichRepository.findAll() ;
    }

    @Override
    public Sandwich findSandwichByName(String name) {
        return sandwichRepository.findSandwichByName(name);
    }

    @Override
    public Sandwich findSandwichById(int id) {
        return sandwichRepository.findSandwichById(id);
    }

    @Override
    @Transactional
        public Sandwich addSandwich(Sandwich sandwich) {
//        sandwichRepository.addSandwich(sandwich.getName(), sandwich.getCategory(), sandwich.getDescription(), sandwich.getBasePrice());
        return sandwichRepository.save(sandwich);
    }

    @Override
    @Transactional
    public Sandwich changePrice(int id, SandwichUpdatePriceRequestDTO updatePriceRequestDTO) {
        System.out.println("in admin service updating price of id " + id + " with price "+ updatePriceRequestDTO.getBasePrice() );
        sandwichRepository.updatePrice(id,updatePriceRequestDTO.getBasePrice());
        return sandwichRepository.findSandwichById(id);
    }

    @Override
    @Transactional
    public Sandwich deleteSandwich(Sandwich toDelete) {
        sandwichRepository.delete(toDelete);
        return toDelete;
    }
}
