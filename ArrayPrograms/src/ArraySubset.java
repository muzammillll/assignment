
public class ArraySubset {

	
		   public static void main(String args[]) {
		      int array1[] = { 33, 51, 5, 31, 9, 4, 3 };
		      int array2[] = { 51, 9, 33, 3 };
		      int x = array1.length;
		      int y = array2.length;subset(array1, array2, x, y);
		      if (subset(array1, array2, x, y)) {
		         System.out.print("array 2 is a subset of array 1");
		      } else {
		         System.out.print("array 2 is not a subset of array 1");
		      }
		   }

		   //user defined method to check if array 2 is present in array 1
		   static boolean subset(int array1[], int array2[], int x, int y) {
		      int i, j = 0;
		      for (i = 0; i < y; i++) {
		         for (j = 0; j < x; j++)
		            if (array2[i] == array1[j])
		               break;
		         /* return false when arr2[i] is not present in arr1[] */
		         if (j == x)
		            return false;
		      }
		      /* return true when all elements of arr2[] are present in arr1[] */
		      return true;
		   }
		}

