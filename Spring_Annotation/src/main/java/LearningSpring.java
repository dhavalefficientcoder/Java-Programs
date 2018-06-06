

import com.rajeshpatkar.Point;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

public class LearningSpring
{

   public static void main(String[] args)
   {
	   System.out.println("Learning Spring");
       ApplicationContext ac = new AnnotationConfigApplicationContext(Admin.class);
       Point p1 = (Point) ac.getBean("pt1");
       System.out.println("p1 = "+p1);
       Point p2 = (Point) ac.getBean("pt1");
       System.out.println("p2 = "+p2);
       p1.setX(111);
       System.out.println("p1 = "+p1);
       System.out.println("p2 = "+p2);
       
       if (p1 == p2)
       {
           System.out.println("Equal");
       } else
       {
           System.out.println("Not Equal");
       }
   }

}

@Configuration
class Admin{
   @Bean
   @Scope(value="prototype")
   public Point pt1(){
	   Point p1 = new Point();
       p1.setX(10);
       p1.setY(20);
       return p1;
   }
   
   @Bean
   public Point pt2(){
	   Point p2 = new Point();
       p2.setX(25);
       p2.setY(50);
       return p2;
   }
}