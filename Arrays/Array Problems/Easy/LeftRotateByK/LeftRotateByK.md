## Problem Statement

Given an array of size n and an integer k, rotate the array to the left by k positions.

Example:
Input: arr = [1, 2, 3, 4, 5], k = 2
Output: [3, 4, 5, 1, 2]

## Approach 1: Brute Force (Using Extra Array)

## Pseudocode

function leftRotateBrute(arr, n, k):
    k = k % n                       // handle if k > n
    temp = new array of size k

    // Step 1: Copy first k elements into temp
    for i = 0 to k-1:
        temp[i] = arr[i]

    // Step 2: Shift remaining elements left by k
    for i = 0 to n-k-1:
        arr[i] = arr[i+k]

    // Step 3: Place temp elements at the end
    for i = 0 to k-1:
        arr[n-k+i] = temp[i]

    return arr

## Complexity

Time: O(n) → each element is shifted once.

Space: O(k) → extra array used.

## Approach 2: Optimal (Reversal Algorithm)


We can rotate in-place using 3 reversals:

Reverse the first k elements.

Reverse the remaining n-k elements.

Reverse the whole array.

## Pseudocode
function reverse(arr, start, end):
    while start < end:
        swap(arr[start], arr[end])
        start += 1
        end -= 1

function leftRotateOptimal(arr, n, k):
    k = k % n                       // handle if k > n

    // Step 1: Reverse first k elements
    reverse(arr, 0, k-1)

    // Step 2: Reverse remaining n-k elements
    reverse(arr, k, n-1)

    // Step 3: Reverse the entire array
    reverse(arr, 0, n-1)

    return arr

## Complexity

Time: O(n) → total of 3 reversals.

Space: O(1) → in-place.