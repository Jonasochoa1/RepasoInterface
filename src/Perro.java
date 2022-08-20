import com.sun.deploy.util.SyncAccess;

public class Perro  extends Animal implements Mascotas {

    private int edad;
    private String nombrePerro;
    private String raza;

    public Perro(String nombre, String tipo, int edad, String nombrePerro, String raza) {
        super(nombre, tipo);
        this.edad = edad;
        this.nombrePerro = nombrePerro;
        this.raza = raza;
    }

    @Override
    public void bañar() {
        System.out.println("Bañando a :" + this.nombrePerro);

    }

    @Override
    public void vacunar() {
        System.out.println("Vacunando a:" + this.nombrePerro);

    }

    @Override
    public void comer() {
        System.out.println("El perro come concentrado ");
    }

    @Override
    public void respirar() {
        System.out.println("El perro respira bien");
    }
}
