#!/bin/python

import sys

n = int(raw_input().strip())
dSumLeft = 0
dSumRight = 0
for i in range(n):
    matrixRow = raw_input().split()
    dSumLeft += int(matrixRow[i])
    dSumRight += int(matrixRow[-(i + 1)]) #negative indices start from the back of the array, -x is xth index from the back
    
print(abs(dSumLeft - dSumRight))
