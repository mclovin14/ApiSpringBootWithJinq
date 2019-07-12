package springjinq.queryImplementation;

import org.springframework.stereotype.Repository;
import springjinq.config.BaseJinqRepositoryImpl;
import springjinq.params.CarParams;
import springjinq.queryRepository.CarQueryRepository;
import springjinq.entity.Car;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class CarQueryRepositoryImpl extends BaseJinqRepositoryImpl<Car> implements CarQueryRepository {

    @Override
    protected Class<Car> entityType() {
        return Car.class;
    }

    @Override
    public Optional<Car> fyndByModel(CarParams model) {
        String teste = model.getModel();
        return stream().where(c -> c.getModel().equals(teste)).findFirst();
    }
    @Override
    public List<Car> getAll() {
        return stream().map(c -> c).collect(Collectors.toList());
    }
}
