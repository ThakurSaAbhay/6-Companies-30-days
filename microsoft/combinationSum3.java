class combinationSum3 // k=number of digits used n=number ot be formed by adding k digits
 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> subset=new ArrayList<>();
        genSubSet(1,9,new ArrayList(),subset,k,n);
        return subset;//All posible combinations of size k
    }
    void genSubSet(int start,int end,List<Integer> current,List<List<Integer>> subset,int k, int target){
        if(target==0 && current.size()==k) subset.add(new ArrayList(current));
        for (int i=start;i<=end;i++){
            current.add(i);
            genSubSet(i+1,end,current,subset,k,target-i);
            current.remove(current.size()-1);
    }}
}