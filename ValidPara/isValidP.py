from collections import deque

def isValid(s):
    stack = deque()
    open = ["(","{","["]
    close = [")","}","]"]

    if len(s)%2 != 0 :
        return False

    if s[-1] in open:
        return False
    
    if s[0] in close:
        return False
    
    for i in s:
            if i in open:
                stack.append(i)
            elif i in close:
                while not stack:
                    return False
                o = stack.pop() 
                for k in range(len(close)):
                    if o == open[k]:
                        if i != close[k]:
                            return False
    
    while stack:
        return False
    return True


# print(isValid("(]")) #False
# print(isValid("(){}}{")) #False
# print(isValid("({{{{}}}))")) #False
# print(isValid("([])")) #True
# print(isValid("}{")) #False
# print(isValid("([)]")) #False
# print(isValid("([]")) #False
print(isValid("()))")) #False
