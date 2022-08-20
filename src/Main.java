public class Main {
public static void main(String[] args){
    Perro p=new Perro("Mamifero","Perro",5,"Blanco","Criollo");
    System.out.println("Metodos del Padre");
    p.respirar();
    p.comer();
    System.out.println("Metodos de la interface");
    p.respirar();
    p.bañar();
}

}
