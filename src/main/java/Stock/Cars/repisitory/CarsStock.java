package Stock.Cars.repisitory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Stock.Cars.Model.Car;
import Stock.Cars.Model.Car.Color;

@Repository
public interface CarsStock extends JpaRepository<Car, Long>  {

    Optional<Car> findByModelAndBrandAndYearAndColor(String model, String brand, int year, Color color); 

}
