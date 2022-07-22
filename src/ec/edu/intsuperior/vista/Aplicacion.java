package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Automovil;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
    Automovil a1 = new Automovil();
    Automovil a2 = new Automovil();
    Automovil a3 = new Automovil();
    
        System.out.println("Ingrese Marca del Automovil: "); 
        a1.setMarca(leer.next());
        
        System.out.println("Ingrese Modelo Automovil: ");
        a1.setModelo(leer.nextInt());
        
        System.out.println("Ingrese Motor Automovil: ");
        a1.setMotor(leer.nextInt());
        
        System.out.println("Ingrese numero de puertas: ");
        a1.setPuertas(leer.nextInt());
        
        System.out.println("Ingrese numero de asientos:  ");
        a1.setAsientos(leer.nextInt());
        
        System.out.println("Ingrese velocidad maxima: ");
        a1.setVelocidad(leer.nextInt());
        
        System.out.println("Ingrese velocidad Inicio: ");
        a1.setVelocidadInicio(leer.nextInt())
                ;
        a1.setCombustible(Automovil.TipoCombustible.DIESEL);
       
        a1.setAutomovil(Automovil.TipoAutomovil.CIUDAD);
        
        a1.setColor(Automovil.TipoColor.ROJO);
        
        System.out.println("La marca del automovil es: " + a1.getMarca() );
        System.out.println("El modelo del automovil es: " + a1.getModelo());
        System.out.println("El motor es: " + a1.getMotor());
        System.out.println("El tipo de combustible que usa es : " + a1.getCombustible());
        System.out.println("El tipo de automovil es: " + a1.getAutomovil());
        System.out.println("El numero de puerta es: " + a1.getPuertas());
        System.out.println("El numero de asientos son: " + a1.getAsientos());
        System.out.println("La velocidad maxima es: " + a1.getVelocidad());
        System.out.println("El color de automovil es: " + a1.getColor());
        System.out.println("Su velocidad inicial es: " + a1.getVelocidadInicio());
       
    }
    
}
