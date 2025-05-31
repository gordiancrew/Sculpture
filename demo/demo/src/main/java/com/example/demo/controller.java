package com.example.demo;

import com.example.demo.models.Dog;
import com.example.demo.repo.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class controller {

    @Value("${spring.application.name}")
    private String name;

    @Autowired
    private DogRepository dogRepository;

    @GetMapping

    public String getAllDogs(Model model) {


        Iterable<Dog> dogs=dogRepository.findAll();
        model.addAttribute("dogs",dogs);

        return "home";
    }
}