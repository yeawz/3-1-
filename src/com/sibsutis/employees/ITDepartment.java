package com.sibsutis.employees;

import java.util.Objects;

public class ITDepartment extends Department {
    public ITDepartment(int id) {
        super(id);
    }

    @Override
    public String getDepartmentName() {
        return "IT Department";
    }

     @Override
     public void print() {
         System.out.println("Department: id=" + getId() + ", name=" + getDepartmentName());
    }

   @Override
   public boolean equals(Object o) {
        if (this == o) return true;
       if (o == null || getClass() != o.getClass()) return false;
       ITDepartment that = (ITDepartment) o;
        return getId() == that.getId();
   }

   @Override
   public int hashCode() {
       return Objects.hash(getId());
  }
}