package org.niit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppCongif.class);
        Product p=context.getBean("Product1",Product.class);
        System.out.println(p);
        System.out.println(context.getBean("Product2",Product.class));
        System.out.println(context.getBean("Product3",Product.class));

    }
}
