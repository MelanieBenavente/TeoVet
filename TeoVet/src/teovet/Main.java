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
       int option = -1; 
     ArrayList<Patient> patientList = new ArrayList<>();

     System.out.println("Bienvenido a MateoVet!");
      while(option != 5){
         
     
     System.out.println("1.Registrar un nuevo paciente");
     System.out.println("2.Mostrar todos");
     System.out.println("3.Editar un paciente");
     System.out.println("4.Eliminar un paciente");
     System.out.println("5.Salir");
     
    
     String valueIntroduced = scanner.nextLine();     
     if (!isANumber(valueIntroduced)){
       System.out.println("Debes introducir un número");
     } else {
     option = Integer.valueOf (valueIntroduced);
     
      
          if (option == 1){
            System.out.println("Introduzca el nombre del paciente");
             String patientName = scanner.nextLine();
            
            System.out.println("Introduzca fecha de nacimiento --/--/----");
             String ageIntroduced = scanner.nextLine();
             
             int idInvented = 243;
             
            Patient patientIntroduced = new Patient(idInvented, patientName, ageIntroduced);
            
            patientList.add(patientIntroduced);
            showAll(patientList);
          }
          else if (option == 2){
              if (patientList.isEmpty()){
                  System.out.println("No hay pacientes registrados");
              } else {
                 showAll(patientList); 
              } 
          }
          else if (option == 3){
            System.out.println("No es la opción 1");
          }
          else if (option == 4){
             showAll(patientList);
             scanner = new Scanner(System.in);
             System.out.println("Qué posición desea eliminar?");
             int element = Integer.valueOf(scanner.nextLine());
            
             patientList.remove(element);
             System.out.println("El usuario ha sido eliminado");
             
             
          }
          else if (option == 5){
            System.out.println("Salir");
          }
          else if (option >= 6){
              System.out.println("Opción incorrecta. Debes seleccionar una de las opciones del menú");
             }
          }
      }
       }
        
    public static void showAll(ArrayList<Patient> listado){
        for (int i = 0; i < listado.size(); i++){
            String nombre = listado.get(i).name;
            String fecha = listado.get(i).dateBorn;
            int id = listado.get(i).id;
            System.out.println("Posición: " + i + " NOMBRE: " + nombre + " NACIMIENTO: " + fecha + " ID: " + id);
        }
    }
    public static boolean isANumber(String str) {
    try {
        Integer.parseInt(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
   
}
