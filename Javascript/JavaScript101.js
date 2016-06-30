/*
* Author: Vicky Chen
* Date: 6/29/2016
* MakerSquare: JavaScript 101
*/

//Semicolons are optional
var myName = "Vicky"
var theYear = 2016
var aDecimal = 5.2

//Find out the data type
typeof myName
typeof typeof theYear //String

var x = 15
var y = x

//Reassign the variable
x = 20
x  //20
y //still 15

//Define the fcn
var makeSeven = function(){
	return 6+1
}

//Invoke the fcn
var calculation = makeSeven() //will = the return statement from the fcn

var computeProduct = function(num1, num2){
	return num1 * num2
}

var product = computeProduct(2,4)
product

Math.random() //returns a random decimal between 0.00 and 1.00


"MakerSquare".slice(5) //returns starting from the 5th index, "Square"
"MakerSquare".slice(5,6) //returns only "S"

//Or start from the end of the String, goes backwards
"MakerSquare".slice(-6) //returns "Square"
