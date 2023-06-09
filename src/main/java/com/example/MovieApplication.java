package com.example;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(info = @Info(title = "Movie API",
        description = "Movie Application",
        version = "1.0.0",
        license = @License(name= "MIT",url = "localhost")),
        tags = @Tag(
                name = "movies",description = "Movies"
        ))
public class MovieApplication extends Application {
}
