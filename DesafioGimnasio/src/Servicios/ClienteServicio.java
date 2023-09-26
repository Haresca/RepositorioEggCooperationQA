package Servicios;

import Entidades.Cliente;
import java.util.ArrayList;
//import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

/* @author jmlucero */
public class ClienteServicio {

    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void inicializarClientes() {
        clientes.add(new Cliente("Juanelo", 40, 2.00, 60, "Marcar"));
        clientes.add(new Cliente("Juanelo", 45, 1.45, 60, "Marcar"));
        Cliente cli1 = new Cliente("Pepita", 45, 1.8, 78, "Bajar Peso");
        Cliente cli2 = new Cliente();
        cli2.setNombre("Hermenegilda");
        cli2.setEdad(40);
        cli2.setAltura(1.68);
        cli2.setObjetivo("Levantar Gluteos");
        clientes.add(cli1);
        clientes.add(cli2);
    }

    public void registrarCliente() {
        Cliente cl1 = new Cliente();

        System.out.println("Introduzca el nombre del cliente");
        cl1.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        cl1.setEdad(leer.nextInt());
        try {
            System.out.println("Ingrese su altura");
            cl1.setAltura(Double.parseDouble(leer.next()));
        } catch (Exception e) {
            System.out.println("Probablemente ingreso un punto en lugar de coma");
        }

        System.out.println("Ingrese su peso");
        cl1.setPeso(leer.nextDouble());
        System.out.println("Ingrese el objetivo");
        cl1.setObjetivo(leer.next());
        clientes.add(cl1);
    }

    public void actualizarCliente() {

         
            Cliente opcion=encontrarClientes();
        
            System.out.println("Datos del objeto seleccionado");
            System.out.println(opcion);
            System.out.println("----\nSeleccione el dato a modificar:\n----"
                    + "\n 1.NOMBRE"
                    + "\n 2.EDAD"
                    + "\n 3.ALTURA"
                    + "\n 4.PESO"
                    + "\n 5.OBJETIVO");
            int datoAMod = leer.nextInt();
            switch(datoAMod) {
                case 1:
                    System.out.println("Agregue el nuevo nombre:");
                    opcion.setNombre(leer.next());
                    break;
                case 2: 
                    System.out.println("Agregue la nueva edad:");
                    opcion.setEdad(leer.nextInt());
                    break;
                case 3:
                    System.out.println("Agregue la nueva altura:");
                    opcion.setAltura(Double.parseDouble(leer.next()));
                    break;
                case 4:
                    System.out.println("Agregue el nuevo peso:");
                    opcion.setPeso(Double.parseDouble(leer.next()));
                    break;
                case 5:
                    System.out.println("Agregue el nuevo objetivo:");
                    opcion.setObjetivo(leer.next());
                    break;               
                default:
                    System.out.println("No ingresó dato válido");
                       
            }
             System.out.println("Dato modificado: " + opcion);

        }
    /*
        System.out.println("FINALMENTEEEEEEE");
        clientes.forEach(System.out::println);
    */
        
    
    public void eliminarCliente() {
        Cliente opcion=encontrarClientes();
        clientes.remove(opcion);
        System.out.println("Dato eliminado. La lista se actualizó.");
        System.out.println("------ DATOS  DE  LOS  CLIENTES -------");
        clientes.forEach(System.out::println);
        
    }
 

    public Cliente encontrarClientes() {
        
        System.out.println("Ingrese el nombre para la búsqueda");
        ArrayList<Cliente> resultset = new ArrayList();
        
        String nombre = leer.next();
        //return clientes.stream().filter(cli ->cli.getEdad()>=45).filter(mayores ->"Musculacion".equals(mayores.getObjetivo())).forEach(System.out::println);
        // .... Probar viendo: Optional<Cliente> clienteEncontrado = clientes.stream()
        //        .filter(cliente -> cliente.getId() == idClienteEliminar).findFirst();
        
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                resultset.add(clientes.get(i));
            }
        }
        
        
        Cliente opcion;
        if (resultset.isEmpty()) {
            System.out.println("No se han encontrado clientes coincidentes");
        } else {
            if (resultset.size() > 1) {
//                resultset.forEach(System.out::println);
//                System.out.println("Ingrese el ordinal del item a seleccionar");
//                opcion =resultset.get(leer.nextInt()-1);
//                return opcion;
                resultset.forEach(System.out::println);
                System.out.println("Ingrese el id del item a seleccionar");
                int seleccionId = leer.nextInt();
                Optional<Cliente> clienteEncontrado = clientes.stream()
              .filter(cliente -> cliente.getId() == seleccionId)
              .findFirst();
                
                Cliente clienteOpcion = clienteEncontrado.get();
                
                opcion = clienteOpcion;
                return opcion;
 
            } else {
                return resultset.get(0);
            }
        }
        return null;
        
    }

    public void obtenerClientes() {
        System.out.println("------ DATOS  DE  LOS  CLIENTES -------");
        for (Object cliente : clientes) {
            System.out.println(cliente);
        }
        // clientes.forEach(cliente -> System.out.println(cliente));
        // clientes.forEach(System.out::println);

    }

}


/*RegistrarCliente: lo registra en el sistema.
obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo): recibe el identificador
de un cliente existente y los nuevos datos del cliente, y actualiza la información correspondiente en el sistema.
eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema.*/
