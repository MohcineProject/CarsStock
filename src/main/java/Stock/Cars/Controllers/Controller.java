package Stock.Cars.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Stock.Cars.Model.Car;
import Stock.Cars.Services.Service;
import jakarta.websocket.server.PathParam;

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

    @DeleteMapping(path="{id}")
    public void deleteCar(@PathParam("id") Long id) {
        carsService.deleteCar(id);
    }
}
