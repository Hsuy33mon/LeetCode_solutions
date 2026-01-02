def insert(nums,target):

    if target>nums[-1]:
        nums.insert(len(nums),target)
        return len(nums)-1
    
    if target not in nums:
        for j in range(len(nums)-1):
            if nums[j]<target and nums[j+1]>target:
                nums.insert(j+1,target)
                return j+1
            
    for i in range(len(nums)):
        if nums[i] == target:
            return i
    return 0

nums = [1,3,5,6]
print(insert(nums,4))
print(nums)