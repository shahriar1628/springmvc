package com.javacodegeeks.example.bin;

public class Country {
    private String id,name;
    public  Country(String id,String name) {
        this.id = id;
        this.name = name;
    }
    public String getID(){
        return this.id;
    }
    public void setID(String id){
         this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name = name;
    }
}
