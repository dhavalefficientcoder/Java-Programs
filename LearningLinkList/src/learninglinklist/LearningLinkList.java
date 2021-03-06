package learninglinklist;

import java.util.Collections;
import java.util.LinkedList;
public class LearningLinkList {

public static void main(String[] args) {
LinkedList ll = new LinkedList();
System.out.println("we can store anything in linked list int , String , char , float etc..");
ll.add("Hello World");
ll.add(7789);
ll.add('J');
ll.add(87.987765);
System.out.println("\nprinting the list using println ");
System.out.println(ll);
System.out.println("printing the list using for each loop..\n");
for(Object o : ll){
System.out.println(o);
}
LinkedList<Integer> numbers = new LinkedList<Integer>();
numbers.add(34);
numbers.add(89);
numbers.add(784);
numbers.add(556);
numbers.add(903);
numbers.add(856);
numbers.add(45);
numbers.add(342);
numbers.add(19);
System.out.println("\nprinting the numbers list .. ");
System.out.println(numbers);
System.out.println("\n adding a number to the end of the list");
numbers.addLast(999);
System.out.println("\nprinting the numbers list .. ");
System.out.println(numbers);
System.out.println("\n adding the number to the beginning of the list");
numbers.addFirst(-1);
System.out.println("\nprinting the numbers list .. ");
System.out.println(numbers);
System.out.println("\n first element of the lis is "+numbers.peekFirst());
System.out.println("\n first element of the lis is "+numbers.peekLast());
System.out.println("\n element at 5th index is "+numbers.get(5));
System.out.println("\nWe can also find weather a number is present on the list.. ");
System.out.println("For eg. is 903 on the list ?? "+ numbers.contains(903));
System.out.println("is 729 on the list ? "+numbers.contains(729));
System.out.println("\nwe can also insert the element in the middle of the list ");
System.out.println("\nprinting the numbers list before inserting ");
System.out.println(numbers);
System.out.println("printing the numbers list"+
" after inserting the number 7777 at 3rd index");
numbers.add(3, 7777);
System.out.println(numbers);
System.out.println("\n sorting the list is also very simple ");
Collections.sort(numbers);
System.out.println(numbers);
System.out.println("we can also shuffle the list for random ordering the numbers");
Collections.shuffle(numbers);
System.out.println(numbers);
}
}