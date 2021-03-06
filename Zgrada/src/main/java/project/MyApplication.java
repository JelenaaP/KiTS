package project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication  // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class MyApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(MyApplication.class, args);
    }
}
