public abstract class Animal {
    private String Nombre;
    private String tipo;

    public Animal(String nombre, String tipo) {
        Nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract void comer();

    public abstract void respirar();

}
