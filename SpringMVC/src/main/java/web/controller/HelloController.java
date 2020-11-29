 package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

 @Controller
public class HelloController {

	@GetMapping(value = "/page")
	public String printWelcome(ModelMap model,
							   @RequestParam(value = "name", required = false) String name,
							   @RequestParam(value = "surname", required = false) String surname) {
		List<String> messages = new ArrayList<>();
		if (name != null) {
			messages.add("Name: " + name);
		}
		if(surname != null) {
			messages.add("Surname: " + surname);
		}
		model.addAttribute("messages", messages);
		return "pages/page";
	}

	 @GetMapping(value = "/car")
	 public String printCar(ModelMap model, @RequestParam(value = "count", defaultValue = "5", required = false) int count) {
		 List<Car> cars = new ArrayList<>();
		 cars.add(new Car("BMW", "300", 10000000));
		 cars.add(new Car("Citroen","C4",1200000));
		 cars.add(new Car("Hyundai", "i30", 1600000));
		 cars.add(new Car("Hyundai", "i35", 1800000));
		 cars.add(new Car("Hyundai", "i40", 2000000));
		 cars.add(new Car("Hyundai", "i45", 2300000));
		 cars.add(new Car("Hyundai", "i50", 2600000));
		 cars = cars.stream().limit(count).collect(Collectors.toList());
		 model.addAttribute("auto", cars);
		 return "pages/car";
	 }
}