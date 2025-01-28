```java
   package com.sibsutis.employees;

   import com.sibsutis.Printable;

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
   }