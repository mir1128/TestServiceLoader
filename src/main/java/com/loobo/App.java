package com.loobo;

import java.util.ServiceLoader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ServiceLoader<CPService> serviceLoader  = ServiceLoader.load(CPService.class);
        for (CPService service : serviceLoader) {
            System.out.println(service.getScheme()+"="+service.sayHello());
        }
    }
}
