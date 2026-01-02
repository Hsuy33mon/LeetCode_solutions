def climbStairs(n):
    #using Dp
    if n == 0 or n == 1:
        return 1
    dp = [0]*(n+1)
    dp[0] = 1
    dp[1] = 1
    for i in range(2,n+1):
        dp[i] = dp[i-1] + dp[i-2]
    return dp[n]



    # My answer 
    # ans = []
    # ans.append(1)
    # ans.append(2)
    # if n == 1:
    #     return ans[0]
    # elif n == 2:
    #     return ans[1]
    # for i in range(2,n+1):
    #     ans.append(ans[i-1]+ans[i-2])
    #     if len(ans) == n:
    #         return ans[n-1]

    
print(climbStairs(5))