public class ExampleSet implements Comparable {

    private String brand;
    private String model;
    private int year;


    public ExampleSet(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String toUpperCase() {
        return getModel().toUpperCase();
    }

    @Override
    public int compareTo(Object o) {

        return 0;
    }
}
