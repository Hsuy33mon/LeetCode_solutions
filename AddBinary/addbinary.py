def addBinary(a,b):
    ad = int(a,2)
    bd = int(b,2)
    ans = ad + bd
    ans = format(ans,"b")
    return ans

print(addBinary("1010","1011"))