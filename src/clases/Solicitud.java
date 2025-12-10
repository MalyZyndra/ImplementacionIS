package clases;

import java.util.Date;

public class Solicitud
{
    private int id_solicitud;
    private Date fecha_creacion;
    private Date fecha_fin;
    private String estado;
    private String ubicacion;
    private Zona zona;
    private Cliente cliente;
    private Retiro retiro;
    
    public void crearRetiro() {};
    public void asignarEstado(String estado) {};
    public void asignarFechaCreacion(Date fecha) {};
    public void consultarEstado() {};
    public String devolverEstado() {
    	return estado;
    };

    public Solicitud(int id_solicitud, Date fecha_creacion, Date fecha_fin, String estado, String ubicacion, Zona zona, Cliente cliente) {};
}

