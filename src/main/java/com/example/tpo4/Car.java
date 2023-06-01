package com.example.tpo4;

public class Car {
    private String category;
    private String brand;
    private int yearOfProd;
    private double capacity;
    private String fuelComp;

    public Car(String category, String brand, int yearOfProd, double capacity, String fuelComp) {
        this.category = category;
        this.brand = brand;
        this.yearOfProd = yearOfProd;
        this.capacity = capacity;
        this.fuelComp = fuelComp;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public int getYearOfProd() {
        return yearOfProd;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getFuelComp() {
        return fuelComp;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYearOfProd(int yearOfProd) {
        this.yearOfProd = yearOfProd;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setFuelComp(String fuelComp) {
        this.fuelComp = fuelComp;
    }
}
