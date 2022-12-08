/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teovet;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author dks
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner  scanner = new Scanner(System.in);
       int option; 

     System.out.println("Bienvenido a MateoVet!");
     
     System.out.println("1.Registrar un nuevo paciente");
     System.out.println("2.Buscar un paciente");
     System.out.println("3.Editar un paciente");
     System.out.println("4.Eliminar un paciente");
     System.out.println("5.Salir");
      
     option = Integer.valueOf (scanner.nextLine());
     System.out.println("Usted ha seleccionado la opción " + String.valueOf(option));
     
     Patient patient = new Patient(0001, "Teo", "19/11/1991");
     
    ArrayList<Patient> patientList = new ArrayList<>();
       
         patientList.add(patient);
         
        System.out.println(patient);
    }
    
}
