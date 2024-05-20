import java.util.Scanner;

public class Main {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Tarea tarea1 = new Tarea("Limpiar",30,false);
        Tarea tarea2 = new Tarea("Cocinar",60,true);


        System.out.println(tarea1);
        revisar(tarea1);
        System.out.println(tarea2);
        revisar(tarea2);


    }
    public static void revisar(Tarea tarea){
        System.out.println(tarea.toString()); // probando los comentarios por aqui.
        System.out.println("la tarea"+tarea.getDescripcion()+"esta realizada? 1.si / 2.no");

        int decision = leer.nextInt();
        if (decision == 1){
            tarea.setEstado(true);

        }

    }
}
