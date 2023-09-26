package Servicios;

import Entidades.Habitacion;
import Entidades.Persona;
import Entidades.Reserva;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class HotelServicios {
    
    ArrayList<Reserva> listaReservas = new ArrayList();
    
    public void inicializar() {
        
        Date fecha = new Date(2023-1900, 8-1, 9);
        Date fecha2 = new Date(2023-1900, 9-1, 7);
        Date fecha3 = new Date(2024-1900, 4-1, 9);
        Date fecha4 = new Date(2024-1900, 6-1, 10);
        Persona p1 = new Persona("Chiquito", 60, 5465456, "Colombia");
        Persona p2 = new Persona("Lola",40, 545465 , "Argentina");
        Persona p3 = new Persona("Enrique", 25 ,545454, "Uruguay");
        Persona p4 = new Persona("Filomena", 98 , 45454 , "Costa Rica");
        Persona p5 = new Persona("Laura", 71 , 5454546, "Ecuador");
        
        listaReservas.add(new Reserva(0, 3, fecha, fecha2, p1));
        
        listaReservas.add(new Reserva(1, 2, fecha, fecha2, p2));
        listaReservas.add(new Reserva(5, 3, fecha3, fecha4, p3));
        listaReservas.add(new Reserva(8, 1, fecha, fecha2, p4));
        listaReservas.add(new Reserva(6, 3, fecha3, fecha4, p5));
     }

    /***************************************************************************
     * ***************************************************************************
     ****************************************************************************/
    
    public void mostrarListadoReservas(){
        listaReservas.forEach((listaReserva) -> {
            System.out.println(listaReserva);
        });
    }
    
     /***************************************************************************
     * ***************************************************************************
     ****************************************************************************/
    
    public void cargarReserva(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        Habitacion cargar = new Habitacion();
        Reserva cargarReserva = new Reserva();
        
        
        System.out.println("Ingrese la cant de personas:");
        int cantPers = leer.nextInt();
        cargar.setCantPers(leer.nextInt());
        cargarReserva.setCantPers(cantPers);
        cargarReserva.setDatosPersona(crearPersona());
        
        System.out.println("Ingrese el numero de habitac");
        //cargar.setNumHab(leer.nextInt());
        cargarReserva.setNumHab(leer.nextInt());
        
        System.out.println("Ingrese la fecha de ingreso");
        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        Date fechaIn = new Date(anio - 1900, mes -1, dia);
        //cargar.setFechaIn(fechaIn);
        cargarReserva.setFechaIn(fechaIn);
        
        System.out.println("Ingrese la fecha de salida");
        System.out.println("Ingrese el dia");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el año");
        anio = leer.nextInt();
        Date fechaOut = new Date(anio - 1900, mes -1, dia);
        cargar.setFechaOut(fechaOut);
        cargarReserva.setFechaOut(fechaOut);
        
        System.out.println("");
        
        cargarReserva.setId();
        
        listaReservas.add(cargarReserva);

        System.out.println(cargar);
        mostrarListadoReservas();
    }
    
    /***************************************************************************
     * ***************************************************************************
     ****************************************************************************/
    
    private static boolean validar(int numHab, int cantPer) {
        if (numHab >= 1 && numHab <= 5) {
            return cantPer == 2;
        } else if (numHab >= 6 && numHab <= 8) {
            return cantPer <= 3;
        } else if (numHab >= 9 && numHab <= 10) {
            return cantPer == 1;
        }
        return false;
    }
    
    /***************************************************************************
     * ***************************************************************************
     ****************************************************************************/
    
    public Persona crearPersona() {
        
        Scanner leer = new Scanner(System.in);

        Persona persona = new Persona();

        System.out.println("Ingresa tu nombre");
        persona.setNombre(leer.nextLine());
        System.out.println("Ingresa tu edad");
        persona.setEdad(leer.nextInt());

        System.out.println("Ingresa el DNI");
        persona.setDni(leer.nextInt());
        leer.nextLine();

        leer.nextLine();
        System.out.println("Ingresa tu nacionalidad");
        persona.setPais(leer.nextLine().toLowerCase());

        return persona;

	}
    
    /***************************************************************************
     * ***************************************************************************
     ****************************************************************************/
    
    public Reserva buscarReservaPorId(int id) {
        for (Reserva reserva : listaReservas) {
            if (reserva.getId() == id) {
                return reserva;
            }
        }
        return null;
    }
    
    
    public void eliminarReserva() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID de la reserva a eliminar: ");
        int id = scanner.nextInt();
        Reserva reserva = buscarReservaPorId(id);
        if (reserva == null) {
            System.out.println("Reserva no encontrada.");
            return;
        }
        
        listaReservas.remove(reserva);
        System.out.println("Reserva eliminada exitosamente.");
        
        mostrarListadoReservas();
    }
    
    
    
}
