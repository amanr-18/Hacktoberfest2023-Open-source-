class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> nums = new ArrayList<>();
        
        for (int i = 1; i < n; i++) {
            fact *= i;
            nums.add(i);
        }
        nums.add(n);
        
        StringBuilder ans = new StringBuilder();
        k--;
        
        while (true) {
            ans.append(nums.get(k / fact));
            nums.remove(k / fact);
            
            if (nums.isEmpty()) {
                break;
            }
            
            k %= fact;
            fact /= nums.size();
        }
        
        return ans.toString();
    }
}
