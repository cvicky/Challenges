# Enter your code here. Read input from STDIN. Print output to STDOUT
'''
Task 
Read two integers and print two lines. The first line should contain integer division,  // . The second line should contain float division,  / .

You don't need to perform any rounding or formatting operations.

Input Format 
The first line contains the first integer,N . The second line contains the second integer, M.

Output Format 
Print the two lines as described above.
'''

num1 = int(raw_input()) #convert string to int
num2 = int(raw_input())

intAns = num1//num2
floatAns = num1/float(num2) #cast the denominator as a float, int/float = float

print(intAns)
print(floatAns)
