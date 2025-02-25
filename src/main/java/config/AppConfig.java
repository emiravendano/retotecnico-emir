package config;

import model.Aguila;
import model.Animal;
import model.Perro;
import model.Pez;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages ="services")
public class AppConfig {

    @Bean
    @Primary
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
