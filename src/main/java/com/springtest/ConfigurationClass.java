package com.springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Маша on 20.10.2017.
 */
@Configuration
public class ConfigurationClass {
    @Bean(name = "mersedescar")
    public Car mers(){
        return new Mersedes("Gold",4,2);
    }
    @Bean (name = "volvocar")
    public Car volvo(){
        return new Volvo("Black",4,3);
    }


    @Bean (name = "VasiaDriverMersedes")
    public Driver vasia(){
        return new Driver("Vasia",42);
    }
    @Bean (name = "SashaDriverVolvo")
    public Driver sasha(){
        return new Driver("Sasha",32);
    }
}
