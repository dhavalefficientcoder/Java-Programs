package learningspring;

import com.rajeshpatkar.Point;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LearningSpring
{

   public static void main(String[] args)
   {
       System.out.println("Learning Spring");
       ApplicationContext ac = 
             new FileSystemXmlApplicationContext("one.xml");
       Point p1 = (Point) ac.getBean("pt1");
       System.out.println("x = " + p1.getX());
       System.out.println("y = " + p1.getY());

       Point p2=(Point) ac.getBean("pt2");
       System.out.println("x = " + p2.getX());
       System.out.println("y = " + p2.getY());
   }

}