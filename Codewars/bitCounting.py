'''
Write a function that takes an (unsigned) integer as input, and returns the number of bits that are equal to one in the binary representation of that number.

Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case

'''

n= 1234

def countBits(n):
  total = 0
  while n>0:
    total += n%2
    n>>=1 
  return total
  
print countBits(n)
