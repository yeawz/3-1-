package com.sibsutis.employees;

import com.sibsutis.devices.Device;

 import java.util.List;
 public class NetworkAdministrator extends Employee {
  public NetworkAdministrator(int id, String fullName, Department department) {
      super(id, fullName, department);
   }

   public NetworkAdministrator(int id, String fullName, Department department, String phone) {
       super(id, fullName, department, phone);
   }

   public NetworkAdministrator(int id, String fullName, Department department, List<Device> devices) {
      super(id, fullName, department, devices);
   }

  public NetworkAdministrator(int id, String fullName, Department department, String phone, List<Device> devices) {
        super(id, fullName, department, phone, devices);
   }
   @Override
   public String getPosition() {
       return "Network Administrator";
  }
 @Override
   public void print() {
     System.out.println("Network Administrator: id=" + getId() + ", fullName=" + getFullName() + ", position=" + getPosition() + ", department=" + getDepartment() + ", phone=" + getPhone() + ", devices=" + getDevices());
   }
 }