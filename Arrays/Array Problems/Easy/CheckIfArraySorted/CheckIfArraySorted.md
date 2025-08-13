# Check if Array is Sorted

## Problem Statement

Given an array of integers, determine if the array is **sorted in strictly increasing order**.

If it is sorted, return `"sorted"`.  
If it is not sorted, return `"not sorted"`.



### Example 1

**Input:**  
`nums = [1, 2, 3, 4, 5]`  

**Output:**  
`sorted`

### Example 2

**Input:**  
`nums = [2, 102, 4, 5, 12, 1, 23, 98]` 

**Output:**  
`not sorted`

---

## Approach

1. Assume the array is sorted.
2. Traverse the array from the second element to the last.
3. For each element:
   - If the current element is **less than or equal to** the previous element, mark the array as not sorted.
4. After traversal:
   - If the array remained marked as sorted → print `"sorted"`.
   - Else → print `"not sorted"`.




## Time Complexity

- **O(n)** — We traverse the array once.

## Space Complexity

- **O(1)** — Only a constant amount of extra space is used.

---

