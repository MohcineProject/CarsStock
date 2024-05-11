package Stock.Cars.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
