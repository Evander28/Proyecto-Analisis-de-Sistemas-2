package entity;

import lombok.Getter;

@Getter
public class Estudiante {

    private int carnet;

    private String nombre;

    public Estudiante(int carnet, String nombre) {
        setCarnet( carnet );
        setNombre( nombre );
    }

    public void setCarnet( int carnet ) {
        this.carnet = carnet;
    }

    public void setNombre( String nombre ) {
        this.nombre = removerEspacios( nombre );
    }

    private String removerEspacios( String str ) {
        return str.trim().replaceAll( "\\s+", " " );
    }

    public Estudiante() {
        this( 100, "" );
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carnet=" + carnet +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
