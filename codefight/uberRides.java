/*
Being a new Uber user, you have $20 off your first ride. You want to make the most out of it and drive in the fanciest car you can afford, without spending any out-of-pocket money. There are 5 options, from the least to the most expensive: "UberX", "UberXL", "UberPlus", "UberBlack" and "UberSUV".

You know the length l of your ride in miles and how much one mile costs for each car. Find the best car you can afford.

Example

For l = 30 and fares = [0.3, 0.5, 0.7, 1, 1.3], the output should be
fancyRide(l, fares) = "UberXL".

The cost for the ride in this car would be $15, which you can afford, but "UberPlus" would cost $21, which is too much for you.

[input] integer l

A positive number representing the length of the ride.

[input] array.float fares

A strictly increasing array of 5 elements. fares[0] stands for dollars per mile in "UberX", fares[1] is the same for "UberXL", etc.

[output] string

The car that you should choose: "UberX", "UberXL", "UberPlus", "UberBlack" or "UberSUV". It is guaranteed that you can afford at least one of them.
*/


String fancyRide(int l, double[] fares) {
  double cost = 0;
  int index = 0;
  for(int i=0; i<fares.length; i++){
    double tempcost = l*fares[i];
    
    if( tempcost <=20){
        cost = tempcost; 
        index = i;
    } 
  }
  
  if(index ==0)
    return "UberX";
  else if(index ==1)
    return "UberXL";
  else if (index ==2)
    return "UberPlus";
  else if (index ==3)
    return "UberBlack";
  else
    return "UberSUV";
}
