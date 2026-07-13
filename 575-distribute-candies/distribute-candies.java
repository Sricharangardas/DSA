class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> t=new HashSet<>();
        for(int candy: candyType){
            t.add(candy);
        }
        if(t.size()>candyType.length/2)
            return candyType.length/2;
        
        return t.size();
    }
}