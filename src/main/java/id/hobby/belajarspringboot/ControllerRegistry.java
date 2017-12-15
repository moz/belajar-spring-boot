package id.hobby.belajarspringboot;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import id.hobby.belajarspringboot.hello.HelloController;

/**
 * Created by rahman on 11/22/17.
 */
@Component
public class ControllerRegistry extends ResourceConfig {
    public ControllerRegistry() {
        register(HelloController.class);
    }
}
