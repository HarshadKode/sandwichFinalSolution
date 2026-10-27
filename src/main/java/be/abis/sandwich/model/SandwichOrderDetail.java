package be.abis.sandwich.model;

import be.abis.sandwich.enumeration.BreadType;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sandwich_order_details")
public class SandwichOrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "sandwich_id", nullable = false)
    private Sandwich sandwich;

    @Column(nullable = false)
    private int amount = 1;

    @Enumerated(EnumType.STRING)
    @Column(name = "bread_type", nullable = false)
    private BreadType breadType;

    @Column(nullable = false)
    private boolean vegetables;

    @Column(name = "commentz")
    private String commentz;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "sandwich_order_id", nullable = false)
    private SandwichOrder sandwichOrder;


    public SandwichOrderDetail(){}

    public SandwichOrderDetail(Sandwich sandwich, int amount, BreadType breadType, boolean vegetables, String commentz, Person person) {
        this.sandwich = sandwich;
        this.amount = amount;
        this.breadType = breadType;
        this.vegetables = vegetables;
        this.commentz = commentz;
        this.person = person;
    }

    public Sandwich getSandwich() {
        return sandwich;
    }

    public void setSandwich(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public boolean isVegetables() {
        return vegetables;
    }

    public void setVegetables(boolean vegetables) {
        this.vegetables = vegetables;
    }

    public String getComment() {
        return commentz;
    }

    public void setComment(String comment) {
        this.commentz = comment;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public SandwichOrder getSandwichOrder() {
        return sandwichOrder;
    }

    public void setSandwichOrder(SandwichOrder sandwichOrder) {
        this.sandwichOrder = sandwichOrder;
    }
}
