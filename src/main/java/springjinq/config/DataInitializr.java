package springjinq.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import springjinq.entity.Car;
import springjinq.queryRepository.CarQueryRepository;
import springjinq.repository.CarRepository;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationListener;

import java.util.List;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> {


    @Autowired
    CarRepository carRepository;
    @Autowired
    CarQueryRepository carQueryRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        List<Car> cars = carQueryRepository.getAll();
        if(cars.isEmpty()){
            this.createCars("HB20");
            this.createCars("Gol");

        }
    }

    public void createCars(String model){
        Car car = new Car(model);
        carRepository.save(car);
    }
}
