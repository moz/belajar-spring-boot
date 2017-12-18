package id.hobby.belajarspringboot;

import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Component
@ApplicationPath("/api/v1")
public class JaxrsApplication extends Application {
}
