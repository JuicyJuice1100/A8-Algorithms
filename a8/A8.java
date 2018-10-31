/* A8.java - Driver code for this assignment
 *
 *  @version CS 321 - Fall 2018 - A8
 *
 *  @author 1st STUDENT'S FULL NAME GOES HERE
 *
 *  @author 2nd STUDENT'S FULL NAME GOES HERE
 *
 *  @author 3rd STUDENT'S FULL NAME GOES HERE (DELETE THIS LINE IF NOT NEEDED)
 *
 */

import java.util.Random;
import java.util.Arrays;

class A8 {

  static final int MIN_N = (int) Math.pow(2,10);  /* minimum array size */
  static final int MAX_N = (int) Math.pow(2,30);  /* maximum array size */

  /* Perform the three experiments for part 3; the first argument must be used
   * in the call to Rand.shuffleArray() and the second argument must be used
   * to select the algorithm to test.
   *
   * For part 3, each experiment must run the selected algorithm once for all
   * input sizes ranging from MIN_N to MAX_N. For each run, your code must
   * output the size of the input array and the running time in seconds, in
   * a format that makes it easy to paste the output into Excel. Ideally,
   * we would perform several runs for each input size and average the running
   * time. However, to save you time, we'll limit ourselves to one run per size.
   *
   * For each run:
   *  1. Create an array of the given size (with Utils.createSortedArray).
   *  2. Shuffle the array fully (to create a random input).
   *  3. Run the selected algorithm on this input.
   *  4. Send the output to the console (not to a file).
   *  5. Double the array size (in preparation for the next run).
   *
   * Each experiment will stop when the JVM runs out of memory (but do use the
   * command-line arguments described in the main method below in order to
   * override the small default values used by the JVM) or when one single run
   * (for a given input size) takes more than 5 minutes.
   *
   */
  static void part3(int seed, int algo_num) {
    System.out.printf("%-10s | %-10s\n", "Size", "Time");
    for(int i = MIN_N; i <= MAX_N; i *= 2){
      int[] a = Utils.createSortedArray(i);
      double time;
      Rand.shuffleArray(a, seed, Rand.rnd.nextInt(i));
      switch(algo_num){
        case 1:
          time = Sort.algo1(a);
          break;
        case 2:
          time = Sort.algo2(a);
          break;
        default:
          time = Sort.algo3(a);
          break;
      }
      System.out.printf("%-10d | %.4e\n", i, time);
      //TODO: send output to console #4
    }
  }// part3 method

  /* Perform the three experiments for part 4; the argument must be used
   * to select the algorithm to test.
   *
   * For part 4, each experiment must run the selected algorithm once for all
   * input sizes ranging from MIN_N to MAX_N. For each run, your code must
   * output the size of the input array and the running time in seconds, in
   * a format that makes it easy to paste the output into Excel. Ideally,
   * we would perform several runs for each input size and average the running
   * time. However, to save you time, we'll limit ourselves to one run per size.
   *
   * For each run:
   *  1. Create an array of the given size (with Utils.createSortedArray).
   *  2. Run the selected algorithm on this input.
   *  3. Send the output to the console (not to a file).
   *  4. Double the array size (in preparation for the next run).
   *
   * Each experiment will stop when the JVM runs out of memory (but do use the
   * command-line arguments described in the main method below in order to
   * override the small default values used by the JVM) or when one single run
   * (for a given input size) takes more than 5 minutes.
   *
   */
  static void part4(int algo_num) {

    System.out.printf("%-10s | %-10s\n", "Size", "Time");
    for(int i = MIN_N; i <= MAX_N; i *= 2){
      int[] a = Utils.createSortedArray(i);
      double time;
      switch(algo_num){
        case 1:
          time = Sort.algo1(a);
          break;
        case 2:
          time = Sort.algo2(a);
          break;
        default:
          time = Sort.algo3(a);
          break;
      }
      System.out.printf("%-10d | %.4e\n", i, time);
    }
  }// part4 method

  /* Perform the three experiments for part 5; the argument must be used
   * to select the algorithm to test.
   *
   * For part 5, each experiment must run the selected algorithm once for all
   * input sizes ranging from MIN_N to MAX_N. For each run, your code must
   * output the size of the input array and the running time in seconds, in
   * a format that makes it easy to paste the output into Excel. Ideally,
   * we would perform several runs for each input size and average the running
   * time. However, to save you time, we'll limit ourselves to one run per size.
   *
   * For each run:
   *  1. Create an array of the given size (with Utils.createReverseSortedArray).
   *  2. Run the selected algorithm on this input.
   *  3. Send the output to the console (not to a file).
   *  4. Double the array size (in preparation for the next run).
   *
   * Each experiment will stop when the JVM runs out of memory (but do use the
   * command-line arguments described in the main method below in order to
   * override the small default values used by the JVM) or when one single run
   * (for a given input size) takes more than 5 minutes.
   *
   */
  static void part5(int algo_num) {

    /* To be completed */

  }// part5 method

  /* Perform the three experiments for part 6; the argument must be used
   * to select the algorithm to test.
   *
   * For part 6, each experiment must run the selected algorithm once for all
   * input sizes ranging from MIN_N to MAX_N. For each run, your code must
   * output the size of the input array and the running time in seconds, in
   * a format that makes it easy to paste the output into Excel. Ideally,
   * we would perform several runs for each input size and average the running
   * time. However, to save you time, we'll limit ourselves to one run per size.
   *
   * For each run:
   *  1. Create an array of the given size (w/ Utils.createEqualElementsArray).
   *  2. Run the selected algorithm on this input.
   *  3. Send the output to the console (not to a file).
   *  4. Double the array size (in preparation for the next run).
   *
   * Each experiment will stop when the JVM runs out of memory (but do use the
   * command-line arguments described in the main method below in order to
   * override the small default values used by the JVM) or when one single run
   * (for a given input size) takes more than 5 minutes.
   *
   */
  static void part6(int algo_num) {

    /* To be completed */

  }// part6 method

  /* Perform the three experiments for part 7; the first argument must be used
   * in each call Rand.shuffleArray(); the second argument must be used
   * to select the algorithm to test.
   *
   * For part 7, each experiment must run the selected algorithm once for all
   * values of n ranging from 0 to 5000. For each run, your code must
   * run on a sorted array of size 2^20 with increasing amount of randomness.
   * You must output the value of n and the running time in seconds, in
   * a format that makes it easy to paste the output into Excel. Ideally,
   * we would perform several runs for each input size and average the running
   * time. However, to save you time, we'll limit ourselves to one run per size.
   *
   * For each run:
   *  1. Create an array of size 2^20 (with Utils.createSortedArray).
   *  2. Shuffle the array using the current value of n.
   *  3. Run the selected algorithm on THIS input.
   *  4. Send the output to the console (not to a file).
   *  5. Increment the value of n by 100 (in preparation for the next run).
   *
   * Each experiment will run to completion.
   *
   */
  static void part7(int seed, int algo_num) {

    /* To be completed */

  }// part7 method

  /*********************************/
  /* There is no coding for part 7 */
  /*********************************/

  /* Create and return the shortest possible array of integers that causes
   * Arrays.sort(int[]) to (partly) execute a one-pivot quicksort algorithm.
   */
   static int[] part9() {
     int[] a = null;

     /* To be completed */

     return a;
   }// part9 method

  /* Do not modify this method
   */
  public static void main(String[] args) {

    /* usage:  java -Xms2000m -Xss2000m A8 <experiment_identifier>
       Note: the two -X command-line options are there to specify the amount
             of memory that the JVM should allocate to the heap and stack
    */

    if (args[0].equals("p3a1")) { part3(0,1); }
    if (args[0].equals("p3a2")) { part3(0,2); }
    if (args[0].equals("p3a3")) { part3(0,3); }

    if (args[0].equals("p4a1")) { part4(1); }
    if (args[0].equals("p4a2")) { part4(2); }
    if (args[0].equals("p4a3")) { part4(3); }

    if (args[0].equals("p5a1")) { part5(1); }
    if (args[0].equals("p5a2")) { part5(2); }
    if (args[0].equals("p5a3")) { part5(3); }

    if (args[0].equals("p6a1")) { part6(1); }
    if (args[0].equals("p6a2")) { part6(2); }
    if (args[0].equals("p6a3")) { part6(3); }

    if (args[0].equals("p7a1")) { part7(0,1); }
    if (args[0].equals("p7a2")) { part7(0,2); }
    if (args[0].equals("p7a3")) { part7(0,3); }

    if (args[0].equals("p9"))   { part9(); }

  }// main method

}// A8 class
