package config;

import model.Aguila;
import model.Animal;
import model.Perro;
import model.Pez;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="services")
public class AppConfig {

    @Bean
    public Animal perro(){
        return new Perro("Bobby");
    }
    @Bean
    public Animal aguila(){
        return new Aguila("Águila Real");
    }
    @Bean
    public Animal pez(){
        return new Pez("Nemo");
    }
}
