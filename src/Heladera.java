public class Heladera extends Electrodomestico{
    private double capacidadFreezer;
    private boolean noFrost;

    public Heladera(String marca, double precioBase, double coeficienteConsumo,
                    double capacidadFreezer, boolean noFrost) {
        super(marca, precioBase, coeficienteConsumo);
        this.capacidadFreezer = capacidadFreezer;
        this.noFrost = noFrost;
    }

    @Override
    public double calcularGastoAnual() {
        double gasto = super.calcularGastoAnual() + capacidadFreezer * 500;

        if (noFrost) {
            gasto += 2000;
        }

        return gasto;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capacidad del freezer: " + capacidadFreezer + " litros");
        System.out.println("Tecnologia No Frost: " + noFrost);
    }
}
