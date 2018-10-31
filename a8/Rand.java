/* Rand.java - Randomization code
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

class Rand {

  static Random rnd = new Random();  // pseudorandom number generator which
                                     // MUST be used in both methods below

  /* Shuffle the given array using the Fisher-Yates algorithm.
   * First, set the seed of rnd above to the given value.
   * Then, implement the following pseudocode from:
   *      https://en.wikipedia.org/wiki/
   *                   Fisher%E2%80%93Yates_shuffle#The_modern_algorithm
   *
   *     // shuffle an array a of n elements with indices in [0..(n-1)]
   *     for i from n−1 downto 1 do
   *         j <--  random integer in [0..i]  // MUST use rnd.nextInt method
   *         swap a[j] and a[i]               // Must use Rand.swap method below
   *
   * Since we are all using the same algorithm with the same pseudorandom
   * number generator, multiple calls to this method with a given array and
   * seed value will always shuffle the input array in exactly the same way
   * each time. For example, with inputs:
   *           a = [0,1,2,3,4,5,6,7,8,9] and seed = 10
   * the shuffled array will be:
   *           a = [9,7,8,0,1,4,5,2,6,3]
   */
  static void fisherYates(int[] a, int seed) {
    rnd.setSeed(seed);
    for(int i = a.length - 1; i > 0; i--){
      int j = rnd.nextInt(i + 1);
      swap(a, i, j);
    }

  }// fisherYates method

  /* Shuffle a portion of the given array using a modified version of
   * Fisher-Yates in which only n swaps are performed.
   * This method must:
   *  1. create an array called 'doSwap' whose length is equal to that of a and
   *     that contains n copies of the value 1 followed by (a.length - n) copies
   *     of the value 2.
   *  2. If n is less than a.length-1:
   *        2a. Randomly shuffle the doSwap array using plain Fisher-Yates and
   *            the given seed.
   *        2b. If doSwap[0] is equal to 1:
   *               exchange doSwap[0] with doSwap[i] where i is the index of the
   *               leftmost 2 in doSwap.
   *     else
   *        set the rnd seed to the value given as second parameter
   *  3. Perform a modified version of Fisher-Yates on the input array a in
   *     which the swap of element a[j] (with some earlier a[i]) only happens
   *     if the value of doSwap[j] is equal to 1. Here is the pseudocode for
   *     the variant of Fisher-Yates that this method must implement:
   *
   *     for i from n−1 downto 1 do
   *         if (doSwap[i] == 1)
   *             j <-- random integer in [0..i] // MUST use rnd.nextInt() method
   *             swap a[j] and a[i]             // MUST use swap method below
   *
   *     The pseudocode above must be implemented as part of this method (you
   *     may NOT implement/call a new helper method for this step). The seed
   *     for rnd may NOT be modified by this step.
   *
   * If the given n is equal to a.length - 1, then this method is functionally
   *    identical to (though slower than) the fisherYates method above.
   * If the given n is equal to 0, then this method does not modify
   *    the given array.
   * If the given n is equal to any value in [1..(a.length-2)], then this
   *    method runs Fisher-Yates but only performs n swaps; the location of the
   *    swapped elements is determined by running the plain fisherYates code.
   *
   *   Sample outputs that your implementation MUST match:
   *     input:  a=[0,1,2,3,4,5,6,7,8,9]  seed = 10  n = 0
   *             modified a=[0,1,2,3,4,5,6,7,8,9]
   *     input:  a=[0,1,2,3,4,5,6,7,8,9]  seed = 10  n = 1
   *             modified a=[0,3,2,1,4,5,6,7,8,9]
   *     input:  a=[0,1,2,3,4,5,6,7,8,9]  seed = 1   n = 2
   *             modified a=[0,8,2,3,4,6,5,7,1,9]
   *     input:  a=[0,1,2,3,4,5,6,7,8,9]  seed = 0   n = 3
   *             modified a=[0,1,6,3,9,5,7,2,8,4]
   *     input:  a=[0,1,2,3,4,5,6,7,8,9]  seed = 10  n = 10
   *             modified a=[9,7,8,0,1,4,5,2,6,3]
   */
  static void shuffleArray(int[] a, int seed, int n) {

    int[] doSwap = new int[a.length];
    int locationOfTwo = a.length - n -1;

    //insert n 1s into the array
    for(int i = 0; i < n; n++){
      doSwap[i] = 1;
    }

    //fill the rest with 2s
    for(int j = locationOfTwo; j < a.length; j++){
      doSwap[j] = 2;
    }

    if(n < a.length-1){
      fisherYates(a, seed);
      if (doSwap[0] == 1){
        swap(a, 0, locationOfTwo);
        locationOfTwo++;
      }
    } else {
      rnd.setSeed(seed);
    }

    for(int z = n-1; z > n-1; z--){
      if(doSwap[z] == 1){
        int k = rnd.nextInt(z + 1);
        swap(a, z, k);
      }
    }

  }// shuffleArray method

  /* swap the array elements a[i] and a[j]
   * Do NOT modify this method
   */
  static void swap(int[] a, int i, int j) {
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }// swap method

}// Rand class
