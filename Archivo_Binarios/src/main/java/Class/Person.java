package Class;

/**
 *
 * @author Juan_K
 */
public class Person {
     protected String nombre;
     protected int edad;

    public Person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void editperson(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     
    public Object[] getInfo(){
        Object[] inf = new Object [2];
        
        inf[0] = this.nombre;
        inf[1] = this.edad;
        
        return inf;
    }
}
