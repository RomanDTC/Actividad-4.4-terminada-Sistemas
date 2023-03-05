public class Persona {
    protected String str;
    protected int edad;
    protected String numeroDeTelefono;
    public Persona(String numeroDeTelefono){
        super();
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getStr() {return str;}
    public void setStr(String str) {this.str = str;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }
    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public void printInformacionPersonal(){
        System.out.println("Nombre: " + str);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + numeroDeTelefono);
    }
}
