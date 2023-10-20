package com.example.Reservation.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Controller {

    @Autowired
    private Service service;

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }

    @GetMapping("/numberOfEmployeeCameMoreThanFiveTimes")
    public int searchEmployee(){
        return service.searchEmployee();
    }

    @GetMapping("/numberOfEmployeeOfSameTeamCameToSameDate")
    public int findNumberOfEmployee(Date date, String team){
        return service.findNumberOfEmployee(date,team);
    }
}
