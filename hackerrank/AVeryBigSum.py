#!/bin/python
'''
You are given an array of integers of size N. You need to print the sum of the elements in the array, keeping in mind that some of those integers may be quite large.

Input Format
The first line of the input consists of an integer N. The next line contains N space-separated integers contained in the array.

Output Format
Print a single value equal to the sum of the elements in the array.
'''
import sys

n = int(raw_input().strip())
arr = map(int,raw_input().strip().split(' '))

total =0
for i in range(0, n):
    total+=arr[i]  
print(total)
