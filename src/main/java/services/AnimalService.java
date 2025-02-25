package services;

import model.Animal;
import model.TipoAnimal;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AnimalService {
    public Map<TipoAnimal, List<Animal>> agruparPorTipo(List<Animal> animales){
        return animales.stream().collect(Collectors.groupingBy(Animal::getTipo));
    }
}
