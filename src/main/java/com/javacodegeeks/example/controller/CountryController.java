package com.javacodegeeks.example.controller;

import java.util.ArrayList;
import java.util.List;
import com.javacodegeeks.example.bin.Country;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
public class CountryController {
    @RequestMapping(value = "/countries",method = RequestMethod.GET,headers ="Accept=application/json")
    public List getCountirs(){
        List countries = new ArrayList();
        countries = createCoutries();
        return countries;
    }

    private List<Country> createCoutries(){
        List countries = new ArrayList<Country>();
        countries.add(new Country("1","bangladesh"));
        countries.add(new Country("2","palestine"));
        return countries;
    }

    @RequestMapping(value = "/country/{id}",method = RequestMethod.GET,headers = "Accept=application/json")
    public Country getCountryBYID(@PathVariable String id){
        List<Country> countries = createCoutries();
        for(Country country:countries){
                if(id.equals(country.getID())){
                    return country;
                }
        }
        return new Country("5","test");
    }


}
