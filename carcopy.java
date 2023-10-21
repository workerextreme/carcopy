//Car class for AP CS A

public class Car {

    //Instance Variables
    private int mileage;
    private int year;
    private String brand;
    private String model;


    //Constructors

    public Car() { //Has no parameters
        mileage = 0;
        year = 0;
    }

    public Car(int mileage, int year) { //Has two parameters
        this.mileage = mileage;
        this.year = year;
    }

    public Car(int mileage, int year, String brand, String model) { //Has 4 parameters
        this.mileage = mileage;
        this.year = year;
        this.brand = brand;
        this.model = model;
    }

    //Methods

    public void setMileage(int mileage) { //void doesn't return any data, has no return statement
        this.mileage = mileage;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void carError() {
        System.out.println("Your car is broken :(");
    }

    public int getMileage() {
        return mileage;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public static void main(String args[]) {
        Car carOne = new Car();
        carOne.setMileage(34);
        carOne.carError();
        int carOneMiles = carOne.getMileage();
        System.out.println(carOneMiles);
        carOne.setMileage(500);
        System.out.println(carOneMiles);
        System.out.println(carOne.getMileage());
    }
}
