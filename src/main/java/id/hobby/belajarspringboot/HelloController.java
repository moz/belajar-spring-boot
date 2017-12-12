package id.hobby.belajarspringboot;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by rahman on 11/22/17.
 */
@Component
@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloController {
    @GET
    public Hello hello() {
        return new Hello("Rafi", "Hello world");
    }
}
