def removeEle(nums,val):
    l = len(nums)-1
    i=0
    while i <= l:
        if nums[i] == val:
            nums.pop(i)
            l -= 1
        else:
            i+=1
    return len(nums)

nums = [0,1,2,2,3,0,4,2]
print(removeEle(nums,2),nums)