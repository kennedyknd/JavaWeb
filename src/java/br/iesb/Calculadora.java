/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb;

/**
 *
 * @author 17114290011
 */
public class Calculadora {
    double valor;
    public Calculadora(double valor){
        this.valor = Math.pow(valor, 2);
    }
    public double getCalculadora(){
        return valor;
    }
}
