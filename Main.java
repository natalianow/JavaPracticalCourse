package JavaPracticalCourse;

import JavaPracticalCourse.things.Car;
import JavaPracticalCourse.breathing.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jane");
        person.setAge(20);
        Car car = new Car("Lamborghini Urus");
        car.setYear(2020);
        car.setBrand("Lamborghini Urus");
        car.setMileage(1000);
        car.setOwner(person);
        System.out.println(car);
    }
}
