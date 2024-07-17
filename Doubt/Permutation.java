class Solution {

    public void helper(int [] arr, List<List<Integer>> ans, List<Integer> curr_permutation){

      if(arr.length==0){

           ans.add(new ArrayList(curr_permutation));
           return;

      }
      
       for(int i=0; i<arr.length;i++){

         int [] chhota_arr= new int[arr.length-1];
          int index=0;
         for(int j=0; j<arr.length;j++){

            if(i==j){
                continue;
            }
            chhota_arr[index]=arr[j];
            index++;
         }
          curr_permutation.add(arr[i]);
          helper(chhota_arr,ans,curr_permutation);
          curr_permutation.remove(curr_permutation.size()-1);
       }    
    }
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans= new ArrayList();
        List<Integer> curr_permutation= new ArrayList();
        helper(nums, ans, curr_permutation);
        return ans;
    }
}
