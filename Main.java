import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Radio radio = new Radio(false, false, 0, 0, 0, null, null);

        System.out.println("RADIO MATUTINA: apagado");
        System.out.println("1. Encender/Apagar");
        int eleccion, accion;
        int boton;
        eleccion = scanner.nextInt();


        if(eleccion == 1){
            System.out.println("RADIO ENCENDIDA");
            do {

                System.out.println("Estacion actual: " + radio.getStation());
                System.out.println("1. Apagar");
                System.out.println("2. AM / FM");
                System.out.println("3. Siguiente Estación");
                System.out.println("4. Guardar Estación");
                System.out.println("5. Seleccionar Estación");
                System.out.println("Ingrese un número:");
                
                accion = scanner.nextInt();
                


                switch (accion) {
                    case 1:
                        System.out.println("RADIO APAGADA, FELIZ DÍA");
                        break;
                    case 2:
                        radio.SwitchAmFm();
                        System.out.println("SE HA CAMBIADO DE FRECUENCIA");
                        break;

                    case 3:
                        
                        System.out.println("Estación cambiada. Actualmente: " + radio.nextStation());
                        break;
            
                    case 4:
                        System.out.println("Elija un botón del 1 al 12: ");
                        boton = scanner.nextInt();

                        radio.saveStation(boton, radio.getStation());
                        System.out.println("Estación actual guardada en el botón: " + boton);
                        break;

                    case 5:
                        System.out.println("Elija un botón del 1 al 12 para seleccionar estación: ");
                        boton = scanner.nextInt();

                        radio.SelectStation(boton);
                        break;
                
                    default:
                        System.out.println("Opción inválida. Por favor, elige un número del 1 al 5.");
                        break;
                }
    
            } while (accion != 1);

        }
        

    }
}