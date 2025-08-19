## Move Zeros in Array
Problem Statement

Given an array of integers, move all zeros to the end while maintaining the relative order of non-zero elements. Do this in-place if possible.

## 1. Brute Force Approach

This approach uses an extra array to store non-zero elements and then fills the remaining positions with zeros.

## Pseudocode:
```
function moveZerosBrute(arr):
    initialize temp array of same size
    initialize index = 0


    for each element in arr:
        if element != 0:
            temp[index] = element
            index += 1


    while index < length of arr:
        temp[index] = 0
        index += 1


    return temp
```
## Time Complexity: O(n)
## Space Complexity: O(n)

2. Optimal Approach (Overwrite / Two-Pointer)

This approach moves all non-zero elements to the front in-place and fills the rest with zeros.

## Pseudocode:
```
function moveZerosOptimal(arr):
    initialize write = 0
    for each element in arr:
        if element != 0:
            arr[write] = element
            write += 1
    for i from write to length of arr - 1:
        arr[i] = 0
    return arr
```

## Time Complexity: O(n)
## Space Complexity: O(1)