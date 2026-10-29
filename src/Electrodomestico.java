public class Electrodomestico {
    protected String marca;
    protected double precioBase;
    protected double coeficienteConsumo;

    public Electrodomestico(String marca, double precioBase, double coeficienteConsumo) {
        this.marca = marca;
        this.precioBase = precioBase;
        this.coeficienteConsumo = coeficienteConsumo;
    }

    public double calcularGastoAnual() {
        return coeficienteConsumo * 365;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Precio base: $" + precioBase);
        System.out.println("Gasto electrico anual: $" + calcularGastoAnual());
    }
}
