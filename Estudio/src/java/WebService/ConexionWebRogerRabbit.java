package WebService;

import javax.jws.WebService;
import javax.jws.WebParam;

/**
 * @author Oscar
 */
@WebService(serviceName = "ConexionWebRogerRabbit")
public class ConexionWebRogerRabbit {
    
   public String pruebaConexionRogerRabbit(@WebParam(name= "datosRR") String txt){
       return "Conexion Exitosa";
   }

}
