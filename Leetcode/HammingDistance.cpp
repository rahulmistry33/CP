class Solution {
public:
    int hammingDistance(int x, int y) {
        int ans=0;
        int bit,bit2;
        while(x>0||y>0)
        {
            if(x>0)
            {
                bit = x&1;
                x>>=1;
            }
            else bit=0;
            
            if(y>0)
            {
                bit2 = y&1;
                y>>=1;
            }
            else bit2=0;

            
            if(bit!=bit2){
                ans++;
            }
                   
        }
        return ans;
    }
};