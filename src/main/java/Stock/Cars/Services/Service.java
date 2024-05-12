package Stock.Cars.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import Stock.Cars.Model.Car;
import Stock.Cars.repisitory.CarsStock;

@org.springframework.stereotype.Service
public class Service {

    private final CarsStock carsStock; 

    @Autowired
    public Service(CarsStock carsStock) { 
        this.carsStock = carsStock ;
    }



    public List<Car> getCars() {
        return carsStock.findAll() ;
    }



    public void registerNewCar(Car car) {

        Optional<Car> optionalCar = carsStock.findByModelAndBrandAndYearAndColor(car.getModel(), car.getBrand(), car.getYear(), car.getColor()) ; 
        if(optionalCar.isPresent())  {
            throw new IllegalStateException("Car already registered" ) ; 
        }
        carsStock.save(car); 
    }



    public void deleteCar(Long id) {
        boolean exist = carsStock.existsById(id) ; 
        if (!exist) { 
            throw new IllegalStateException("no car with the id : " + id) ;
        }
        carsStock.deleteById(id); 
    }   


}
