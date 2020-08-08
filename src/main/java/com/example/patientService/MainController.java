package com.example.patientService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("${spring.application.name:no name}")
    private String appName;

    @Value("${server.port:no port}")
    private String port;

    @GetMapping("/patients")
    public String doctors(){
        return "List of patients";
    }

    @GetMapping("/location")
    public String getPatientServiceLocation(){
        return appName + " : " + port;
    }
}

