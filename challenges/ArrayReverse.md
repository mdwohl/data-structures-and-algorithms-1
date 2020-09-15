# Reverse an Array

Creating a method that reverses an array.

## Challenge

Needs to be able to take an input of an integer array of any length then swap value positions front to back.

## Approach & Efficiency

I used a for loop to iterate over half the input array length. And a temporary int variable to store the value of each successive element. For each element in the first half, after storing its value in the temp variable, I overwrite the first half element with its mirrored positional element in the last half of the array. Then I overwrite the last half element with the temp stored value. Essentially this just swaps the first and last value, then the second and second to last values, and so on.
The time complexity is O(n) because the amount of operations to perform increases linearly with the length of the array.
The space complexity is O(1) because it takes constant space no matter the length of the input.

## Solution
<!-- Embedded whiteboard image -->
Did not whiteboard for this first challenge.

