/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherenciacuenta;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Scanner entrada = new Scanner(System.in);
        
        //System.out.println("¿Que cuenta desea abrir?");
           // System.out.println("1 = Bancaria");
            //System.out.println("2 = Ahorro");
            //System.out.println("3 = Cheques");
            //int cuenta = entrada.nextInt();
        
        //if (cuenta == 1){    
        //System.out.println("Proporcione el numero de la cuenta.");
        //int numeroDeCuenta = entrada.nextInt();
        //System.out.println("Proporcione el nombre del cliente.");
        //String cliente = entrada.next();
        //CuentaBancaria nuevaCuenta = new CuentaBancaria(6,"roxana", "cruz");
        
        
       // System.out.println(nuevaCuenta.getSaldo());
         //  nuevaCuenta.Depositar(200);
           // System.out.println(nuevaCuenta.getSaldo()); 
            //nuevaCuenta.Retirar(500);
            //System.out.println(nuevaCuenta.getSaldo());
            //nuevaCuenta.Depositar(1200);
            //System.out.println(nuevaCuenta.getSaldo()); 
            //nuevaCuenta.Depositar(700);
            //System.out.println(nuevaCuenta.getSaldo()); 
            //nuevaCuenta.Retirar(1500);
            //System.out.println(nuevaCuenta.getSaldo());
            
        
       // }
        
       //
        //}
        
        //if (cuenta == 3){    
        //System.out.println("Proporcione el numero de la cuenta.");
       // int numeroDeCuenta = entrada.nextInt();
        //System.out.println("Proporcione el nombre del cliente.");
        //String cliente = entrada.next();
        //CuentaDeCheques nuevaCuenta = 
          //      new CuentaDeCheques(numeroDeCuenta,cliente);
 
        //System.out.println(nuevaCuenta.getSaldo());
           //nuevaCuenta.Depositar(200);
            //System.out.println(nuevaCuenta.getSaldo()); 
            //nuevaCuenta.Retirar(500);
            //System.out.println(nuevaCuenta.getSaldo());
            //nuevaCuenta.Depositar(1200);
            //System.out.println(nuevaCuenta.getSaldo()); 
            //nuevaCuenta.Depositar(700);
            //System.out.println(nuevaCuenta.getSaldo()); 
            //nuevaCuenta.Retirar(1500);
            //System.out.println(nuevaCuenta.getSaldo());
            //nuevaCuenta.Retirar(100);
            //System.out.println(nuevaCuenta.getSaldo());
            //nuevaCuenta.Retirar(150);
            //System.out.println(nuevaCuenta.getSaldo());
            //nuevaCuenta.Retirar(2000);
           // System.out.println(nuevaCuenta.getSaldo());   
       // }
          //     }
        CuentaBancaria nuevaCuenta = new CuentaBancaria(6,"roxana","cruz");
        Cliente cliente = nuevaCuenta.getcliente();
        cliente.setnombre("hortencio");
        System.out.println("Su Nombre Es:" + cliente.getnombre());
        cliente.setapellido("Perez");
        System.out.println("Su Apellido Es : " + cliente.getapellido());
        cliente.setfecha("06-mayo-1995");
        System.out.println("Su fecha de nacimiento es:"+ cliente.getfecha());
        cliente.setdireccion("mercado");
        System.out.println("Su direccion es: "+ cliente.getdireccion());
        cliente.setocupacion("plomero");
        System.out.println("Su ocupacion es:" + cliente.getocupacion());
        cliente.setemail("filomeno@hotmail.com");
        System.out.println("Su correo electonico es :" + cliente.getemail());
        
        
    }
}
