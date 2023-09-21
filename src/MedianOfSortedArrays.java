import java.util.Arrays;
public class MedianOfSortedArrays {
  /**
   * Merges the two arrays then sorts them together.
   * @param nums1 one sorted array
   * @param nums2 one sorted array
   * @return combined sorted array
   */
    public static int[] mergeArrays(int[] nums1, int[] nums2){
      int[] nums3 = new int[nums1.length + nums2.length];
      int i = 0;
      int j = 0;
      int mi = 0;
      while(i < nums1.length){
        nums3[mi++] = nums1[i++];
      }
      while(j < nums2.length) {
        nums3[mi++] = nums2[j++];
      }
      Arrays.sort(nums3);
      return nums3;
    }

  /**
   * Finds the median of the two given arrays.
   * @param nums1 a sorted array
   * @param nums2 a sorted array
   * @return the median of the arrays.
   */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      double res = 0;
      int[] nums3 = mergeArrays(nums1, nums2);
      if ((nums3.length & 1) != 1){
        res = (double) (nums3[nums3.length/2]+nums3[(int)((nums3.length/2)-1)])/2;
      } else {
        res = nums3[(int)(nums3.length/2)];
      }
      return res;
    }

}
