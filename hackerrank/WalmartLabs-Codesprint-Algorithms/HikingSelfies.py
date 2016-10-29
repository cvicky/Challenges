#n is the number of frames in camera
#x is the number of friends on the hike
#return the excess frames or additional frames needed

n=int(input().strip()) 
x=int(input().strip())
com=2**n-1;
print(abs(com-x))
