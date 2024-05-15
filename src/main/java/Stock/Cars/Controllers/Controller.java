package Stock.Cars.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Stock.Cars.Model.Car;
import Stock.Cars.Services.Service;

@RestController

public class Controller {

    private final Service carsService ; 

    @Autowired
    public Controller(Service carsService) { 
        this.carsService = carsService ; 

    }


    @GetMapping("/cars")
	public List<Car> getCars() {
		return carsService.getCars(); 

	}

    @PostMapping("/car")
    public void registerNewCar(@RequestBody Car car) {
        carsService.registerNewCar(car);
    }

    @DeleteMapping(path="/car/delete_{id}")
    public void deleteCar(@PathVariable("id") Long id) {
        carsService.deleteCar(id);
    }

    @PutMapping(path = "car/update_{id}")
    public void updateCar(@PathVariable("id") Long id, @RequestBody Car car) {
        carsService.updateCar(id, car);
    }
}
