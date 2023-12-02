package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final CarServiceImpl carService;
    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
public String getAllCars(@RequestParam(value="count",defaultValue = "5") int count, Model model){
        List<Car> carList=new ArrayList<>();
        carList.add(new Car("BMW",1,180));
        carList.add(new Car("BMW",2,200));
        carList.add(new Car("BMW",3,220));
        carList.add(new Car("BMW",4,240));
        carList.add(new Car("BMW",5,260));
        carList=carService.getCars(carList,count);
        model.addAttribute("carlist",carList);
        return "cars";
    }
}

