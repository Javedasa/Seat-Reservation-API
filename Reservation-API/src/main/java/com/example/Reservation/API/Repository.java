package com.example.Reservation.API;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    public HashMap<Integer, Employee> getEmployeeHashMap() {
        return employeeHashMap;
    }

    HashMap<Integer,Employee>employeeHashMap=new HashMap<>();

    public HashMap<Employee, List<Date>> getDateHashMap() {
        return dateHashMap;
    }

    HashMap<Employee, List<Date>>dateHashMap=new HashMap<>();

    public HashMap<Date, List<Seat>> getSeatHashMap() {
        return seatHashMap;
    }

    HashMap<Date,List<Seat>>seatHashMap=new HashMap<>();


    public void addEmployee(Employee employee) {
        int key= employee.getEmployeeId();
        employeeHashMap.put(key,employee);
    }
}
