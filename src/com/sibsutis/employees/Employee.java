package com.sibsutis.employees;

import com.sibsutis.Printable;
import com.sibsutis.devices.Device;

import java.util.List;

public abstract class Employee implements Printable {
    private int id;
   private String fullName;
    private String phone;
   private List<Device> devices;
   private Department department;


    public Employee(int id, String fullName, Department department) {
        this.id = id;
        this.fullName = fullName;
        this.department = department;
   }


    public Employee(int id, String fullName, Department department, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.department = department;
       this.phone = phone;
  }

   public Employee(int id, String fullName, Department department, List<Device> devices) {
        this.id = id;
       this.fullName = fullName;
        this.department = department;
       this.devices = devices;
   }

    public Employee(int id, String fullName, Department department, String phone, List<Device> devices) {
        this.id = id;
        this.fullName = fullName;
        this.department = department;
        this.phone = phone;
        this.devices = devices;
    }


    public int getId() {
        return id;
    }

   public String getFullName() {
        return fullName;
    }

   public String getPhone() {
        return phone;
   }

  public List<Device> getDevices(){
     return devices;
     }
    public Department getDepartment(){
       return department;
   }

   public abstract String getPosition();

   @Override
   public String toString() {
        return "Employee{" +
             "id=" + id +
             ", fullName='" + fullName + '\'' +
            ", phone='" + phone + '\'' +
             ", devices=" + devices +
              ", department=" + department +
               '}';
    }
}