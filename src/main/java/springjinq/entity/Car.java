package springjinq.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity(name = "CAR")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String model;
    public Car() {}

    public Car(Long id, String model) {
        super();
        this.id = id;
        this.model = model;
    }

    public Car(String model) {
        this.model = model;
    }
}
