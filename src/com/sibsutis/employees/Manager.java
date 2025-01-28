package com.sibsutis.employees;

import com.sibsutis.devices.Device;

import java.util.List;
import java.util.Objects;

public class Manager extends Employee {
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
   @Override
   public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
         return getId() == manager.getId() && Objects.equals(getFullName(), manager.getFullName()) && Objects.equals(getPhone(), manager.getPhone()) && Objects.equals(getDevices(), manager.getDevices()) && Objects.equals(getDepartment(), manager.getDepartment());
  }

    @Override
   public int hashCode() {
        return Objects.hash(getId(), getFullName(), getPhone(), getDevices(), getDepartment());
    }
}