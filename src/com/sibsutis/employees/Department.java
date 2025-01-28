package com.sibsutis.employees;

import com.sibsutis.Printable;

import java.util.Objects;

public abstract class Department implements Printable {
    private int id;

    public Department(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public abstract String getDepartmentName();

   @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                '}';
    }

     @Override
    public boolean equals(Object o) {
       if (this == o) return true;
       if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
         return Objects.hash(id);
    }
}

