package Entidad;

/**
 *
 * @author david
 */
public final class Hotel5 extends Hotel4 {

    private int cantSalones;
    private int cantSuits;
    private int cantLimosinas;

    public Hotel5(int cantSalones, int cantSuits, int cantLimosinas, String nombre, String direccion, String localidad, String gerente, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitaciones, String gim, String nameRest, int capRest) {
        super(nombre, direccion, localidad, gerente, cantHabitaciones, numCamas, cantPisos, precioHabitaciones, gim, nameRest, capRest);
        this.cantSalones = cantSalones;
        this.cantSuits = cantSuits;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(int cantSalones) {
        this.cantSalones = cantSalones;
    }

    public int getCantSuits() {
        return cantSuits;
    }

    public void setCantSuits(int cantSuits) {
        this.cantSuits = cantSuits;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel5{" + super.toString() + "cantSalones=" + cantSalones + ", cantSuits=" + cantSuits + ", cantLimosinas=" + cantLimosinas + '}';
    }

    @Override
    public double precioHabitacion() {
        return super.precioHabitacion() + (15 * cantLimosinas);
    }

}
