/*
Nathan Cartwright

This code will find the sum of multiples of 3 and 5 given a list of consecutive integers
for example.. in a list of numbers 1-10 (not including 10) the multiples of 3 and 5 are 3,5,6,9
the sum of those multiples is 23.. this code finds the sum of multiples of 3 and 5 with a list from 1 - 1000 (not including 1000)


/*
public class sumofmultiples {

	public static void main(String[] args) {
   
		// TODO Auto-generated method stub
      

		// find the sum of multiples of 3 and 5 below 1000 
		
		
		int[] nums = new int[1000]; // create the array to hold the integers 
		int sum = 0;               // sum counter 
		for(int i = 1; i<nums.length; i++)     // traverse the array
		{
			nums[i] = i;      // fill the array linearly
			if((nums[i] % 3 ==0) || (nums[i] %5 ==0)) // if the index is divisible by 3 or 5
			{
				sum += nums[i]; // increment the sum 
				
			}
		
		}
		System.out.println(sum); // return the sum 
	}

}
