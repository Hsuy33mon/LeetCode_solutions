def longest_common_prefix(strs):
    if not strs:
        return ""
    
    prefix = strs[0]
    
    for string in strs[1:]:
        while not string.startswith(prefix):
            prefix = prefix[:-1]
            if prefix == "":
                return ""
    
    return prefix

print(longest_common_prefix(["dog","car","lion"]))
print(longest_common_prefix(["flowers","flow","flight"]))
