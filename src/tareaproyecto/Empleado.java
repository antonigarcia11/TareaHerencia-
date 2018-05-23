package tareaproyecto;

public class Empleado extends Jefe{
    
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;
    
    public Empleado(String nombre, double sueldo) {
        super(nombre); 
        this.idEmpleado = ++contadorEmpleados;
        this.sueldo = sueldo;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }
    
    public double getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public String toString() {
        
        return super.toString() + " Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }
}

