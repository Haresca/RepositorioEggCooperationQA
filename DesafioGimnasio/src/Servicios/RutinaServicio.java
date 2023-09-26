package Servicios;

import Entidades.Rutina;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

/* @author jmlucero */
public class RutinaServicio {

    ArrayList<Rutina> rutinas = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void inicializarRutinas() {
        rutinas.add(new Rutina("Empuje", 10, 1, "Descripción de rutina 1"));
        rutinas.add(new Rutina("Tirón", 10, 2, "Descripción de rutina 2"));
        Rutina ru1 = new Rutina("Tren inferior", 15, 3, "Descripción de rutina 3");
        Rutina ru2 = new Rutina();
        ru2.setNombre("Tren superior");
        ru2.setDuracion(15);
        ru2.setNivelDificultad(3);
        ru2.setDescripcion("Descripción de rutina 4");
        rutinas.add(ru1);
        rutinas.add(ru2);
    }

    public void registrarRutina() {
        Rutina rutina1 = new Rutina();

        System.out.println("Introduzca el nombre de la rutina");
        rutina1.setNombre(leer.next());
        System.out.println("Ingrese la duración de la rutina:");
        rutina1.setDuracion(leer.nextInt());
        System.out.println("Ingrese la dificultad de la rutina:");
        rutina1.setNivelDificultad(leer.nextInt());
        System.out.println("Ingrese la descripción de la rutina:");
        rutina1.setDescripcion(leer.next());
        rutinas.add(rutina1);
    }

    public void actualizarRutina() {

        Rutina opcion = encontrarRutinas();

        System.out.println("Datos de la rutina seleccionada");
        System.out.println(opcion);
        System.out.println("----\nSeleccione el dato a modificar:\n----"
                + "\n 1.NOMBRE"
                + "\n 2.DURACIÓN"
                + "\n 3.NIVEL DE DIFICULTAD"
                + "\n 4.DESCRIPCIÓN");
        int datoAMod = leer.nextInt();
        switch (datoAMod) {
            case 1:
                System.out.println("Agregue el nuevo nombre:");
                opcion.setNombre(leer.next());
                break;
            case 2:
                System.out.println("Agregue la nueva duración en minutos:");
                opcion.setDuracion(leer.nextInt());
                break;
            case 3:
                System.out.println("Agregue la nueva dificultad:");
                opcion.setNivelDificultad(leer.nextInt());
                break;
            case 4:
                System.out.println("Agregue la nueva descripción:");
                opcion.setDescripcion(leer.next());
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

    public void eliminarRutina() {
        Rutina opcion = encontrarRutinas();
        rutinas.remove(opcion);
        System.out.println("Dato eliminado. La lista se actualizó.");
        System.out.println("------ DATOS  DE  LAS  RUTINAS -------");
        rutinas.forEach(System.out::println);

    }

    public Rutina encontrarRutinas() {

        System.out.println("Ingrese el nombre para la búsqueda");
        ArrayList<Rutina> resultset2 = new ArrayList();

        String nombre = leer.next();
        //return clientes.stream().filter(cli ->cli.getEdad()>=45).filter(mayores ->"Musculacion".equals(mayores.getObjetivo())).forEach(System.out::println);
        // .... Probar viendo: Optional<Cliente> clienteEncontrado = clientes.stream()
        //        .filter(cliente -> cliente.getId() == idClienteEliminar).findFirst();

        for (int i = 0; i < rutinas.size(); i++) {
            if (rutinas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                resultset2.add(rutinas.get(i));
            }
        }

        Rutina opcion;
        if (resultset2.isEmpty()) {
            System.out.println("No se han encontrado rutinas coincidentes");
        } else {
            if (resultset2.size() > 1) {
//                resultset.forEach(System.out::println);
//                System.out.println("Ingrese el ordinal del item a seleccionar");
//                opcion =resultset.get(leer.nextInt()-1);
//                return opcion;
                resultset2.forEach(System.out::println);
                System.out.println("Ingrese el id del item a seleccionar");
                int seleccionId = leer.nextInt();
                Optional<Rutina> rutinaEncontrada = rutinas.stream()
                        .filter(rutina -> rutina.getId() == seleccionId)
                        .findFirst();

                Rutina rutinaOpcion = rutinaEncontrada.get();

                opcion = rutinaOpcion;
                return opcion;

            } else {
                return resultset2.get(0);
            }
        }
        return null;

    }

    public void obtenerRutinas() {
        System.out.println("------ DATOS  DE  LAS  RUTINAS -------");
//        for (Object rutina : rutinas) {
//            System.out.println(rutina);
//        }
        // clientes.forEach(cliente -> System.out.println(cliente));
        rutinas.forEach(System.out::println);

    }

}
