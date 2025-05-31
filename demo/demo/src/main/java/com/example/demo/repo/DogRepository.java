package com.example.demo.repo;

import com.example.demo.models.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog,Long> {
}
