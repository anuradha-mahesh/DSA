# Largest Element in an Array

## Problem Statement

Given an array of integers, find and return the largest element in the array.

Example 1:
Input: nums = [1, 5, 3, 9, 2]
Output: 9

Example 2:
Input: nums = [-10, -3, -50, -2]
Output: -2

## Approach

1. Assume the first element of the array is the maximum.
2. Traverse the array from left to right.
3. For each element, compare it with the current maximum:
   - If the element is greater than the current maximum, update the maximum.
4. After traversing the entire array, return the maximum value.

## Pseudocode

max = nums[0]
for i from 0 to nums.length-1:
if nums[i] > max:
max = nums[i]
return max

## Time Complexity

- O(n) — We traverse the array once.

## Space Complexity

- O(1)\*— We use only a constant amount of extra space.
