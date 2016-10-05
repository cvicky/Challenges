# Enter your code here. Read input from STDIN. Print output to STDOUT
'''
Read two integers from STDIN and print three lines where:

The first line contains the sum of the two numbers.
The second line contains the difference of the two numbers (first - second).
The third line contains the product of the two numbers.
'''
first = int(raw_input() ) #convert string to int
second = int(raw_input()) #convert string to int

total = second + first
diff = first - second
prod = first*second

print(total)
print(diff)
print(prod)
