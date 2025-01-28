package com.sibsutis.employees;

 import com.sibsutis.devices.Device;

 import java.util.List;

 public class SoftwareDeveloper extends Employee{
  public SoftwareDeveloper(int id, String fullName, Department department) {
       super(id, fullName, department);
   }

   public SoftwareDeveloper(int id, String fullName, Department department, String phone) {
       super(id, fullName, department, phone);
   }

   public SoftwareDeveloper(int id, String fullName, Department department, List<Device> devices) {
      super(id, fullName, department, devices);
  }

   public SoftwareDeveloper(int id, String fullName, Department department, String phone, List<Device> devices) {
       super(id, fullName, department, phone, devices);
   }

  @Override
  public String getPosition() {
        return "Software Developer";
  }
 @Override
  public void print() {
       System.out.println("Software Developer: id=" + getId() + ", fullName=" + getFullName() + ", position=" + getPosition() + ", department=" + getDepartment() + ", phone=" + getPhone() + ", devices=" + getDevices());
   }
 }
