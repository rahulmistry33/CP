class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> hm = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!hm.contains(nums[i]))
            {
                hm.add(nums[i]);
            }
            else{
                hm.remove(nums[i]);
            }
        }
         Iterator<Integer> i = hm.iterator(); 
           return i.next(); 
    }
}