package org.niit;
import org.springframework.context.annotation.Bean;


public class AppCongif {

    @Bean("Product1")
    public Product getProduct(){
        return new Product(1,"Pixel","A phone from Google");
    }
    @Bean("Product2")
    public Product getProduct1(){
        return new Product(2,"iphone14","A Phone from Apple");
    }

    @Bean("Product3")
    public Product getProduct3(){
        return new Product(3,"Moto","A phone from Lenovo");
    }

}
