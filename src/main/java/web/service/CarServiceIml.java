package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceIml implements CarService {
    @Override
    public List<Car> getAllCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", "M5 F90", 45654));
        list.add(new Car("AUDI", "R8", 8796));
        list.add(new Car("LAMBORGHINI", "AVENTADOR", 321456));
        list.add(new Car("NISSAN", "GTR", 789456));
        return list;
    }
}
