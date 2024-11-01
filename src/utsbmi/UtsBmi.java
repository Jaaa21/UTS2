/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsbmi;

/**
 *
 * @author LENOVO
 */
public class UtsBmi {
    int beratBadan;
    int tinggiBadan;
    
    public UtsBmi(int beratBadan, int tinggiBadan){
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }
    
    public void BMI(){
        double x = beratBadan / (tinggiBadan * 2 / 100);
        System.out.println("hasil bmi anda " + x);
        if (x < 17){
        System.out.println("Anda masuk dalam kategori kurus");}
        else if (x >= 17 && x <= 25){
        System.out.println("Anda masuk dalam kategori normal");}
        else if (x >= 25 && x <= 29.9){
        System.out.println("Anda masuk dalam kategori berlebihan");}
        else {
        System.out.println("Anda masuk dalam kategori obesitas");}
        
    }
}
