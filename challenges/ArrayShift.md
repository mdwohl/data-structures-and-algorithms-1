# Array Shift

Creating a method that adds an element to the middle of an array.

## Challenge

Given an input integer array and a lone integer, add the lone integer into the middle of a matching integer array. The new array will need to be one element longer than the input array and have the second half of its values offset to account for the element being added in the middle.

## Approach & Efficiency

I started by saving the integer representing the middle index of the output array. Then I declare the new integer array that has one extra position available compared to the input array. And one more integer variable is set at 0 to be used as a secondary index counter.

Iterating over the new array, each position is assigned the value of the input array. When the for loop hits the middle index, it instead assigns the input integer in that position. Then the loop finishes by assigning the rest of the input array's values to the remainder of the new array and returns the new array.

The time complexity is O(n) because the amount of operations to perform increases linearly with the length of the input array.

The space complexity is also O(n) because the output array grows linearly with the input array.

## Solution

<img src="src/main/resources/whiteboard-ch-02.PNG">

