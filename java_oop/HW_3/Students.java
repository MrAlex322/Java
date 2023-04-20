package java_oop.HW_3;

public class Students extends Human {
    private Integer average;

    Students(String name, String lastName, Integer average) {
        super(name, lastName);
        this.average = average;

    }

    public String toString() {
        return String.format("Average: %d  %s", average, super.toString());
    }

    public Integer getAverage() {
        return average;
    }
}
