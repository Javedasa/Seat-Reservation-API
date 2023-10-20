package com.example.Reservation.API;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Repository repository;

    public String addEmployee(Employee employee) {
        repository.addEmployee(employee);
        return "employee added succesfully!!!";
    }
    HashMap<Employee, List<Date>> list=repository.getDateHashMap();
    int count=0;
    public int searchEmployee() {
        for(List<Date> list1:list.values()){
            if(list1.size()>5){
                count++;
            }
        }
        return count;
    }

    public int findNumberOfEmployee(Date date, String team) {
     HashMap<Date,List<Seat>> seatHashMap=repository.getSeatHashMap();
     HashMap<Integer,Employee> employeeHashMap=repository.getEmployeeHashMap();
        List<Seat> arrayList=seatHashMap.get(date);

     List<Employee>nlist=new ArrayList<>();
     for(Seat seat:arrayList){
        int id= seat.getEmployeeId();
        Employee employee=employeeHashMap.get(id);
        if(employee.getTeam().equals(team)){
            nlist.add(employee);
        }
     }
     return nlist.size();
    }
}
