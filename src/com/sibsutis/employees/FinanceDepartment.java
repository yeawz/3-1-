package com.sibsutis.employees;

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
    }