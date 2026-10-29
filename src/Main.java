//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Lavarropa lavarropa = new Lavarropa(
            "Samsung", 500000, 2.5, 8, 12
    );

    Heladera heladera = new Heladera(
            "Whirlpool", 800000, 3.0, 100, true
    );

    System.out.println("=== LAVARROPA ===");
    lavarropa.mostrarDatos();

    System.out.println("\n=== HELADERA ===");
    heladera.mostrarDatos();
}
