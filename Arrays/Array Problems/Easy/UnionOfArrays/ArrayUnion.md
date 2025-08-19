# Union of Two Sorted Arrays

We want to find the **Union** of two sorted arrays (all unique elements present in either of the arrays).

---

## 🔹 Approach 1: Naive Method (Brute)

### Idea

- Create a result list.
- For each element in **arr1** and **arr2**, insert it into result **if not already present**.
- To check presence, we can do a linear search in the result list.

### Pseudocode

```
function findUnion(arr1, arr2, n, m):
    union = []

    for i in 0 to n-1:
        if arr1[i] not in union:
            add arr1[i] to union

    for j in 0 to m-1:
        if arr2[j] not in union:
            add arr2[j] to union

    sort(union)   // to keep result sorted
    return union
```

### Time Complexity

- O((n + m) \* (n + m)) → because every "not in" check takes O(size of union)

### Space Complexity

- O(n + m)

**This is the most Brute method.**

---

## 🔹 Approach 2: Using TreeSet (Brute but Better)

### Idea

- Use a **TreeSet** to store all elements.
- TreeSet automatically removes duplicates and keeps them sorted.

### Pseudocode

```
function findUnion(arr1, arr2, n, m):
    set = TreeSet()

    for i in 0 to n-1:
        set.add(arr1[i])

    for j in 0 to m-1:
        set.add(arr2[j])

    union = list(set)
    return union
```

### Time Complexity

- O((n + m) \* log(n + m)) (insertion into TreeSet takes logN)

### Space Complexity

- O(n + m)

**This is Brute (but more efficient than naive).**

---

## 🔹 Approach 3: Two-Pointer Method (Optimal)

### Idea

- Since arrays are already **sorted**, use two pointers (i, j).
- Compare arr1[i] and arr2[j]:
  - If arr1[i] < arr2[j], add arr1[i] and move i++.
  - If arr2[j] < arr1[i], add arr2[j] and move j++.
  - If equal, add once and move both.
- Copy remaining elements from whichever array is left.

### Pseudocode

```
function findUnion(arr1, arr2, n, m):
    i = 0, j = 0
    union = []

    while i < n and j < m:
        if arr1[i] < arr2[j]:
            if union is empty OR last element != arr1[i]:
                add arr1[i] to union
            i++
        else if arr2[j] < arr1[i]:
            if union is empty OR last element != arr2[j]:
                add arr2[j] to union
            j++
        else:
            if union is empty OR last element != arr1[i]:
                add arr1[i] to union
            i++, j++

    while i < n:
        if union is empty OR last element != arr1[i]:
            add arr1[i]
        i++

    while j < m:
        if union is empty OR last element != arr2[j]:
            add arr2[j]
        j++

    return union

```

### Time Complexity

- O(n + m)

### Space Complexity

- O(n + m)

**This is the Optimal solution.**

---

## 🔑 Final Summary

- **Naive Method** → O((n + m)^2) → Brute (slowest)
- **TreeSet Method** → O((n + m) log(n + m)) → Brute (better)
- **Two-Pointer Method** → O(n + m) → ✅ Optimal
