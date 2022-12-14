/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author Иван
 */
public class Realty {
    private String Housing;
    private String Vehicle;
    
    Realty(){
        this.Housing = "Гараж";
        this.Vehicle = "Велик";
    }

    public String GetHousing()
    {
        return this.Housing;
    }

    public void SetHousing(String housing)
    {
       this.Housing = housing;
    }

    public String GetVehicle()
    {
        return this.Vehicle;
    }

    public void SetVehicle(String vehicle)
    {
        this.Vehicle = vehicle;
    }
    
}
