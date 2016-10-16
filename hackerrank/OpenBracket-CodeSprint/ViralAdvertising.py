# Enter your code here. Read input from STDIN. Print output to STDOUT
days = int(raw_input())
totalppl = 5
totalLiked = 0

for i in range(days):
    liked = totalppl//2
    #integer division 5//2 = 2, 5/2 = 2.5
    #I need floor(totalppl//2)
    totalLiked += liked
    totalppl = liked*3

print totalLiked
