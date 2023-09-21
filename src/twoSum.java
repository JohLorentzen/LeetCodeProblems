public class twoSum {
  public static int[] twoSum(int[] nums, int target) {

    int[] result = new int[2];
    int len = nums.length;
    for (int i = 0; i < nums.length; i++){
      for (int j = i+1; j < nums.length; j++){
        if (nums[i]+nums[j]==target){
          result[0] = i;
          result[1] = j;
          break;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] nums = {1,2,3};
    int target = 5;
    int[] solution = twoSum(nums, target);
    for (int i = 0; i < solution.length; i++) {
      System.out.println(solution[i]);
    }
  }
}
