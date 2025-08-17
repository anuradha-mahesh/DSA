## Problem Statement
Given an array of size n, rotate the array elements to the left by 1 place.

## Example:

Input:  [1, 2, 3, 4, 5]
Output: [2, 3, 4, 5, 1]

## Approach 1: Brute Force (Using Extra Array)

function leftRotateBy1(arr, n):
    create temp[n]

    for i = 1 to n-1:
        temp[i-1] = arr[i]

    temp[n-1] = arr[0]

    return temp

## Time Complexity

O(n) → traverses the array once

## Space Complexity

O(n) → requires an extra temporary array

## Approach 2: Optimal (In-place Rotation)

function leftRotateBy1(arr, n):
    temp = arr[0]

    for i = 0 to n-2:
        arr[i] = arr[i+1]

    arr[n-1] = temp

    return arr

## Time Complexity

O(n) → single traversal of the array

## Space Complexity

O(1) → no extra array required