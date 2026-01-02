def plusOne(digits):
    num = int("".join(map(str, digits)))
    num += 1
    d = [int(d) for d in str(num)]
    return d
print(plusOne([9,9]))