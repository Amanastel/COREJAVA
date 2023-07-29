package com.springAnnotation.controller;


import com.springAnnotation.service.Pizza;
import com.springAnnotation.service.VegPizza;
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
public class PizzaControllerAutowired {





    // @Autowired annotation finds the bean in the ApplicationContext that matches the data type of the property or constructor parameter.
    // @Autowired annotation is used to auto wire bean on the setter method.
    @Autowired
    private VegPizza vegPizza;



    // this is constructor injection
    // @Autowired annotation is used to auto wire bean on the constructor.
//    @Autowired
//    public PizzaController(VegPizza vegPizza){
//        this.vegPizza = vegPizza;
//    }


    // this is setter injection
    // @Autowired annotation is used to auto wire bean on setter method.
//    @Autowired
//    public void setVetoString(VegPizza vegPizza){
//        this.vegPizza = vegPizza;
//    }

    public String getPizza(){
        return vegPizza.getPizza();
    }




}
