Problem: Given a sorted integer array, remove duplicates in-place so that each unique element appears only once. Return the number of unique elements (k) and ensure the first k elements of the array contain those unique elements.


## Method 1: Brute Force (Using Set/Extra Space)


Store all unique elements in a Set (or ArrayList).

Copy them back to the original array.

Return the count of unique elements.

## Pseudocode
function removeDuplicatesBrute(nums):
    set = empty LinkedHashSet   // keeps order
    for each num in nums:
        add num to set

    i = 0
    for each element in set:
        nums[i] = element
        i++

    return size of set

## Complexity

Time Complexity: O(N)
(O(N) to traverse + O(1) for each insertion in Set)

Space Complexity: O(N)
(Set stores unique elements separately)


## Method 2: Optimal (Two-Pointer Approach)
Idea

Use two pointers (i and j):

i = slow pointer → tracks the last unique element’s position.

j = fast pointer → scans the array.

Whenever a new unique element is found (nums[j] != nums[i]), move i forward and replace nums[i] with nums[j].

Finally, i+1 = number of unique elements.

## Pseudocode
function removeDuplicates(nums):
    if nums.length == 0:
        return 0

    i = 0
    for j = 1 to nums.length-1:
        if nums[i] != nums[j]:
            i++
            nums[i] = nums[j]

    return i+1

## Complexity

Time Complexity: O(N)
(Each element is traversed once)

Space Complexity: O(1)
(In-place, no extra storage used)