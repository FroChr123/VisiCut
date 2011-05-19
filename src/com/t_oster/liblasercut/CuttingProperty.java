/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t_oster.liblasercut;

/**
 *
 * @author oster
 */
public class CuttingProperty {
    private int power = 20;
    private int speed = 100;
    private int frequency = 5000;
    
    public CuttingProperty(){
        
    }
    
    public CuttingProperty(int power, int speed, int frequency){
        this.power = power;
        this.speed = speed;
        this.frequency = frequency;
    }
    
    public void setPower(int power){
        this.power = power;
    }
    
    public int getPower(){
        return power;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public void setFrequency(int frequency){
        this.frequency = frequency;
    }
    
    public int getFrequency(){
        return frequency;
    }
}