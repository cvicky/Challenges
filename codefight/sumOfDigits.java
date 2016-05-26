/*
Given an integer, find the sum of all its digits.

Example

For n = 111, the output should be
digitSum(n) = 3.

1 + 1 + 1 = 3.

[input] integer n

Non-negative integer.

[output] integer

*/

int digitSum(int n) {
    //go backwards
    //mod by 10
    //div by 10
    int lastDigit =0;
    int sum = 0;
    while(n>0){
        lastDigit = n%10;
        sum+= lastDigit;
        n= n/10;   
    }
    
    return sum;
}
