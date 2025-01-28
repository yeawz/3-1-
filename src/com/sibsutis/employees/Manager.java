package com.sibsutis.employees;

 import com.sibsutis.devices.Device;

import java.util.List;
 public class Manager extends Employee{
    public Manager(int id, String fullName, Department department) {
       super(id, fullName, department);
  }

   public Manager(int id, String fullName, Department department, String phone) {
       super(id, fullName, department, phone);
   }

   public Manager(int id, String fullName, Department department, List<Device> devices) {
       super(id, fullName, department, devices);
   }

   public Manager(int id, String fullName, Department department, String phone, List<Device> devices) {
        super(id, fullName, department, phone, devices);
   }


   @Override
  public String getPosition() {
       return "Manager";
  }
 @Override
  public void print() {
        System.out.println("Manager: id=" + getId() + ", fullName=" + getFullName() + ", position=" + getPosition() + ", department=" + getDepartment() + ", phone=" + getPhone() + ", devices=" + getDevices());
  }
 }