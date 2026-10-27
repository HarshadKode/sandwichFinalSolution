package dto;

import be.abis.sandwich.enumeration.BreadType;
import lombok.Data;

@Data
public class SandwichOrderDetailDTO {

        private int id;
        private String name;
        private String description;
        private String category;
        private double basePrice;
        private int amount;
        private BreadType breadType;
        private boolean vegetables;
        private String comment;
        private PersonDTO person;
        private SandwichOrderDTO sandwichOrder;

        // Constructors
        public SandwichOrderDetailDTO() {}

        public SandwichOrderDetailDTO(int id, String name, String description, String category,
                                      double basePrice, int amount, BreadType breadType,
                                      boolean vegetables, String comment, PersonDTO person,
                                      SandwichOrderDTO sandwichOrder) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.category = category;
            this.basePrice = basePrice;
            this.amount = amount;
            this.breadType = breadType;
            this.vegetables = vegetables;
            this.comment = comment;
            this.person = person;
            this.sandwichOrder = sandwichOrder;
        }

        // Getters and Setters
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }

        public String getCategory() { return category; }
        public void setCategory(String category) { this.category = category; }

        public double getBasePrice() { return basePrice; }
        public void setBasePrice(double basePrice) { this.basePrice = basePrice; }

        public int getAmount() { return amount; }
        public void setAmount(int amount) { this.amount = amount; }

        public BreadType getBreadType() { return breadType; }
        public void setBreadType(BreadType breadType) { this.breadType = breadType; }

        public boolean isVegetables() { return vegetables; }
        public void setVegetables(boolean vegetables) { this.vegetables = vegetables; }

        public String getComment() { return comment; }
        public void setComment(String comment) { this.comment = comment; }

    public PersonDTO getPersonDTO() {
        return person;
    }

    public void setPersonDTO(PersonDTO person) {
        this.person = person;
    }

    public SandwichOrderDTO getSandwichOrderDTO() {
        return sandwichOrder;
    }

    public void setSandwichOrderDTO(SandwichOrderDTO sandwichOrder) {
        this.sandwichOrder = sandwichOrder;
    }
}
