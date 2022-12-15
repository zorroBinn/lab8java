/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author Иван
 */
public class Human {

       private String Name;
       private String Sex;
       private int Age;
       private long Money;


        Human() {
            this.Name = "test";
            this.Age = 0;
            this.Money = 1000;
            this.Sex = "test";
        }
        public int GetAge() {
            return this.Age;
        }
        public String GetName(){
            return this.Name;
        }
        public String GetSex() {
            return this.Sex;
        }
        public long GetMoney() {
            return this.Money;
        }
        public void SetName(String n) {
            this.Name = n;
        }
        public void SetAge(int a) {
            this.Age = a;
        }
        public void SetSex(String s){
            this.Sex = s;
        }
        public void ChangeMoney(int m){
            this.Money+=m;
        }
}
