package com.jmr.practica.entities_practica.libreria_custom_maven_practica;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LibreriaCustomMavenPracticaApplication {
}
