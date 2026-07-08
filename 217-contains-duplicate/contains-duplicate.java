class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int num:nums){
            if(m.containsKey(num) && m.get(num)>=1){
                return true;
            }
                m.put(num,m.getOrDefault(num,0)+1);
            
        }
        return false;

    }
}