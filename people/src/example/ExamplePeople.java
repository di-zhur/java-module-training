package example;

import apartment.BigApartment;
import dog.Dog;
import dog.DogClass;
import dog.DogTest;
import dog.SuperDogClass;
import lada.VestaCar;

public class ExamplePeople {

    public void info() {
        DogClass dog = new DogClass();
        dog.info();

        SuperDogClass dog2 = new SuperDogClass();
        dog2.info();

        VestaCar car = new VestaCar();
        car.info();

        BigApartment bigApartment = new BigApartment();
        bigApartment.info();

        System.out.println(getClass().getName());
    }

}
