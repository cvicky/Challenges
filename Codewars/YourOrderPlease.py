'''
Your task is to sort a given string. Each word in the String will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input String is empty, return an empty String. The words in the input String will only contain valid consecutive numbers.

For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"

Test.assert_equals(order("is2 Thi1s T4est 3a"), "Thi1s is2 3a T4est")
'''


#clean version

def order(sentence):
  list = sentence.split() #split sentence by words
  finallist =[""]*len(list)
  for i in list: #iterate through the list of words
      for j in i: #iterate through the letters of the words
          if j.isdigit(): #find the digit
             finallist[int(j)-1]=i #edit the final list
  sentence = " ".join(finallist) #join the list into a sentence
  return sentence
  

'''
def order(sentence):
  list = sentence.split() #split sentence by words
  #print list
  finallist =[""]*len(list)
  #print finallist
  for i in list: #iterate through the list of words
      #print i
      for j in i: #iterate through the letters of the words
          #print j
          if j.isdigit(): #find the digit
              #print j
              #print i 
              finallist[int(j)-1]=i #edit the final list
  #print finallist
  sentence = " ".join(finallist) #join the list into a sentence
  return sentence
 '''
