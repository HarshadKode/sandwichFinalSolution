package dto;

public class SandwichUpdatePriceRequestDTO {

// refered: https://codefinity.com/courses/v2/87dc501e-89a6-4a4b-afd4-8b38c46a80c7/4c0caf64-3c65-47b4-8075-31958fa1f42a/992aa19d-ec09-48ba-ae65-08ac6929e405
    private double basePrice;

    public SandwichUpdatePriceRequestDTO(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}



