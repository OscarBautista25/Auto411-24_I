/**
 * Automovil
 */
public class Automovil {
    String marca;
    int modelo;
    int velocidadMaxima;
    int velocidadActual=0;

    enum tipoCom {
        GASOLINA, BIODISEL, BIOGASOLINA
    }

    tipoCom tipoCombustible;

    enum tipoAuto {
        SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }

    tipoAuto tipoAutomovil;

    public Automovil(String marca, int modelo, int velocidadMaxima, Automovil.tipoCom tipoCombustible,
            Automovil.tipoAuto tipoAutomovil) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    void acelerar(int incremento){
        if (velocidadActual+incremento<velocidadMaxima) {
            velocidadActual=velocidadActual+incremento;
        } else {
            System.out.println("No se puede incrementar por encima de la velocidad máxima");
        }
    }
    void desacelerar (int decremento){
        if (velocidadActual-decremento>0) {
            velocidadActual=velocidadActual-decremento;
            
        } else {
            System.out.println("No se puede devrementar a un valor menor a 0");
        }
    }
    void frenar(){
        velocidadActual=0;
    }
    
    float calcularTiempoLlegada(int distancia){
        return distancia/velocidadActual;
    }

    void mostrar(){
        System.out.println("Marca = " +marca);
        System.out.println("Modelo = " +modelo);
        System.out.println("Velocidad Max = " +velocidadMaxima);
        System.out.println("Velocidad Actual = " +velocidadActual);
        System.out.println("Tipo De Combustible = " +tipoCombustible);
        System.out.println("Tipo de Automovil = " +tipoAutomovil);
    }

    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Toyota", 2025, 350, tipoCom.BIODISEL, tipoAuto.SUV);
        auto1.mostrar();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad Actual = " +auto1.velocidadActual);
        auto1.acelerar(20);
        System.out.println("Velocidad Actual = " +auto1.velocidadActual);
        auto1.desacelerar(50);
        System.out.println("Velocidad Actual = " +auto1.velocidadActual);
        auto1.frenar();
        System.out.println("Velocidad Actual = " +auto1.velocidadActual);
        auto1.desacelerar(10);
        System.out.println("Velocidad Actual = " +auto1.velocidadActual);

    }

        
}