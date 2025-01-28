package com.sibsutis.devices;

     public class Device {
     private int id;
    private String name;

    public Device(int id, String name) {
     this.id = id;
    this.name = name;
    }
    
   public int getId(){
    return id;
    }
   public String getName(){
   return name;
   }
    @Override
   public String toString() {
   return "Device{" +
           "id=" + id +
           ", name='" + name + '\'' +
          '}';
   }
  }