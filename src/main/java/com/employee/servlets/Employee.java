package com.employee.servlets;

public class Employee {
    private String Id;
    private String Name;
    private String Email;
    private String Number;
    private String Department;
    private String Position;
    
    public Employee(String Id, String Name, String Email, String Number, String Department, String Position) {
        this.Id = Id;
        this.Name = Name;
        this.Email = Email;
        this.Number = Number;
        this.Department = Department;
        this.Position = Position;
    }
    
    public String getId() {
        return Id;
    }
    
    public void setId(String id) {
        Id = id;
    }
    
    public String getName() {
        return Name;
    }
    
    public void setName(String name) {
        Name = name;
    }
    
    public String getEmail() {
        return Email;
    }
    
    public void setEmail(String email) {
        Email = email;
    }
    
    public String getNumber() {
        return Number;
    }
    
    public void setNumber(String number) {
        Number = number;
    }
    
    public String getDepartment() {
        return Department;
    }
    
    public void setDepartment(String department) {
        Department = department;
    }
    
    public String getPosition() {
        return Position;
    }
    
    public void setPosition(String position) {
        Position = position;
    }
}
