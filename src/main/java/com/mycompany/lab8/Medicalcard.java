/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author Иван
 */
public class Medicalcard {
    private int Weight;
    private int Height;
    private int HealthStatus;
    
    Medicalcard(){
        this.Weight = this.Height = this.HealthStatus = 0;
    }
    public int GetWeight() {
        return this.Weight;
    }
    public void SetWeight(int weight) {
        this.Weight = weight;
    }
    public int GetHeight(){
        return this.Height;
    }
    public void SetHeight(int h) {
        this.Height = h;
    }
    public int GetHealthStatus(){
        return this.HealthStatus;
    }
    public void SetHealthStatus(int hs){
        this.HealthStatus = hs;
    }
    public void DownStatus(){
        this.HealthStatus-=5;
        if(this.HealthStatus < 0) {
            this.HealthStatus = 0;
        }
    }
    public void UpStatus(){
        this.HealthStatus+=20;
        if (this.HealthStatus > 100) {
            this.HealthStatus = 100;
        }
    }
}
