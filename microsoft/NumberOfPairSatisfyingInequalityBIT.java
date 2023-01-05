class Solution {
    final int SHIFT = 30000;
    public long numberOfPairs(int[] nums1, int[] nums2, int diff) {
        int n = nums1.length;
        int[] num = new int[n];
    
        BIT bit = new BIT(2*SHIFT);
        
        for(int i=0;i<n;i++){
            num[i] = nums1[i]-nums2[i];
        }
        long res = 0L;
        for(int i=0;i<n;i++){
            res += bit.sum(num[i] + diff + SHIFT);
            bit.update(num[i] + SHIFT);
        }
        return res;
    }
    
    class BIT{ //Binary Indexed tree or fenwick tree
        int[] arr;
        public BIT(int size){
            arr = new int[size+1];
        }
        
        void update(int start){
            for(int i=start;i<=arr.length;i+=(i&-i)){
                arr[i]++;
            }
        }
        
        int sum(int start){
            int sum = 0;
            for(int i=start;i>0;i-=(i&-i)){
                sum+=arr[i];
            }
            return sum;
        }
    }
}