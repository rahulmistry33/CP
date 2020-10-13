class Solution {
public:
    vector<int> prisonAfterNDays(vector<int>& cells, int N) {
        vector<int> v(8);
        if(N==0)
            return cells;
        v[0]=v[7]=0;
        map<int,vector<int>> m;
        for(int i=1;i<=14;i++)
        {
            for(int j=1;j<=6;j++)
            {
                
                if(cells[j-1]==cells[j+1]){
                    v[j]=1;
                }else
                    v[j]=0;
                
            }
            for(int j=0;j<=7;j++){
                cells[j]=v[j];
            }
            m[i]=v;
            
        }
        if(N%14==0)
            return m[14];
        return m[N%14];
    }
};