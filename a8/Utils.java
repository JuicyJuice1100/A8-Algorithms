/* Utils.java - A few utility methods
*
*  @version CS 321 - Fall 2018 - A8
*
*  You may NOT modify this class
*
*/

class Utils {

  /* create and return an array containing the elements
   * 0, 1, 2, ... , length - 1 in this order.
   */
  static int[] createSortedArray(int length) {
    int[] a = new int[length];
    for(int i=0; i<length; i++) {
      a[i] = i;
    }
    return a;
  }// createSortedArray method

  /* create and return an array containing the elements
   * length - 1, length - 2, ... , 2, 1, 0 in this order.
   */
  static int[] createReverseSortedArray(int length) {
    int[] a = new int[length];
    for(int i=0; i<length; i++) {
      a[i] = length - i - 1;
    }
    return a;
  }// createReverseSortedArray method

  /* create and return an array containing 'length' copies of the integer 1
   */
  static int[] createEqualElementsArray(int length) {
    int[] a = new int[length];
    for(int i=0; i<length; i++) {
      a[i] = 1;
    }
    return a;
  }// createEqualElementsArray method

  /* return true iff the input array is sorted in non-decreasing order
   */
  static boolean isSorted(int[] a) {
    for(int i=0; i<a.length-1; i++) {
      if (a[i]>a[i+1]) { return false; }
    }
    return true;
  }// isSorted method

  /* send given array to console in one line
   */
  static void printArray(int[] a) {
    for(int i=0; i<a.length; i++) {
      System.out.format("%d ",a[i]);
    }
    System.out.println();
  }// printArray method

}// Utils class
