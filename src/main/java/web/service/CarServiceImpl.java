package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{
private List<Car> carList=new ArrayList<>();{
        carList.add(new Car("BMW",1,180));
        carList.add(new Car("BMW",2,200));
        carList.add(new Car("BMW",3,220));
        carList.add(new Car("BMW",4,240));
        carList.add(new Car("BMW",5,260));
    }

    public List<Car> getCars(int count) {
        return (count==0||count>5)?carList:carList.stream().limit(count).collect(Collectors.toList());
    }
}
