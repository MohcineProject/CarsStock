package Stock.Cars.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public record Car (
    @Id @SequenceGenerator(name = "car_sequence",
    sequenceName = "car_sequence",
    allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "car_sequence"
    )
    long id , 
	 String model , 
	 String brand , 
	 int year ,
	 Color color 
) {
    public enum Color {
        RED, 
        BLUE,
        GREEN,
        WHITE,
        BLACK,
        YELLOW,
    }
}
