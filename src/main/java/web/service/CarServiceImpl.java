package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{
private List<Car> carList=new ArrayList<>();

    public List<Car> getCars(List<Car> carList ,int count) {
        return (count==0||count>5)?carList:carList.stream().limit(count).collect(Collectors.toList());
    }
}
