/*
* Author: Vicky Chen
* Date: 6/29/2016
* MakerSquare: JavaScript 101
*/

//semicolons are optional
var myName = "Vicky"
var theYear = 2016
var aDecimal = 5.2

//find out the data type
typeof myName
typeof typeof theYear //String

var x = 15
var y = x

//reassign the variable
x = 20
x  //20
y //still 15

var makeSeven = function(){
	return 6+1
}

var calculation = makeSeven() //will = the return statement from the fcn

var computeProduct = function(num1, num2){
	return num1 * num2
}

var product = computeProduct(2,4)
product

Math.random() //returns a random decimal between 0.00 and 1.00
"MakerSquare".slice(5) //returns starting from the 5th index
"MakerSquare".slice(5,6) //returns only "S"
