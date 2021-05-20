package hashTableChallenges;

public class Challenge1 {
	
	public static void main(String[] args) {
		
		int[] numsToAdd = {59382,43,6894,500,99,-58};
		int[] nums = new int[10];
		for(int i = 0; i<numsToAdd.length ; i++ ) {
			nums[hash(numsToAdd[i])] = numsToAdd[i];
		}
		for(int i = 0; i<10 ; i++) {
			System.out.println(nums[i]+"  ");
		}
		
	}
	public static int hash(int value) {
		return(Math.abs(value%10));
	}

}
