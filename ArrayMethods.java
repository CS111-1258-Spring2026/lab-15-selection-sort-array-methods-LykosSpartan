/********************************************
*	AUTHOR:	<name>
* COLLABORATORS: <names>
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED: <date>
********************************************/

/********************************************
*	ArrayMethods
*********************************************
*	PROGRAM DESCRIPTION:
*	Collection of useful methods for int arrays.
*********************************************
*	ALGORITHM:
*	TODO: <Pseudocode for selection sort here>
*********************************************

/* UML CLASS DIAGRAM:
-----------------------------------------
ArrayMethods
-----------------------------------------
-----------------------------------------
+ arrayString(array : int[]) : String //static
+ swap(array : int[], a : int, b : int) : void //static
+ indexOfMin(array : int[], startIndex : int) : int //static
+ reverse(array : int[]) : void //static
+ selectionSort(array : int[]) : void //static
-----------------------------------------
*/

public class ArrayMethods
{
  /**DESCRIPTION: */
  public static String arrayString(int[] a)
  {
     String result = "{ ";
      for (int i = 0; i < a.length; i++) {
        result += a[i];
        if (i < a.length - 1) {
          result += ", ";
        }
      }
      result += " }";
      return result;       
          
//STUB to keep compiler happy
  }
  
  /**DESCRIPTION: */
  public static void swap(int[] array, int a, int b)
  {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;


  }
	
	/**DESCRIPTION: */
  public static int indexOfMin(int[] array, int startIndex)
  {
    
    int minValue = array[startIndex];
    int minIndex = startIndex;
    

    for (int i = startIndex+1 ; i < array.length ; i++ )

    if (minValue > array[i]){
      minValue = array [i];
      minIndex = i;

    }
    
    return minIndex; //STUB to keep compiler happy
  }

	/**DESCRIPTION: */
  public static void reverse(int[] array)
  { 
    int temp;
    for (int i = 0; i < array.length / 2; i++) {
      temp = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = temp;
    }

  }

	/**DESCRIPTION: */
  public static void selectionSort(int[] array)
  { 
    for (int i = 0; i < array.length - 1; i++) {
      int minIndex = indexOfMin(array, i);
      swap(array, i, minIndex);
    }

  }

}