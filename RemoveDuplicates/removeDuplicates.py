def removeDuo(nums):
    l = len(nums)-1
    i = 0
    while i < l:
        j = i+1
        while j<=l:
            if nums[i] == nums[j]:
                nums.pop(j)
                l -= 1
            else:
                j+=1
        i+=1
    return len(nums)

nums = [0,0,0,1,2,3,3]
print(removeDuo(nums),nums)