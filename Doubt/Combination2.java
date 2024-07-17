class Solution {
    public void Combination(int [] arr, int i, int target, List<List<Integer>> ans,
       List<Integer> curr_combination, int sum){
      
          if(i==arr.length){ // Empty Array  
             if(sum==target){

                ans.add(new ArrayList(curr_combination));
             }
             return ;
          }

          if(sum>target){
            return;
          }

         // Pick  i index vali Value ko pick karenge
          curr_combination.add(arr[i]);
          Combination(arr, i+1, target, ans, curr_combination, sum+arr[i]);
          curr_combination.remove(curr_combination.size()-1);
        // Pick i index Value ko pick nahi Karenge
         while(i< arr.length-1 && arr[i] ==arr[i+1]){
            i++;
         }
         Combination(arr, i+1, target, ans, curr_combination, sum+0);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
         Arrays.sort(candidates);
         List<List<Integer>> ans=  new ArrayList();
         List<Integer> curr_combination= new ArrayList();
         Combination(candidates, 0,target, ans, curr_combination, 0);
         return ans;

    }
}
