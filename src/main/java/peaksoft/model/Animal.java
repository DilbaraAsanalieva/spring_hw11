package peaksoft.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class Animal {


    @Bean
    public AnimalsCage animalsCage(){
        return new AnimalsCage();
    }
    @Bean
    @Primary
    public Animal dog(){
        return new Dog();
    }

}
