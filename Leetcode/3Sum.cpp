#include <bits/stdc++.h>

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        set<vector<int>> ans;
        cout<<nums.size()<<endl;
        sort(nums.begin(),nums.end());
        for(int i=0; i<nums.size(); i++)
        {
            int x=i+1,y=nums.size()-1;
            while(x<y)
            {
                int sum = nums[x] + nums[y];
                sum*=-1;
                if(sum<nums[i]){
                    y--;
                }
                else if(sum>nums[i]){
                    x++;
                }else
                {
                    ans.insert({nums[i],nums[x],nums[y]});
                    x++;
                }
            }
        }
        vector<vector<int>> ans1;
        std::copy(ans.begin(), ans.end(), std::back_inserter(ans1));
        return ans1;
    }
};