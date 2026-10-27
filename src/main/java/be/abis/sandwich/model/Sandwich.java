package be.abis.sandwich.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.repository.cdi.Eager;

import java.util.Objects;

@Data
@Entity
@Table(name = "sandwiches")
public class Sandwich {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @JsonIgnore
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "category")
    private String category;

    @Column(name = "base_price")
    private double basePrice;

    public Sandwich(){}

    public Sandwich(int id, String name, String description, String category) {
        this.id=id;
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public Sandwich(int id,String name, String description, String category, double basePrice) {
        this(id,name, description, category);
        this.basePrice = basePrice;
    }

    public Sandwich(String name, String description, String category, double basePrice) {

        this.name = name;
        this.description = description;
        this.category = category;
        this.basePrice = basePrice;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }


}
