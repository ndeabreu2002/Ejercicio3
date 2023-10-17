public class Auto {
    private String marca;
    private String modelo;
    private int año;
    private double precio;


    public Auto(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    
    public void imprimirInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Precio: $" + precio);
    }

    public static void main(String[] args) {
       
        Auto auto1 = new Auto("Toyota", "Corolla", 2022, 25000.0);
        Auto auto2 = new Auto("Ford", "Mustang", 2023, 45000.0);

       
        System.out.println("Auto 1:");
        auto1.imprimirInformacion();

        System.out.println("\nAuto 2:");
        auto2.imprimirInformacion();
    }
}