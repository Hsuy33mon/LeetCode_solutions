def last(s):
    if len(s) == 0:
        return 0
    count = 0
    temp = s.strip()
    if len(temp) == 1:
        return 1
    for i in temp[-1::-1]:
        if i != " ":
            count += 1
        else: break
    return count

print(last("    day"))