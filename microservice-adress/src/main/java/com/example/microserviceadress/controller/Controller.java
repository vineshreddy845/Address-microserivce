package com.example.microserviceadress.controller;

import com.example.microserviceadress.adressresponse.AdrressResponse;
import com.example.microserviceadress.modeladress.Address;
import com.example.microserviceadress.respositoryadress.RepositoryAdress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    private RepositoryAdress repo;
    @Autowired
    private AdrressResponse response;
    @PostMapping("/save")
    public Address save(@RequestBody Address add){
        return  repo.save(add);
    }
    @GetMapping("/response/{id}")
    public AdrressResponse response(@PathVariable(value="id") Long id)
    {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.info("Calling from employee service id: {}", id);
        logger.debug("Calling from employee service id: {}", id);
       response.setAdressResponse(repo.findById(id));
       return response;
    }

    @GetMapping("/ops")
    public String h(){
        return "calling from address microservice";
    }
    @GetMapping("/want/{id}")
    public Optional<Address> responses(@PathVariable(value="id") Long id)
    {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.info("Calling from employee service id: {}", id);
        logger.debug("Calling from employee service id: {}", id);

        return repo.findById(id);
    }
}
