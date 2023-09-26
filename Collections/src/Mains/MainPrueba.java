package Mains;

import java.util.*;

public class MainPrueba {

	public static void main(String[] args) {

		List<Integer> listado = new ArrayList();
		TreeSet<String> listadoOrdenado = new TreeSet();
		HashMap<Integer, String> personas = new HashMap();
		HashSet<Integer> numeros = new HashSet();

		int num = 63;
		int num2 = 16;

		numeros.add(num);
		numeros.add(num2);
//		System.out.println(numeros.toString());
//		numeros.remove(num);
//		System.out.println(numeros.toString());

		listado.add(50);
		listado.add(20);
		listado.add(80);
		listado.add(66);
		listado.add(41);
		// Borrar dato
		listado.remove(2);

		listadoOrdenado.add("1");
		listadoOrdenado.add("60");
		listadoOrdenado.add("40");
		listadoOrdenado.add("30");
		listadoOrdenado.add("50");
		listadoOrdenado.remove("50");

		personas.put(1230, "Mauricio");
		personas.put(1256, "Luis");
		personas.put(123, "Julia");
		personas.put(1290, "Elena");
		// Borrar Dato Hash map
		//personas.remove(1230);

//		System.out.println("--Ordenado---");
//		System.out.println(listadoOrdenado.toString());
//		System.out.println("--Lista---");
//		System.out.println(listado.toString());

		HashMap<Integer, String> personas1 = new HashMap();
		String n1 = "Albus";
		String n2 = "Severus";
		personas1.put(1, n1);
		personas1.put(30, n2);

		ArrayList<String> bebidas = new ArrayList();
		bebidas.add("caf�");
		bebidas.add("t�");
		Iterator<String> it = bebidas.iterator();
		while (it.hasNext()) {
			if (it.next().equals("caf�")) {
				it.remove();
			}

		}

		// HashMap<Integer,String> alumnos = new HashMap();
		System.out.println("--Mapa---");
		System.out.println(personas.toString());

		System.out.println("Ordenado ");

		TreeMap<Integer, String> alumnosTree = new TreeMap(personas);

		System.out.println(alumnosTree.toString());

	}
	
	

}
