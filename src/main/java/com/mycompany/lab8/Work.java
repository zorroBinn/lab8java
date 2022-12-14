/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author Иван
 */
public class Work {
    private String Namework;
    private int Payment;
    
    Work(){
    
    this.Namework = "Сбор бутылок";
    this.Payment = 1500;
}

public int GetPayment() {
    return this.Payment;
}

public void SetPayment(int payment) {
    
    this.Payment = payment;
}

public String GetNamework(){
    
    return this.Namework;
}

public void SetNamework(String namework) {
    
    this.Namework = namework;
}
}
