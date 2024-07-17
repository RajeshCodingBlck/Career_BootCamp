class Solution {


//  define -> Print all Combination for array arr which Start from i...
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
          Combination(arr, i, target, ans, curr_combination, sum+arr[i]);
          curr_combination.remove(curr_combination.size()-1);
        // Pick i index Value ko pick nahi Karenge
         Combination(arr, i+1, target, ans, curr_combination, sum+0);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

         List<List<Integer>> ans=  new ArrayList();
         List<Integer> curr_combination= new ArrayList();
         Combination(candidates, 0,target, ans, curr_combination, 0);
         return ans;

    }
}
