package com.sl.phase1.practiseproject;

 class LongestIncreassingSubsequence {
	static int max_ref;
	
	static  int _list(int arr[], int n)
	{
		if(n==1)
			return 1;
		int result,max_ending = 1;
		for(int i=1;i<n;i++)
		{
			result = _list(arr,i);
		    if(arr[i-1]<arr[n-1] && result+1 >max_ending)
		    	max_ending = result+1;
		}
		if(max_ref < max_ending)
			max_ref = max_ending;
		return max_ending;
	}
	static int list(int n,int arr[])
	{
		max_ref =1;
		_list(arr,n);
		return max_ref;
	}
	public static void main(String[] args) {
		int arr[] = {30,55,69,83,10,36,90,3,28};
		int n = arr.length;
		System.out.println("Length of the longest Increasing Subsequence : " + _list(arr,n) + "\n");
	}

}
