/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


/**
 * Code for end-of-chapter exercises on asymptotics.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
class Exercises {

  /** Returns the sum of the integers in given array. */
  //This has a time complexity of O(n)
  // the loop runs n-1 times as it does not run if j = n
  //the others are primitive operations that run in constant time
  public static int example1(int[] arr) {
    int n = arr.length, total = 0; // primitive operations, 2 total as we count declaration and initializiation in one line as one primitive operation
    for (int j=0; j < n; j++)  // n - 1, its n - 1 because our index starts at 0
      total += arr[j]; // n
    return total; // 1
  }


  /** Returns the sum of the integers with even index in given array. */
  //this has a time complexity of O(n)
  // it is the same as the above algorithm but this time it is looking through half of the n array
  // this can be written as n/2 but we only are focused on n and not the constants so we ignore 2
  //this has something to do with polynomial division
  // that is why it is O(n)
  public static int example2(int[] arr) {
    int n = arr.length, total = 0; // primitive operations -> constant -> 2
    for (int j=0; j < n; j += 2)  // n / 2
      total += arr[j]; // n / 2
    return total; // 1
  }

  /** Returns the sum of the prefix sums of given array. */
  //this has a time complexity of O(n^2)
  //the outer loop runs n times
  // the inner loop runs n+1 times
  public static int example3(int[] arr) {
    int n = arr.length, total = 0;
    for (int j=0; j < n; j++)   // n + 1
      for (int k=0; k <= j; k++)    // n (n + 1)
        total += arr[j];
    return total;
  }

  /** Returns the sum of the prefix sums of given array. */
  //this has a time complexity of O(n)
  //contains primitive operations such as adding, and a loop which has a unit time of n -1
  public static int example4(int[] arr) {
    int n = arr.length, prefix = 0, total = 0;
    for (int j=0; j < n; j++) {     // loop from 0 to n-1
      prefix += arr[j];
      total += prefix;
    }
    return total;
  }

  /** Returns the number of times second array stores sum of prefix sums from first. */

  //this has a time complexity of O(n^3)
  // this contains a total of three for loops, 2 which are nested
  public static int example5(int[] first, int[] second) { // assume equal-length arrays
    int n = first.length, count = 0;
    for (int i=0; i < n; i++) {     // loop from 0 to n-1
      int total = 0;
      for (int j=0; j < n; j++)     // loop from 0 to n-1
        for (int k=0; k <= j; k++)  // loop from 0 to j  -> n(n+1)/2
          total += first[k];
      if (second[i] == total) count++;
    }
    return count;
  }

}
