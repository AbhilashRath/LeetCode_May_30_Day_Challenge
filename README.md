# LeetCode_May_30_Day_Challenge

## 1. First Bad Version
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

**Example**:
Given n = 5, and version = 4 is the first bad version.

call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true

Then 4 is the first bad version. 

**Algorithm**:
Binary Search for the first occurrence of the true by constantly updating left and right pointers.

**Solution Link**: [First Bad Version](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/First_Bad_Version.java)

## 2. Jewels and Stones
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

**Example**:
Input: J = "aA", S = "aAAbbbb"
Output: 3

Input: J = "z", S = "ZZ"
Output: 0

**Algorithm**:
Store all the chars of J in a HashSet and search for each char of S along with incrementing the count.

**Solution Link**: [Jewels and Stones](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/Jewels_and_Stones.java)
