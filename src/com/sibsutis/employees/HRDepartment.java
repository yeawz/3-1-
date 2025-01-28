package com.sibsutis.employees;

    public class HRDepartment extends Department{
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
    }