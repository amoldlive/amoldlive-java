package com.leetcode.easy;
import java.util.HashSet;

public class IntersectionOfTwoElements {
	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1}, nums2 = {2,2};
		int[] res= intersection(nums1, nums2);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}
    private static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> res=new HashSet<>();
        
        for(int data:nums1){
            set.add(data);
        }
        
        for(int data:nums2){
            if(set.contains(data)) {
            	res.add(data);
            }
        }
        
       // System.out.println(res);
        int[] resArr=new int[res.size()];
        int i=0;	
        for(int data:res) {
        		resArr[i]=data;
        		i++;
        }
        return resArr;
    }
}
