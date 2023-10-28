package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;
import java.util.ArrayList;

@Repository
public class CarDaoImp implements CarDao {
    private final List<Car> list;

    public CarDaoImp() {
        list = new ArrayList<>();
        list.add(new Car("Chevrolet", "Neksya", 2005));
        list.add(new Car("Ford", "focus", 2022));
        list.add(new Car("Mitsubisi", "Lancer", 2006));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count > 0 && count < list.size()) {
            return list.subList(0, count);
        } else
            return list;
    }

    @Override
    public List<Car> getCars() {
        return list;
    }
}