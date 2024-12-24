package javaPractice;

import java.util.HashSet;

/*
Find Longest Consecutive Sequence
Find the length of the longest consecutive sequence of integers in the array.
int[] arr ={100, 102, 101, 200, 3, 1, 2, 4, 5, 105, 106, 104, 103,107};
output - 7*/
public class tatvasoftCodingQuestion {
	public static void main(String[] args) {
		int[] arr = { 100, 102, 101, 200, 3, 1, 2, 4, 5, 104, 103, 107, 107 };
		HashSet<Integer> set = new HashSet<>();
		int length = 0;
		for (int num : arr) {
			set.add(num);
		}
		for (int num : arr) {
			if (!set.contains(num - 1)) {
				int crnt = num;
				int crntSeq = 1;
				while (set.contains(crnt + 1)) {
					crnt++;
					crntSeq++;
				}
				length = Math.max(length, crntSeq);
			}
		}
		System.out.println(length);
	}
}
