# Enter your code here. Read input from STDIN. Print output to STDOUT
inputarr1 = map(int, raw_input().strip().split(" "))
#print inputarr1

numDays= inputarr1[0]
numData = inputarr1[1]

inputarr2 = map(int,raw_input().strip().split(" "))
#print inputarr2

median = 0
day =numData
startIndex = 0
endIndex = numData
notifs = 0

while day < numDays:
    if day >= numData: 
        checkarr = inputarr2[startIndex:endIndex] #grabs from start to end, 0 to 5th index = 0 to 4
        #sort the array
        sortedarr = sorted(checkarr)
        
        #print "day:", day
        #print "notifs", notifs
        #print checkarr
        #print sortedarr

        #find the median
        if numData %2 ==0:
            median = (float)(sortedarr[numData/2]+sortedarr[(numData/2)-1])/2
        else:
            median = sortedarr[(numData//2)]

        #print "median:", median
        #print "inputarr2[day]", inputarr2[day]
        if inputarr2[day] >= median*2:
            notifs +=1
        
    day += 1
    startIndex+=1
    endIndex+=1
    #print "endIndex:", endIndex
    #print "numData:", numData

print notifs
