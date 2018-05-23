
package tareaproyecto;

public class Jefe {
    private String nombre;
    private char genero;
    private int edad;
    private String direccion;
    
    public Jefe(){}
    
    public Jefe(String nombre){
        this.nombre = nombre;
    }
    
    public Jefe(String nombre, char genro, int edad, String Direccion) {
        this.nombre = nombre;
        this.genero = genero; 
        this.edad = edad;
        this.direccion = direccion;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;    
    }
    
    public char getGenero() {
        return genero;
    }
    
    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
        
    }
}

