package e_commerceFullStack.e_commerceFullStack.controller;

import e_commerceFullStack.e_commerceFullStack.model.Electronics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.List;

@RestController
@RequestMapping("/api/controller")
public class ElectronicController {

    @GetMapping
    public List<Electronics> getAllElectronics(){
        Electronics.Specification specs1 = new Electronics.Specifications();
        specs1.setScreenSize("6.2 Inches");
        specs1.setBattery("20 HorsePower");
        specs1.setProcessor("Ezynos 2100");
        specs1.setRAM("16GB");

        Electronics electronics = new Electronics();
        electronics.setId();
        electronics.setName("Samsung Galaxy S21");
        electronics.setCategory("phones");
        electronics.setPrice(900.90);
        electronics.setBrand("Category");
        electronics.setSpecification(specs1);
        electronics.setStock(30);

        Electronics.Specification specs2 = new Electronics.Specification();
        specs2.setScreenSize("13.5 Inches");
        specs2.setBattery("52WHr");
        specs2.setProcessor("Intel 17");
        specs2.setRAM("16GB");

        Electronics electronics2 = new Electronics();
        electronics2.setId(2L);
        electronics2.setName("DELL XPS 13");
        electronics2.setCategory("Laptops");
        electronics2.setSpecification(specs2);
        electronics2.setStock(15);
        return  Array.asList(electronics, electronics2);


    }
}
