package web.DAO;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCars(Integer count);
    List<Car> getCars();
}