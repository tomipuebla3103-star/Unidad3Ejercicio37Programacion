public class Lavarropa extends Electrodomestico{
    private double capacidadKg;
    private int programasLavado;

    public Lavarropa(String marca, double precioBase, double coeficienteConsumo,
                     double capacidadKg, int programasLavado) {
        super(marca, precioBase, coeficienteConsumo);
        this.capacidadKg = capacidadKg;
        this.programasLavado = programasLavado;
    }

    @Override
    public double calcularGastoAnual() {
        return super.calcularGastoAnual() + capacidadKg * 1000;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capacidad: " + capacidadKg + " kg");
        System.out.println("Programas de lavado: " + programasLavado);
    }
}
