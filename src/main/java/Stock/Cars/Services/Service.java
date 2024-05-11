package Stock.Cars.Services;

import java.util.List;


import Stock.Cars.Model.Car;
import Stock.Cars.Model.Car.Color;

@org.springframework.stereotype.Service
public class Service {
    public List<Car> getCars() {
        return List.of( new Car(3,"citron","smah", 2002, Color.BLACK ));
    }
}
