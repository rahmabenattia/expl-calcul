/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author hp
 */


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement // Permet de convertir JSON <-> Java
public class Operation {
    private double num1;
    private double num2;
    private String operator;

    // Getters et Setters
    public double getNum1() { return num1; }
    public void setNum1(double num1) { this.num1 = num1; }
    public double getNum2() { return num2; }
    public void setNum2(double num2) { this.num2 = num2; }
    public String getOperator() { return operator; }
    public void setOperator(String operator) { this.operator = operator; }
}
