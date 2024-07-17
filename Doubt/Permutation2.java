class Solution {
    public void helper(List<List<Integer>> ans, List<Integer> path, int [] nums){
        
        
        if(nums.length==0){
           ans.add(new ArrayList(path));
            return;
        }
        
        
        for(int i=0; i<nums.length;i++){
            
            int [] chhota_nums=new int[nums.length-1];
            int index=0;
            boolean indicator=false;
            for(int j=0; j<i;j++){
                
                if(nums[i]==nums[j]){
                    indicator=true;
                    break;
                }
            }
            if(indicator==true){
                continue;
            }
            for(int j=0; j<nums.length;j++){
                
                if(i==j){
                    continue;
                }
                chhota_nums[index]=nums[j];
                index++;
            }
            path.add(nums[i]);
            helper(ans, path, chhota_nums );
            path.remove(path.size()-1);
        }
        
    }
    
    public List<List<Integer>> permuteUnique(int[] nums) {
       
        List<List<Integer>> ans= new ArrayList();
        List<Integer> path= new ArrayList();
        helper(ans, path, nums);
        return ans;
    }
}
