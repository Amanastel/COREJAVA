package com.springAnnotation.controller;


import com.springAnnotation.service.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Component we don't need to create the instance of the class using the new keyword.
// @Component annotation is used to denote a class as Component.
// @Component auto detects and configures the beans using classpath scanning.

// @Component is a class level annotation.
// @Component is used to mark a java class as a bean so that the component-scanning mechanism of spring can add into the application context.
// @Component is a generic annotation.
// @Component annotation is auto detected by classpath scanning.
// @Component annotation is annotated with @Indexed annotation.
// @Component annotation is a specialization of @Component annotation.
// @Component annotation is used with the classes that are auto detected by classpath scanning.

@Component
public class PizzaControllerPrimary {


    // Primary

    // @Primary annotation is used to give higher preference to a bean when there are multiple beans of same type.
    // @Primary annotation is used with @Component annotation.
    // @Primary annotation is used with @Bean annotation.
    // @Primary annotation is used with @Qualifier annotation.
    // @Primary annotation is used with @Autowired annotation.
    // @Primary annotation is used with @Resource annotation.

    // here we are using @Primary annotation in the VegPizza class.

    private Pizza pizza;

    @Autowired
    public PizzaControllerPrimary(Pizza pizza){
        this.pizza = pizza;
    }

    public String getPizza(){
        return pizza.getPizza();
    }

}
