package com.springAnnotation;

//import com.springAnnotation.controller.PizzaController;
import com.springAnnotation.controller.PizzaControllerAutowired;
import com.springAnnotation.controller.PizzaControllerPrimary;
import com.springAnnotation.controller.PizzaControllerQualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationApplication {

	public static void main(String[] args) {
		var Context = SpringApplication.run(SpringAnnotationApplication.class, args);

//        PizzaControllerAutowired pizzaController = Context.getBean(PizzaControllerAutowired.class);
//        System.out.println(pizzaController.getPizza());


//        PizzaControllerQualifier pizzaController = Context.getBean(PizzaControllerQualifier.class);
//        System.out.println(pizzaController.getPizza());

        PizzaControllerPrimary pizzaController = Context.getBean(PizzaControllerPrimary.class);
        System.out.println(pizzaController.getPizza());

	}

}
