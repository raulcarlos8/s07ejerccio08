/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio08;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("escribe tu nombre de usuario:  ");
        String nombre1 = reader.nextLine();
        System.out.println(" escribe tu password:  ");
        String password = reader.nextLine();
        if (nombre1.equals("emily") && password.equals("cat")){
            System.out.println(" has iniciado sesion en el sistema");
        }
        else {
            System.out.println(" nombre de usuario o contraseña incorrecta");
        }
    }
    
}
