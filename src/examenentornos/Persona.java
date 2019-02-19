/*Este codigo define la clase Persona y la clase Prefesor como una extension de la primera

Un profesor es una persona dedicada a la docencia, tanto en colegios publicos como en el ambito privado

El codigo ha sido hecho por Carlos Hernandez en mayo del 2019 */
package examenentornos;
public class Persona {
    String numeroDeTelefono;
    
    public Persona (String numeroDeTelefono){
        super();
        this.numeroDeTelefono;
    }
    
    public String getNumeroDeTelefono(){
        return numeroDeTelefono;
    }
    
    public void setNumeroDeTelefono(String numeroDeTelefono){
        this.numeroDeTelefono=numeroDeTelefono;
    }
}

public class Profesor extends Persona{
    String str;
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos;
    
    public Profesor(String numeroDeTelefono){
        super(numeroDeTelefono);
    }
    
    public void printInformacionPersonal(){
        System.out.println("nombre: "+str);
        System.out.println("edad: "+edad);
        System.out.println("telefono: "+this.numeroDeTelefono);
    }
    
    public void printTodaLaInformacion(){
        System.out.println("nombre: "+str);
        System.out.println("edad: "+edad);
        System.out.println("telefono: "+this.numeroDeTelefono);
        for(Prestamo p: prestamos){
            System.out.println(p);
        }
    }
}