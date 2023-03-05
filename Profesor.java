import java.util.List;

public class Profesor extends Persona{
    List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono, String numeroDeTelefono1) {
        super(numeroDeTelefono);
    }

    public void printTodaLaInformacion(){
        printInformacionPersonal();
        for (Prestamo p: prestamos) {
            System.out.println(p);
        }
    }

}
