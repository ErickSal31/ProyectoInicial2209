package mx.unam.aragon.dp;

public class UsarEmpleado {
    public static void main(String[] args) {
        Empleado emp1=new Empleado(1, "Sistemas", 45000.0f, 15);
        emp1.setNombre("Juan Jose");
        emp1.setApPaterno("Garcia");
        emp1.setApMaterno("Bolaños");
        emp1.setEdad(24);
        emp1.setCurp("GAB121212HDFLNRA1");
        
        System.out.println("info"+emp1);
        
    }
}
