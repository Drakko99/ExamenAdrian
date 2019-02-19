/*Este codigo define la clase Persona y la clase Prefesor como una extension de la primera

El codigo ha sido hecho por Carlos Hernandez en mayo del 2019 */
package examenentornos;
/**
 * la clase persona de la hereda profesor
 * @author Adrián
 */
public class Persona {
    String numeroDeTelefono;
    /**
     * define el numero de telefono
     * @param numeroDeTelefono el telefono de la persona
     */
    public Persona (String numeroDeTelefono){
        super();
        this.numeroDeTelefono;
    }
    /**
     * 
     * @return devuelve el numero del telefono
     */
    public String getNumeroDeTelefono(){
        return numeroDeTelefono;
    }
    /**
     * 
     * @param numeroDeTelefono da el telefono de la persona
     */
    public void setNumeroDeTelefono(String numeroDeTelefono){
        this.numeroDeTelefono=numeroDeTelefono;
    }
}
/**
 * la clase profesor que hereda de persona
 * @author Adrián
 */
public class Profesor extends Persona{
    String str;
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos;
    /**
     * define el telefono
     * @param numeroDeTelefono el numero de telefono de profesor
     */
    public Profesor(String numeroDeTelefono){
        super(numeroDeTelefono);
    }
    /**
     * imprime la informacion de la persona
     */
    public void printInformacionPersonal(){
        System.out.println("nombre: "+str);
        System.out.println("edad: "+edad);
        System.out.println("telefono: "+this.numeroDeTelefono);
    }
    /**
     * imprime la informacion de la persona mas el prestamo
     */
    public void printTodaLaInformacion(){
        System.out.println("nombre: "+str);
        System.out.println("edad: "+edad);
        System.out.println("telefono: "+this.numeroDeTelefono);
        for(Prestamo p: prestamos){
            System.out.println(p);
        }
    }
}