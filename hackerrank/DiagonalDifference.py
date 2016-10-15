#!/bin/python

import sys

n = int(raw_input().strip())
dSumLeft = 0
dSumRight = 0
for i in range(n):
    matrixRow = raw_input().split()
    dSumLeft += int(matrixRow[i])
    dSumRight += int(matrixRow[-(i + 1)])
    
print(abs(dSumLeft - dSumRight))
