
import config.AppConfig;
import model.Animal;
import model.Perro;
import model.Aguila;
import model.Pez;
import model.TipoAnimal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.AnimalService;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, ingrese los animales en el formato: nombre|tipo|onomatopeya");
            return;
        }

        // Inicializa el contexto de Spring
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalService animalService = context.getBean(AnimalService.class);

        List<Animal> animales = Arrays.stream(args)
                .map(arg -> {
                    String[] data = arg.split("\\|");
                    if (data.length != 3) {
                        System.out.println("Formato inválido para: " + arg);
                        return null;
                    }
                    String nombre = data[0];
                    TipoAnimal tipo;
                    try {
                        tipo = TipoAnimal.valueOf(data[1].toUpperCase());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Tipo de animal inválido: " + data[1]);
                        return null;
                    }
                    String sonido = data[2];

                    return switch (tipo) {
                        case TERRESTRE -> new Perro(nombre);
                        case VOLADOR -> new Aguila(nombre);
                        case ACUATICO -> new Pez(nombre);
                    };
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        // Agrupar e imprimir resultados
        Map<TipoAnimal, List<Animal>> agrupados = animalService.agruparPorTipo(animales);
        agrupados.forEach((tipo, lista) -> {
            System.out.println("Tipo: " + tipo);
            lista.forEach(animal -> System.out.println(" - " + animal.getNombre() + " hace " + animal.hacerSonido()));
        });
    }
}
