class Solution {
    public void helper(int n, int curr_val, List<Integer> ans){

     if(curr_val>n){
        return ;
     }

      int start_point=0;

      if(curr_val==0){
          start_point=1;
      }

       ans.add(curr_val);

      for(int i=start_point; i<=9;i++){
           helper(n, curr_val*10+i, ans);
      }

    }
    public List<Integer> lexicalOrder(int n) {
      
      List<Integer> ans= new ArrayList();
    //     // 1st Digit ka Kaam Yaha kar
    //    for(int i=1; i<=9;i++){
    //       helper(n, i, ans);
    //    }
     helper(n, 0, ans);
       ans.remove(0);
       return ans;
    }
}
