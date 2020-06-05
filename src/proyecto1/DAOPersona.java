package proyecto1;

/**
 *
 * @author david
 */
public class DAOPersona {
    public boolean guardar(Persona p){
        boolean res=false;
        ConexionBD con= ConexionBD.getInstance();
        String sql="inserte into persona (clave, nombre, direccion, telefono) values"
                + "('" + p.getClave() + "','" + p.getNombre() + "','" + p.getDireccion() + "','" +
                p.getTelefono() + "')";
        res=con.execute(sql);
        return res;
    }
}
