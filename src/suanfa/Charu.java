package suanfa;

import java.util.Arrays;

public class Charu {
	public static void main(String[] args) {
		int[] nums = {84,83,88,87,61,59,32};
		int j;
		int temp;
		for(int i = 1;i<nums.length;i++) {
			temp = nums[i];
			j = i - 1;
			while(j>=0&&temp>nums[j]) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = temp;
		}
		System.out.println(Arrays.toString(nums));
	}
}
