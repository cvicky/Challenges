'''
Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contains any char.

Examples:
XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false

'''


def xo(s):
    s = s.lower()
    #iterate through the string
    xcounter = 0
    ocounter = 0
    for i in s:
        if i == 'x':
            xcounter = xcounter + 1
        elif i == 'o':
            ocounter = ocounter + 1
    if xcounter == ocounter:
        return True
    return False
