public class findDuplicate {

  public static int findDuplicate(int[] nums) {
    int res = -1;
    int[] nrOfInts = new int[nums.length];
    for(int i = 0; i < nums.length; i++) {
      nrOfInts[nums[i]] += 1;
    }
    for(int i = 1; i < nrOfInts.length; i++ ) {
      if(nrOfInts[i] > 1) {
        res = i;
        break;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int[] nums1 = {1,2,3,4,5,3};
    System.out.println(" " + findDuplicate(nums1));
  }
}
