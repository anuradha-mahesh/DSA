 ## Problem Statement
Given an array of integers, find and return the second largest distinct element in the array.
If no second largest exists (all elements equal or array size < 2), handle appropriately.

## Example 1:

Input: nums = [2, 102, 4, 5, 12, 1, 23, 98]
Output: 98

## Example 2:

Input: nums = [10, 10, 10]
Output: No second largest element

## Approach
Assume the first element is the largest and set secondLargest to the smallest possible integer (Integer.MIN_VALUE).

Traverse the array from left to right:

If the current element is greater than largest:

   Update secondLargest to largest.

   Update largest to the current element.

Else if the current element is less than largest but greater than secondLargest:

    Update secondLargest to the current element.

After traversal, secondLargest holds the answer.


## Time Complexity
O(n) — We traverse the array once.

## Space Complexity
O(1) — We use only a constant amount of extra space.