/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad11;

import java.util.Scanner;

/**
 *
 * @author abii_
 */
public class Actividad11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0, op;
        
       do {
           try{
       System.out.println("¡BIENVENIDO!");
            System.out.println("Selecciona una opción: ");
            System.out.println("1. Circulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triangulo");
            System.out.println("0. Salir");
            Scanner in = new Scanner(System.in);
            System.out.print("Ingresa un numero: ");
            opcion = in.nextInt();
        
            switch(opcion){
           case 1: 
            System.out.println("Selecciona una opción: ");
            System.out.println("1. Area");
            System.out.println("2. Perimetro");
            op = in.nextInt();
            if (op == 1){
                Circle circle = new Circle(5);
                System.out.println(circle.area());
            }else if (op == 2){
                Circle circle = new Circle(5);
                System.out.println(circle.perimeter());
            }else if (op >= 3){
               System.out.println("Selecciona una opción que exista!! ");
                       }
               break;
           case 2: 
            System.out.println("Selecciona una opción: ");
            System.out.println("1. Area");
            System.out.println("2. Perimetro");
            op = in.nextInt();
            if (op == 1){
                Square square = new Square(10);
                System.out.println(square.area());
            }else if (op == 2){
                Square square = new Square(10);
                System.out.println(square.perimeter());
            }else if (op >= 3){
               System.out.println("Selecciona una opción que exista!! ");
                       }
           break;
           case 3:
            System.out.println("Selecciona una opción: ");
            System.out.println("1. Area");
            System.out.println("2. Perimetro");
            op = in.nextInt();
            if (op == 1){
                EquilateralTriangle triangle = new EquilateralTriangle(10);
                System.out.println(triangle.area());
            }else if (op == 2){
                EquilateralTriangle triangle = new EquilateralTriangle(10);
                System.out.println(triangle.perimeter());
            }else if (op >= 3){
               System.out.println("Selecciona una opción que exista!! ");
                       }
           break;
           case 0: 
		System.out.println("Adios!");
            break;
           default: 
               System.out.println("Esa opción no existe :p");
       } System.out.println("\n");}catch(Exception e){
				System.out.println("Uoop! Error!");
			}
       }while (opcion <= 3);
       }
}