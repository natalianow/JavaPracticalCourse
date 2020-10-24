package JavaPracticalCourse;

public class Car {
    private String brand;
    private int year;
    private double mileage;

    public String getBrand(){
        return brand;
    }

    public void setBrand(String newName){
        brand = newName;
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
}
