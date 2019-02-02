package prajwal.rentalProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	SpringApplication spr=new SpringApplication(App.class);
    	spr.run();
    }
}
