
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
@Stateless
@Path("mul")
public class restmul {
    @GET
    public int opera(@QueryParam("n1") int n1,@QueryParam("n2") int n2 ) {
        return n1+n2 ;
    }
    
}
