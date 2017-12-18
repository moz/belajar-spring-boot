package id.hobby.belajarspringboot.hello;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by rahman on 11/22/17.
 */
@Component
@Produces(MediaType.APPLICATION_JSON)
@Path("/hello")
public class HelloController {
    @GET
    public Hello hello() {
        return new Hello("Rafi", "Hello world");
    }

    @GET
    @Path("/hi")
    @Produces(MediaType.TEXT_PLAIN)
    public String hii() {
        return "hii";
    }
}
