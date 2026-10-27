package be.abis.sandwich.service;

import be.abis.sandwich.model.SandwichOrder;
import be.abis.sandwich.model.SandwichOrderDetail;
import org.springframework.stereotype.Service;

@Service
public interface SandwichOrderService {

    void addSandwichOrderDetail(SandwichOrderDetail sod);
    void printSandwichOrder(SandwichOrder so);
    double calculateSandwichOrderPrice(SandwichOrder so);
}
