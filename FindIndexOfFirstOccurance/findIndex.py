def find(haystack,needle):
    if len(needle) > len(haystack):
        return -1
    l = len(needle)
    for i in range(len(haystack)):
        if haystack[i:i+l] == needle:
            return i
    return -1

print(find("leetcode","leeto"))