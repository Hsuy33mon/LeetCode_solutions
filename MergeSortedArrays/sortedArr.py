def sortedarr(nums1,m,nums2,n):
    if m == 0:
        nums1[:n] = nums2[:n]
        return
    for j in range(n):
        for i in range(len(nums1)):
            if nums1[i] == 0 and i>=m:
                nums1[i] = nums2[j]
                m+=1
                for k in range(m):
                    if nums1[k] > nums1[i]:
                        temp = nums1[k]
                        nums1[k] = nums1[i]
                        nums1[i] = temp
                break
    # way2
    # if m == 0:
    #         nums1[0] =nums2
    #     k = 0
    #     for j in range(m,len(nums1)):
    #         while k <= n:
    #             nums1[j] = nums2[k]
    #             k+=1
    #             break
    #     for a in range(len(nums1)):
    #         for b in range(a+1,len(nums1)):
    #             if nums1[a] > nums1[b]:
    #                 temp = nums1[a]
    #                 temp1 = nums1[b]
    #                 nums1[a] = temp1
    #                 nums1[b] = temp
    
n1 = [-1,0,0,3,3,3,0,0,0]
n2 = [1,2,2]
m = 3
n = 3
sortedarr(n1,m,n2,n)
print(n1)