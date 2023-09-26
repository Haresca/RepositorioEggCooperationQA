package Servicio;

import Entidades.Vehiculo;

import java.util.Scanner;

public class vehiculoServicio {

    /*Moverse: Es la cantidad de metros que avanzar� por segundo.
      Frenar: Dejar� de avanzar y se frenar� 2 metros m�s adelante. En el caso de la bicicleta, se frenar� y no avanzar�
    m�s metros.*/

    public static Vehiculo crearVehiculo(){
        Scanner r = new Scanner(System.in);
        System.out.println("Ingrese la marca del veh�culo");
        String marca = r.nextLine();
        System.out.println("Ingrese el modelo del veh�culo");
        String modelo = r.nextLine();
        System.out.println("Ingrese el tipo de vehiculo");
        String tipo = r.nextLine();
        System.out.println("Ingrese el a�o del vehiculo");
        int anio = r.nextInt();

        return new Vehiculo(marca, modelo, tipo, anio);
    }

    public int moverse(String tipo){
        tipo = tipo.toLowerCase();
        Scanner r = new Scanner(System.in);
        int tiempo;
        int distancia;
        System.out.println("Ingrese cu�nto tiempo se movi� el veh�culo");
        tiempo = r.nextInt();


        switch(tipo){
            case "auto":
                distancia = tiempo*3;
                break;
            case "moto":
            case "motocicleta":
                distancia = tiempo*2;
                break;
            case "bici":
            case "bicicleta":
                distancia = tiempo;
                break;
            default:
                System.out.println("No se ingres� un veh�culo v�lido, fijate eh");
                distancia = 0;
                break;

        }

        return distancia;
    }

    public void frenar(int distancia, String tipo){
        if(tipo.equalsIgnoreCase("bici")){
            System.out.println("funciona");
        } else if (tipo.equalsIgnoreCase("bicicleta")) {
            System.out.println("sigue funcionando");
        }else {
        distancia+=2;
        }
        System.out.println(tipo+"!!!!!");
        System.out.println("Se recorrieron "+distancia+"m en total.");
    }

}
