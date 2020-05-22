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

## 12. Remove K Digits
Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.

**Note**: The length of num is less than 10002 and will be ≥ k. The given num does not contain any leading zero.

**Example**:
Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.

Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.

Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.

**Algorithm**
Greediest Approach is selecting the next smallest integer as much permissible by value of k using stack.

**Solution Link**: [Remove K Digits](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/Remove_K_Digits.java)

## 13. Maximum Sum Circular Subarray
Given a circular array C of integers represented by A, find the maximum possible sum of a non-empty subarray of C.

Here, a circular array means the end of the array connects to the beginning of the array.  (Formally, C[i] = A[i] when 0 <= i < A.length, and C[i+A.length] = C[i] when i >= 0.)

Also, a subarray may only include each element of the fixed buffer A at most once.  (Formally, for a subarray C[i], C[i+1], ..., C[j], there does not exist i <= k1, k2 <= j with k1 % A.length = k2 % A.length.)

**Example**:
Input: [1,-2,3,-2]
Output: 3
Explanation: Subarray [3] has maximum sum 3

Input: [5,-3,5]
Output: 10
Explanation: Subarray [5,5] has maximum sum 5 + 5 = 10

Input: [3,-1,2,-1]
Output: 4
Explanation: Subarray [2,-1,3] has maximum sum 2 + (-1) + 3 = 4

Input: [3,-2,2,-3]
Output: 3
Explanation: Subarray [3] and [3,-2,2] both have maximum sum 3

Input: [-2,-3,-1]
Output: -1
Explanation: Subarray [-1] has maximum sum -1

**Algorithm**
Calculate the maximum sum subarray when non circular. Calculate when circular, how can this be done? Negative all the elements of array and and calculate the maximum sum subarray and add it to the total sum. This is the maximum sum when circular. Find the max of both the sums.

**Solution Link**: [Maximum Sum Circular Subarray](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/Maximum_Sum_Circular_Subarray.java)

## 14. Odd Even Linked List
Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

**Example**:
Input: 1->2->3->4->5->NULL
Output: 1->3->5->2->4->NULL

Input: 2->1->3->5->6->4->7->NULL
Output: 2->3->6->7->1->5->4->NULL

**Algorithm**
Create linkedList of odd nodes, Create linkedList of even nodes, Join them.

**Solution Link**: [Odd Even Linked List](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/Odd_Even_Linked_List.java)

## 15. Find All Anagrams in a String
Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

**Example**:
Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

**Algorithm**
Find all the anagrams using sliding window approach.

**Solution Link**: [Find All Anagrams in a String](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/Find_All_Anagrams_in_a_String.java)

## 16. Permutation in String
Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string.

**Example**:
Input: s1 = "ab" s2 = "eidbaooo"
Output: True
Explanation: s2 contains one permutation of s1 ("ba").

Input:s1= "ab" s2 = "eidboaoo"
Output: False

**Algorithm**
Find the anagram using sliding window approach, when found return true.

**Solution Link**: [Permutation in String](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/Permutation_in_String.java)

## 17. Online Stock Span
Write a class StockSpanner which collects daily price quotes for some stock, and returns the span of that stock's price for the current day.

The span of the stock's price today is defined as the maximum number of consecutive days (starting from today and going backwards) for which the price of the stock was less than or equal to today's price.

For example, if the price of a stock over the next 7 days were [100, 80, 60, 70, 60, 75, 85], then the stock spans would be [1, 1, 1, 2, 1, 4, 6].

**Example**:
Input: ["StockSpanner","next","next","next","next","next","next","next"], [[],[100],[80],[60],[70],[60],[75],[85]]
Output: [null,1,1,1,2,1,4,6]
Explanation: 
First, S = StockSpanner() is initialized.  Then:
S.next(100) is called and returns 1,
S.next(80) is called and returns 1,
S.next(60) is called and returns 1,
S.next(70) is called and returns 2,
S.next(60) is called and returns 1,
S.next(75) is called and returns 4,
S.next(85) is called and returns 6.

Note that (for example) S.next(75) returned 4, because the last 4 prices
(including today's price of 75) were less than or equal to today's price.

**Note**:
Calls to StockSpanner.next(int price) will have 1 <= price <= 10^5.
There will be at most 10000 calls to StockSpanner.next per test case.
There will be at most 150000 calls to StockSpanner.next across all test cases.
The total time limit for this problem has been reduced by 75% for C++, and 50% for all other languages.

**Algorithm**
The span od each day is the difference between the date and the nearest date when the price is higher than the current. Use stack to keep the record.

**Solution Link**: [Online Stock Span](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/Online_Stock_Span.java)

## 18. Kth Smallest Element in a BST
Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

**Note**: You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

**Example**:
Input: root = [3,1,4,null,2], k = 1
<br>
Output: 1

Input: root = [5,3,6,2,4,null,null,1], k = 3
<br>
Output: 3

**Algorithm**
Inorder traverse and maintaining a counter and when the counter hits k return node value. Since the inorder traversal of the BST is sorted.

**Solution Link**: [Kth Smallest Element in a BST](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/Kth_Smallest_Element_in_a_BST.java)

## 19. Count Square Submatrices with All Ones
Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.

**Example**:
Input: matrix =
[
  [0,1,1,1],
  [1,1,1,1],
  [0,1,1,1]
]
<br>
Output: 15
<br>
Explanation: 
There are 10 squares of side 1.
There are 4 squares of side 2.
There is  1 square of side 3.
Total number of squares = 10 + 4 + 1 = 15.
<br>
Input: matrix = 
[
  [1,0,1],
  [1,1,0],
  [1,1,0]
]
<br>
Output: 7
<br>
Explanation: 
There are 6 squares of side 1.  
There is 1 square of side 2. 
Total number of squares = 6 + 1 = 7.

**Algorithm**
Loop through the matrix and count the minimum possible square and add it to the total count doing bfs.

**Solution Link**: [Count Square Submatrices with All Ones](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/Count_Square_Submatrices_with_All_Ones.java)

## 20. Sort Characters By Frequency
Given a string, sort it in decreasing order based on the frequency of characters.

**Example**:
Input:"tree"
<br>
Output:"eert"
<br>
Explanation:'e' appears twice while 'r' and 't' both appear once.So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
<br>
<br>
Input:"cccaaa"
<br>
Output:"cccaaa"
<br>
Explanation: Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.Note that "cacaca" is incorrect, as the same characters must be together.
<br>
<br>
Input:"Aabb"
<br>
Output:"bbAa"
<br>
Explanation:"bbaA" is also a valid answer, but "Aabb" is incorrect.Note that 'A' and 'a' are treated as two different characters.
<br>
<br>
**Algorithm**
Store the frequency of all the characters in a hashMap. Sort the HashMap according the value. Now retrieve the characters frequency times in an empty stringbuilder.Return ans.

**Solution Link**: [Sort Characters By Frequency](https://github.com/AbhilashRath/LeetCode_May_30_Day_Challenge/blob/master/Sort_Characters_By_Frequency.java)
