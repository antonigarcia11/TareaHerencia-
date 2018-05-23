package tareaproyecto;

public class TareaProyecto {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Andres", 2500);
        e1.setEdad(22);
        e1.setGenero('M');
        
        e1.setDireccion("Guatemala, Guatemala");
        System.out.println("Empleado1");
        System.out.println(e1);
        
        Empleado e2 = new Empleado("Fredy", 3000);
        e2.setEdad(28);
        e2.setGenero('M');
        e2.setDireccion("Guatemala, Guatemala");
        System.out.println(" Empleado2");
        System.out.println(e2);
        
        Cliente c1 = new Cliente(new java.util.Date(), false);
        c1.setNombre("Antoni");
        c1.setEdad(22);
        c1.setGenero('M');
        c1.setDireccion("Guatemala,Ciudad ");
        System.out.println("Cliente1");
        System.out.println(c1);
        
        Cliente c2 = new Cliente(new java.util.Date(), true);
        c2.setNombre("Brenda");
        c2.setEdad(30);
        c2.setGenero('F');
        c2.setDireccion("Guatemala,Ciudad ");
        System.out.println("Cliente2");
        System.out.println(c2);
    }
}
        
    
    

