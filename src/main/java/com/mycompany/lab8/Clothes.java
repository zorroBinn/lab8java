/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author Иван
 */
public class Clothes {
    private String Body;
    private String Pants;
    private String Shoes;
    private int ClothesStatus;
    
    Clothes() {
        this.Body = "Майка";
        this.Pants = "Трусы";
        this.Shoes = "Тапки";
        this.ClothesStatus = 100;
    }
    public String GetBody()
{
    
    return this.Body;
}

public void SetBody( String body)
{
    this.Body = body;
}

public String GetPants()
{
    
    return this.Pants;
}

public void SetPants( String pants)
{
    this.Pants = pants;
}

public String GetShoes()
{
    
    return this.Shoes;
}

public void SetShoes( String shoes)
{
    this.Shoes = shoes;
}

public int GetClothesStatus()
{
    return this.ClothesStatus;
}

public void SetClothesStatus(int status)
{
    this.ClothesStatus = status;
}

public void SewUpClothes()
{
    
    if (this.ClothesStatus < 100) {
        this.ClothesStatus += 15;
        if (this.ClothesStatus > 100) {
            this.ClothesStatus = 100;
        }
    }
}

public void TearClothes()
{
    
    if (this.ClothesStatus > 0) {
        this.ClothesStatus -= 7;
        if (this.ClothesStatus < 0) {
            this.ClothesStatus = 0;
        }
    }
}

public void BuySuit()
{
    
    this.Body = "Пиджак";
    this.Pants = "Брюки";
    this.Shoes = "Туфли";
    this.ClothesStatus = 100;
}
}
