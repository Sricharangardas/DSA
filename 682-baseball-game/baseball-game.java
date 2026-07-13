class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> a=new Stack<>();
        int n=operations.length;
        for(int i=0;i<n;i++){
            if(operations[i].equals("C")){
                a.pop();
            }
            else if(operations[i].equals("D")){
                a.push(a.peek()*2);
            }
            else if(operations[i].equals("+")){
                int l=a.size();
                a.push(a.get(l-1) + a.get(l-2));
            }
            else
            a.push(Integer.parseInt(operations[i]));
        }
        int sum=0;
        while(!a.empty()){
            sum+=a.pop();
        }
            return sum;
    }
}