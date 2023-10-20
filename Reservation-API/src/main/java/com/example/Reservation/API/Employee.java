package com.example.Reservation.API;

public class Employee {

    private int employeeId;
    private String team;

    public Employee(int employeeId, String team) {
        this.employeeId = employeeId;
        this.team = team;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
