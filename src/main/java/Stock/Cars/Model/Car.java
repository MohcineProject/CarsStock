package Stock.Cars.Model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Car {

   
    @Id 
    @SequenceGenerator(name = "car_sequence",sequenceName = "car_sequence",allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "car_sequence")
    long id ; 
	 String model ; 
	 String brand ; 
	 int year ;
	 Color color;

    public Car(String model, String brand, int year, Color color) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public Car(long id, String model, String brand, int year, Color color) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public Color getColor() {
        return color;
    }

    public enum Color {
        RED, 
        BLUE,
        GREEN,
        WHITE,
        BLACK,
        YELLOW,
    }


    public Car() {

    }
}
