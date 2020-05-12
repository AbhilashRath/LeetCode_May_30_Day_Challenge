# LeetCode May 30 Day Challenge

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

**Topic**: Binary Search

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

**Topic**: HashSets,HashTables

**Algorithm**:
Store all the chars of J in a HashSet and search for each char of S along with incrementing the count.

**Solution Link**: [Jewels and Stones](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/Jewels_and_Stones.java)

## 3. Ransom Note
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

**Note**:
You may assume that both strings contain only lowercase letters.

**Example**:
canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true

**Topic**: HashMaps

**Algorithm**:
Store all chars of magazine string in a hashmap mapping it to its number of occurrences. Loop through each character of ransomNote string and check if its present in magazine string, if not present return false or if all of its occurrences are previously exhausted then return false. If whole loop is executed successfully then return true.

**Solution Link**: [Ransom Note](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/Ransom_Note.java)

## 4. Number Complement
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

**Note**:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.

**Example**:
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.

Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.

**Topic**: Bit Manipulation

**Algorithm**:
Convert the Integer to binary representation. and replace zeroes with ones and convert the binary representation to corresponding integer.

**Solution Link**: [Number Complement](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/Number_Complement.java)

## 5. First Unique Character In String
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
**Note**:
You may assume the string contain only lowercase letters.

**Example**:
s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

**Topic**: Strings, HashMaps

**Algorithm**:
Map all the characters of the string with occurrence. Loop through all the character and return the index of first character whose occurrence is 1.

**Solution Link**: [First Unique Character in String](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/First_Unique_Character_in_String.java)

## 6. Majority Element
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.

**Example**:
Input: [3,2,3]
Output: 3

Input: [2,2,1,1,1,2,2]
Output: 2

**Topic**: Arrays, Greedy

**Algorithm**:
Sort the array and n/2th element is the answer.

**Solution Link**: [Majority Element](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/Majority_Element.java)

## 7. Cousins in Binary Tree
In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
Return true if and only if the nodes corresponding to the values x and y are cousins.

**Example**:
Input: root = [1,2,3,4], x = 4, y = 3 
Output: false

Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
Output: true

Input: root = [1,2,3,null,4], x = 2, y = 3
Output: false

**Topic**: Trees,BFS

**Algorithm**:
Breadth first search and do the required operations.

**Solution Link**: [Cousins in Binary Tree](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/Cousins_in_Binary_Tree.java)

## 8. Check If It Is a Straight Line
You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

**Example**:
Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true

Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
Output: false

**Topic**: Mathematics

**Algorithm**:
Basic coordinate geometry question. Check if each coordinate fits in the equation of straight line formed from any two points.

**Solution Link**: [Check If It Is a Straight Line](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/Check_If_It_Is_a_Straight_Line.java)

## 9. Valid Perfect Square
Given a positive integer num, write a function which returns True if num is a perfect square else False.

**Note** : Do not use any built-in library function such as sqrt.

**Example**:
Input: 16
Output: true

Input: 14
Output: false

**Topic**: Binary Search

**Algorithm**:
Binary Search for the square root between 1 and Integer.MAX_VALUE

**Solution Link**: [Valid Perfect Square](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/Valid_Perfect_Square.java)

## 10. Find the Town Judge
In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

1.The town judge trusts nobody.
2.Everybody (except for the town judge) trusts the town judge.
3.There is exactly one person that satisfies properties 1 and 2.

You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.

If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.

**Example**:
Input: N = 2, trust = [[1,2]]
Output: 2

Input: N = 3, trust = [[1,3],[2,3]]
Output: 3

Input: N = 3, trust = [[1,3],[2,3],[3,1]]
Output: -1

Input: N = 3, trust = [[1,2],[2,3]]
Output: -1

Input: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
Output: 3

**Algorithm**
Store the count of trustees in a hasmap. The person with N-1 trustees is a potential judge. Now check if the potential judge knows anyone by binary searching, then return -1. Else return potential judge.

**Solution Link**: [Find the Town Judge](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/Find_the_Town_Judge.java)

## 11. Flood Fill
An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).

Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.

To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.

At the end, return the modified image.

**Example**:
Input: 
image = [[1,1,1],[1,1,0],[1,0,1]]
sr = 1, sc = 1, newColor = 2

Output: [[2,2,2],[2,2,0],[2,0,1]]

Explanation: 
From the center of the image (with position (sr, sc) = (1, 1)), all pixels connected 
by a path of the same color as the starting pixel are colored with the new color.
Note the bottom corner is not colored 2, because it is not 4-directionally connected
to the starting pixel.

**Algorithm**
Perform BFS starting from sr and sc and update the value of previous color with new color.

**Solution Link**: [Flood Fill](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/Flood_Fill.java)
