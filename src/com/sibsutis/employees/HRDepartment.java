package com.sibsutis.employees;

import java.util.Objects;

public class HRDepartment extends Department {
    public HRDepartment(int id) {
        super(id);
    }

    @Override
    public String getDepartmentName() {
        return "HR Department";
    }
     @Override
    public void print() {
        System.out.println("Department: id=" + getId() + ", name=" + getDepartmentName());
    }
    @Override
   public boolean equals(Object o) {
       if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       HRDepartment that = (HRDepartment) o;
       return getId() == that.getId();
    }

    @Override
   public int hashCode() {
         return Objects.hash(getId());
   }
}