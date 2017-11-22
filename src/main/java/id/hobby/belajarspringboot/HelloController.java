package id.hobby.belajarspringboot;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by rahman on 11/22/17.
 */
@Component
@Path("/hello")
public class HelloController {
    @GET
    public String hello() {
        return "Hello world!!!";
    }
}
