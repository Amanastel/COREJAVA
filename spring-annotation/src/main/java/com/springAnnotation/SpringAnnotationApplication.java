package com.springAnnotation;

import com.springAnnotation.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationApplication {

	public static void main(String[] args) {
		var Context = SpringApplication.run(SpringAnnotationApplication.class, args);
        PizzaController pizzaController = Context.getBean(PizzaController.class);
        System.out.println(pizzaController.getPizza());
	}

}
