package springjinq.params;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarParams {
    public String model;

    public CarParams() { super();}

    public CarParams(String model) {
        this.model = model;
    }

}
