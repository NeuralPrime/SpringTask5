package web.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import web.DAO.CarDao;
import web.model.Car;


import java.util.List;
@Service
public class CarServiceImp implements CarService {

    private final CarDao daoCar;
    @Autowired
    public CarServiceImp(CarDao daoCar) {
        this.daoCar = daoCar;
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count != null) {
            return daoCar.getCars(count);
        } else {
            return daoCar.getCars();
        }
    }
}