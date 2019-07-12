package springjinq.repository;
import org.springframework.data.repository.CrudRepository;
import springjinq.entity.Car;

public interface CarRepository extends CrudRepository<Car, Long> {
}
