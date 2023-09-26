package POOEjerciciosGuía;

import Entidades.Vehiculo;
import Servicio.vehiculoServicio;

import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int distancia;

        vehiculoServicio vh = new vehiculoServicio();
        Vehiculo vh1 = vh.crearVehiculo();
        Vehiculo vh2 = vehiculoServicio.crearVehiculo();
        Vehiculo vh3 =  vehiculoServicio.crearVehiculo();
        /*int cant;
        System.out.println("Ingrese la cantidad de veh�culos a declarar");
        cant = r.nextInt();*/

        vh.frenar(vh.moverse(vh1.getTipo()), vh1.getTipo());
        vh.frenar(vh.moverse(vh2.getTipo()), vh2.getTipo());
        vh.frenar(vh.moverse(vh3.getTipo()), vh3.getTipo());
    }
}
