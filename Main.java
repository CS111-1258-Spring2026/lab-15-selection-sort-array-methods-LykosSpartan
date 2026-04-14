/********************************************
*	AUTHOR:	<name>
* COLLABORATORS: <names>
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED:	<date>
********************************************/

public class Main 
{
 public static void main(String[] args)
{ 
  int[] numbers = {42, 16, 84, 12, 77, 26, 53};
  
  // Test each method
  System.out.println("Original: " + ArrayMethods.arrayString(numbers));
  
  ArrayMethods.selectionSort(numbers);
  System.out.println("Sorted: " + ArrayMethods.arrayString(numbers));
  
  ArrayMethods.reverse(numbers);
  System.out.println("Reversed: " + ArrayMethods.arrayString(numbers));
}
  }
