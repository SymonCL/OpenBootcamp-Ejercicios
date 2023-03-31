public class Coche {
    private int numPuertas;

    public Coche() {
        numPuertas = 4; 
    }

    public void agregarPuerta() {
        numPuertas++;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}

public class Ejercicio {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();

        System.out.println(miCoche.getNumPuertas());
    }
}

