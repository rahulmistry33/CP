class Solution {
    int dp[][];
    
    public int scs(String s1,String s2,int n,int m){
        if(dp[n][m] != -1)
            return dp[n][m];
        if(n == 0 || m == 0)
            dp[n][m] = n+m;
        else if(s1.charAt(n-1) == s2.charAt(m-1)){
            dp[n][m] = 1+scs(s1,s2,n-1,m-1);
        }
        else{
            dp[n][m] = 1+Math.min(scs(s1,s2,n-1,m),scs(s1,s2,n,m-1));
        }
        return dp[n][m];
    }
    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        dp = new int[n+1][m+1];
        for(int arr[] : dp) Arrays.fill(arr,-1);
        scs(str1,str2,n,m);
        System.out.println(dp[n][m]);
        int x = n;
        int y = m;
        //for(int arr[] : dp)System.out.println(Arrays.toString(arr));
        StringBuilder br = new StringBuilder();
        while(x>=1 && y>=1){
            if(str1.charAt(x-1) == str2.charAt(y-1)){
                br.append(str1.charAt(x-1));
                x--;
                y--;
            }
            else{
                if(dp[x-1][y] < dp[x][y-1]){
                    br.append(str1.charAt(x-1));
                    x--;
                }
                else{
                    br.append(str2.charAt(y-1));
                    y--;
                }
            }
        }
        while(x>=1){
            br.append(str1.charAt(x-1));
            x--;
        }
        while(y>=1){
            br.append(str2.charAt(y-1));
            y--;
        }
        
        String s = br.reverse().toString();
        return s;
        
        
    }
}