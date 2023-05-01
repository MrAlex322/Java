package java_oop.HW_4;

public class bar extends product {
    private Double weight;

    public bar(String name, Integer cost, Double weight) {
        super(name, cost);
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public String toString() {
        return String.format("%s weight: %.2f", super.toString(), weight);
    }
}
