package dev.jasneet.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyServiceController {
    @Autowired
    public CurrencyServiceConfiguration currencyServiceConfiguration;

    @GetMapping("/currency")
    public String retrieveAllCourses(){
            return currencyServiceConfiguration.getKey();
        }
}
