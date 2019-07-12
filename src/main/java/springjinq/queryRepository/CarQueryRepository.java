package springjinq.queryRepository;

import springjinq.entity.Car;
import springjinq.params.CarParams;

import java.util.List;
import java.util.Optional;

public interface CarQueryRepository {

    Optional<Car> fyndByModel(CarParams model);
    List<Car> getAll();
}
