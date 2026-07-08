class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> m=new  HashSet<>();
        for(int num: nums){
            if(m.contains(num)){
                return true;
            }
                m.add(num);
        }
        return false;

    }
}