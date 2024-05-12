package Stock.Cars.configuration;

import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Stock.Cars.Model.Car;
import Stock.Cars.Model.Car.Color;
import Stock.Cars.repisitory.CarsStock;

@Configuration
public class carConfiguration {
    
    @Bean
    CommandLineRunner commandLineRunner (CarsStock repository) {
        return args -> {
            Car car1 = new Car("Hanane" , "Salam" , 2014, Color.BLACK);
            Car car2 = new Car("Hanane" , "Salam" , 2014, Color.BLACK);
            repository.saveAll(List.of(car1, car2));

        } ; 
    }
}
