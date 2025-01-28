package com.sibsutis.devices;

     import com.sibsutis.Printable;

     import java.util.Objects;

      public abstract class Device implements Printable {
        private int id;
       private String name;

       public Device(int id, String name) {
           this.id = id;
          this.name = name='" + name + '\'' +
               '}';
        }

         @Override
       public boolean equals(Object o) {
           if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Device device = (Device) o;
            return id == device.id && Objects.equals(name, device.name);
        }

         @Override
         public int hashCode() {
            return Objects.hash(id, name);
         }
       }