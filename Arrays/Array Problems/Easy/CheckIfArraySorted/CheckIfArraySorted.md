# Check if Array is Sorted

## Problem Statement
Given an array of integers, determine if the array is **sorted in strictly increasing order**.  

If it is sorted, return `"sorted"`.  
If it is not sorted, return `"not sorted"`.  

---

## Example 1
**Input:**  
`nums = [1, 2, 3, 4, 5]`  

**Output:**  
`sorted`  

---

## Example 2
**Input:**  
`nums = [2, 102, 4, 5, 12, 1, 23, 98]`  

**Output:**  
`not sorted`  

---

## Approaches  

### 🔹 1. Brute Force Approach
- For every element `arr[i]`, compare it with **all elements after it** (`arr[j]` where `j > i`).  
- If any later element is **smaller or equal** to the current one, then the array is **not sorted**.  
- If no such case is found after all comparisons, the array is sorted.  

#### Pseudocode:
```
FOR i from 0 to n-1:
FOR j from i+1 to n-1:
IF arr[j] <= arr[i]:
RETURN "not sorted"
RETURN "sorted"
```


#### Complexity:
- **Time Complexity:** O(n²) → nested loops check every pair.  
- **Space Complexity:** O(1) → only loop variables.  

---

### 🔹 2. Optimized Approach (Single Traversal)
- Traverse the array from index 1 to n-1.  
- At each step, compare `arr[i]` with `arr[i-1]`.  
  - If `arr[i] <= arr[i-1]`, array is not sorted.  
- If no violation is found, array is sorted.  

#### Pseudocode:
```
FOR i from 1 to n-1:
IF arr[i] <= arr[i-1]:
RETURN "not sorted"
RETURN "sorted"
```

#### Complexity:
- **Time Complexity:** O(n) → only one pass.  
- **Space Complexity:** O(1) → constant extra space. 