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
public class PizzaControllerQualifier {




    // Qualifier

    // @Qualifier annotation is used to resolve the autowiring conflict, when there are multiple beans of same type.
    // @Qualifier annotation is used to specify the bean name with which the property or constructor argument should be autowired.

    private Pizza pizza;

    @Autowired
    public PizzaControllerQualifier(@Qualifier("vegPizza") Pizza pizza){
        this.pizza = pizza;
    }

    public String getPizza(){
        return pizza.getPizza();
    }

}
