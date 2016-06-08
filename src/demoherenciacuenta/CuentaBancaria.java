/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherenciacuenta;

/**
 *
 * @author pc
 */
public class CuentaBancaria {
    private int numeroDeCuenta;
    private Cliente cliente;
    private double saldo;
    
    public CuentaBancaria (int numeroDeCuenta, String nombre,String apellido){
        this.cliente = new Cliente (nombre, apellido);
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo =0.0;
    }
    public void NumeroDeCuenta(int numeroDeCuenta){
        this.numeroDeCuenta = numeroDeCuenta;
    }
    
    public void Cliente(Cliente cliente){
        this.cliente = cliente;
    }
    public Cliente getcliente(){
        return cliente;
    }
    
    public void Depositar(double cantidad){
        if (this.puedeDepositar(cantidad)){
            this.saldo = saldo + cantidad;
        }
        else {
            System.out.println("No se puede hacer el deposito.");
        }
    }
    
    public void Retirar(double cantidad){
        if (this.puedeRetirar(cantidad)){
            this.saldo = saldo - cantidad;
        }
        else {
            System.out.println("No se puede hacer el retiro.");
        }
    }
    
    public boolean puedeDepositar(double cantidad){
        boolean siPuedeDepositar = false;
        if (cantidad > 0) {
            siPuedeDepositar = true;
        }
        return siPuedeDepositar;
    }
    
    public boolean puedeRetirar(double cantidad){
        boolean siPuedeRetirar = false;
        if (cantidad < this.saldo){
            siPuedeRetirar = true;
        }
        return siPuedeRetirar;
    }
    
    public double getSaldo(){
        return this.saldo;
    }   
}
