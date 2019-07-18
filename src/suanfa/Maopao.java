package suanfa;

import java.util.Arrays;

public class Maopao {
	public static void main(String[] args) {
		int[] nums = {84,83,88,87,61,59,32};
		for(int i=0;i<nums.length-1;i++) {
			for(int j =0;j<nums.length-i-1;j++) {
				if(nums[j]<nums[j+1]) {
					int k = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = k;
				}
			}
			System.out.println(Arrays.toString(nums));
		}
		System.out.println(Arrays.toString(nums));
	}
	
}
