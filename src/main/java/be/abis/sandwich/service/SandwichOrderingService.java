package be.abis.sandwich.service;

import be.abis.sandwich.model.Course;
import be.abis.sandwich.model.Person;
import be.abis.sandwich.model.SandwichOrder;
import be.abis.sandwich.model.SandwichOrderDetail;
import be.abis.sandwich.repository.SandwichOrderDetailRepository;
import dto.SandwichOrderDetailDTO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SandwichOrderingService implements SandwichOrderService {

    @Autowired
    SandwichOrderDetailRepository sandwichOrderDetailRepository;

    @Autowired
    CourseService courseService;

    @Autowired
    PersonService personService;

    @Override
    @Transactional
    public void addSandwichOrderDetail(SandwichOrderDetail sod) {
        System.out.println("Order Details Service: sod" + sod.toString());


        Person person = personService.findPerson(sod.getPerson().getFirstName(),sod.getPerson().getLastName());
        sod.setPerson(person);

        Course course = courseService.findCourse((sod.getSandwichOrder().getCourse().getTitle()));
        SandwichOrder sandwichOrder =  new SandwichOrder(sod.getSandwichOrder().getOrderDate(),course);

        sod.setSandwichOrder(sandwichOrder);
        sod.setPerson(person);

        sandwichOrderDetailRepository.save(sod);

    }

    @Override
    @Transactional
    public void printSandwichOrder(SandwichOrder so) {

    }

    @Override
    @Transactional
    public double calculateSandwichOrderPrice(SandwichOrder so) {
        return 0;
    }
}
