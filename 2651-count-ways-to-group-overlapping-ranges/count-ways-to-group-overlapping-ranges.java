class Solution {
    public int countWays(int[][] ranges) {
        long groups=1;
        long MOD = 1000000007;
        long ans = 1; 
        Arrays.sort(ranges, (a,b) -> Integer.compare(a[0],b[0]));
        for(int i=1;i<ranges.length;i++)
        {
            if(ranges[i][0]>ranges[i-1][1])
            {
                groups++;
            }
            else
            {
                ranges[i][1] = Math.max(ranges[i][1], ranges[i-1][1]);
            }
        }
        for(int i=0;i<groups;i++)
        {
            ans= (ans*2) % MOD;
        }
        return (int) ans;
    }
}