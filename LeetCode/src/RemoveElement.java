

/*		https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150		*/

public class RemoveElement {

	 public int removeElement(int[] nums, int val) {
		 
		  int i = 0;

		    for (final int num : nums)
		      if (num != val)
		        nums[i++] = num;

		    return i;
		  
	 
	 }
	
}
