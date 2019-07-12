package springjinq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springjinq.entity.Car;
import springjinq.params.CarParams;
import springjinq.queryRepository.CarQueryRepository;
import springjinq.repository.CarRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarQueryRepository carQueryRepository;
    @Autowired
    CarRepository carRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Car> list(){
        return carQueryRepository.getAll();
    }

    @RequestMapping(value = "findByModel", method = RequestMethod.POST)
    public Optional<Car> findByModel(@RequestBody CarParams model){
        return carQueryRepository.fyndByModel(model);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Car save(@RequestBody Car car){
        return carRepository.save(car);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public Car edit(@RequestBody Car car){
        return carRepository.save(car);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        carRepository.deleteById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Car> detail(@PathVariable  long id){
        return carRepository.findById(id);
    }
}
