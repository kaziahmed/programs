package programs;

import java.util.*;

public class Program1 {

	public static void main(String args[]){
		//Creates a new LinkedList
	    LinkedList l2 = new LinkedList();
	    //Add elements to the linked list
	    l2.add("A");
	    l2.add("B");
	    l2.add("C");
	    l2.add("D");
	    l2.add("E");
	    l2.addLast("F");
	    l2.addFirst("G");
	    l2.add(1, "H");
	    System.out.println("Original contents of l2: " + l2);

	    //Remove elements from the linked list
	    l2.remove("F");
	    l2.remove(2);
	    System.out.println("Contents of l2 after deletion: " + l2);
	      
	    //Remove first and last elements
	    l2.removeFirst();
	    l2.removeLast();
	    System.out.println("l2 after deleting first and last: " + l2);

	    //Get gets a value and set sets a value to a certain object
	    Object val = l2.get(2);
	    l2.set(2, (String) val + " Changed");
	    System.out.println("l2 after change: " + l2 + "\n");
	    
	    //Date
	    //Instantiate a Date object
	    Date date = new Date();
	        
	    //Display time and date using toString()
	    System.out.println(date.toString() + "\n");
	      
	    //Array
	    //Declares an array of integers
	    int[] anArray;

	    //Allocates memory for 10 integers
	    anArray = new int[10];
	           
	    //Initialize first element
	    anArray[0] = 100;
	    //Initialize second element
	    anArray[1] = 200;
	    //Continued
	    anArray[2] = 300;
	    anArray[3] = 400;
	    anArray[4] = 500;
	    anArray[5] = 600;
	    anArray[6] = 700;
	    anArray[7] = 800;
	    anArray[8] = 900;
	    anArray[9] = 1000;

	    //Prints the element at each index
	    System.out.println("Element at index 0: " + anArray[0]);
	    System.out.println("Element at index 1: " + anArray[1]);
	    System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
	    System.out.println("Element at index 4: " + anArray[4]);
	    System.out.println("Element at index 5: " + anArray[5]);
	    System.out.println("Element at index 6: " + anArray[6]);
	    System.out.println("Element at index 7: " + anArray[7]);
	    System.out.println("Element at index 8: " + anArray[8]);
	    System.out.println("Element at index 9: " + anArray[9] + "\n");
	    
	    //Arithmetic Operators
	    //Integers for the code
	    int a = 15;
	    int b = 25;
	    int c = 30;
	    //Adds a and b
	    System.out.println("a + b = " + (a + b));
	    //Subtracts a and b
	    System.out.println("a - b = " + (a - b));
	    //Multiplies a and b
	    System.out.println("a * b = " + (a * b));
	    //Divides b by a
	    System.out.println("b / a = " + (b / a));
	    //Takes the remainder of b by a
	    System.out.println("b % a = " + (b % a));
	    //Takes the remainder of c by a
	    System.out.println("c % a = " + (c % a) + "\n");
	    
	    //Comparator
	    class Car implements Comparator<Car>, Comparable<Car>{
	    //Name of the car
	    private String name;
	    //Cost of the car
	    private int cost;
	    Car(){
	    }
	    
	    //Creates a car with a name and cost
	    Car(String n, int a){
	    	name = n;
	    	cost = a;
	    	}
	    
	    //Gets the name of a car
	    public String getCarName(){
	    	return name;
	    }
	    
	    //Gets the cost of a car
	    public int getCarCost(){
	    	return cost;
	    }

	    //Overriding the compareTo method
	    //Compares the name of two cars
	    public int compareTo(Car c){
	    	return (this.name).compareTo(c.name);
	    }

	    //Overriding the compare method to sort the cost 
	    public int compare(Car c, Car c1){
	    	return c.cost - c1.cost;
	    	}
	    }
	    
	    //Takes a list of Car objects
	    List<Car> list = new ArrayList<Car>();
	    //Adds new cars to the list
	    list.add(new Car("Tesla Model S",65000));
	    list.add(new Car("Lexus CT 200h",32200));
	    list.add(new Car("Audi A3",29900));
	    list.add(new Car("Acura ILX",27900));
	    list.add(new Car("Volkswagen Jetta",17325));
	    //Sorts the array list
	    Collections.sort(list);

	    for(Car a1: list)
	    	//Printing the sorted list of names
	    	System.out.print(a1.getCarName() + ", ");

	    //Sorts the array list using comparator
	    Collections.sort(list, new Car());
	    System.out.println(" ");
	    for(Car a1: list)
	    	//Printing the sorted list of cars by costs
	    	System.out.print(a1.getCarName() +": $"+ a1.getCarCost() + ", ");
	    System.out.println("Car names and costs" + "\n");
	    
	    //Printing the recursion, a factorial of 6
	    System.out.println(Factorial(6));
	    } 
	//Recursive method
	private static int Factorial(int i) {
	// TODO Auto-generated method stub
	//If the int is 1, 1 is returned or 1 is multiplied by the number(s) after it
	if(i == 1)
	    return 1;
	//If the int is not 1 it is multiplied by the number before it until the number before it is 1
	else{
	    return(i*(Factorial(i-1)));
	}
	}
}
