# Enter your code here. Read input from STDIN. Print output to STDOUT
import re
s, regex = raw_input().strip(), re.compile(r'(\w)(\1)')
match = regex.search(s)
while match:    
    s = s.replace(match.group(),'')        
    match = regex.search(s)
print s if s else 'Empty String'
