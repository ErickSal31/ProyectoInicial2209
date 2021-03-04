package mx.unam.aragon.dp;

public class Persona {
    private String nombre;
    private String ApPaterno;
    private String ApMaterno;
    private int edad;
    private String curp;

    public Persona() {
    }

    public Persona(String nombre, String ApPaterno, String ApMaterno, int edad, String curp) {
        this.nombre = nombre;
        this.ApPaterno = ApPaterno;
        this.ApMaterno = ApMaterno;
        this.edad = edad;
        this.curp = curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return ApPaterno;
    }

    public void setApPaterno(String ApPaterno) {
        this.ApPaterno = ApPaterno;
    }

    public String getApMaterno() {
        return ApMaterno;
    }

    public void setApMaterno(String ApMaterno) {
        this.ApMaterno = ApMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", ApPaterno=" + ApPaterno + ", ApMaterno=" + ApMaterno + ", edad=" + edad + ", curp=" + curp + '}';
    }
    
    
}
