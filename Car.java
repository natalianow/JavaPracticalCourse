package JavaPracticalCourse.things;

import JavaPracticalCourse.breathing.Person;

public class Car {
    private final String brand;
    private int year;
    private double mileage;
    private Person owner;

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", owner=" + owner +
                '}';
    }

    public String getBrand(){
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setBrand(String lamborghini_urus) {
    }
}
