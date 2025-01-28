package com.sibsutis.employees;

import java.util.Objects;

public class FinanceDepartment extends Department {
    public FinanceDepartment(int id) {
         super(id);
    }

    @Override
    public String getDepartmentName() {
        return "Finance Department";
    }

     @Override
    public void print() {
         System.out.println("Department: id=" + getId() + ", name=" + getDepartmentName());
    }

    @Override
   public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       FinanceDepartment that = (FinanceDepartment) o;
       return getId() == that.getId();
    }

   @Override
   public int hashCode() {
       return Objects.hash(getId());
    }
}