/*
 * Implementación Ejemplo Introducción Spring
 * http://acodigo.blogspot.com/2017/02/spring-tutorial-de-introduccion.html
 * Creación de Clase para la creación del contenedor y la prueba del ejercicio
 */
package com.golano.spring.introduccionspring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 17/04/2019
 * @author gaolanot 
 */
public class Introduccion {
    
    public static void main(String[] args) {
        AbstractApplicationContext ctx = 
                new ClassPathXmlApplicationContext("springXMLConfig.xml");
        HelloService saluda  = ctx.getBean("saludaService",HelloService.class);
        saluda.saludar();
        ctx.close();
    }
    
}
