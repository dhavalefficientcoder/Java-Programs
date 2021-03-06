package collectionapi;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsApi {

public static void main(String[] args) {
System.out.println("Array List is one of the collections api .. provided by java");
ArrayList al = new ArrayList();
System.out.println("adding element to array list");
al.add("This a String");
al.add(10);
al.add(23.6);
al.add('d');
System.out.println("\nprinting the arrayList .. ");
System.out.println(al);
System.out.println("\nobtaining the contents from the arraylist at a particular index..");
String s = (String) al.get(0); //typecasting the content obtained from the array list.
System.out.println("s=" + s);
int indexno = al.indexOf(23.6);
System.out.println("\nthe number 23.6 is located at index no " + indexno);

System.out.println("\ncreating an arraylist of String which allows only string to be stored ..");

ArrayList<String> fruitList = new ArrayList<>();

fruitList.add("Banana");
fruitList.add("Orange");
fruitList.add("Watermelon");
fruitList.add("aple");
fruitList.add("Carrot");

System.out.println("\nprinting the fruitList .. ");
System.out.println(fruitList);

System.out.println("is Tomatoes present in fruitList " + fruitList.contains("Tomatoes"));
System.out.println("is Orange present on the fruitList ? " + fruitList.contains("Orange"));

System.out.println("it Seems Carrot is not a fruit .. lets remove it from the list");
fruitList.remove("Carrot");

System.out.println("\nprinting the fruitList .. ");
System.out.println(fruitList);

System.out.println("seems we have spelled 'apple' wrongly ..."+
"so lets replace it with correct one");
indexno = fruitList.indexOf("aple");
fruitList.set(indexno, "Apple");

System.out.println("\nprinting the fruitList .. ");
System.out.println(fruitList);

System.out.println("let's try and sort this fruitList ..");
Collections.sort(fruitList);

System.out.println("\nprinting the fruitListList .. ");
System.out.println(fruitList);
}

}