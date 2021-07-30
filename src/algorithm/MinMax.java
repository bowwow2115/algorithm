package algo;
import java.util.*;

public class MinMax {
	
	
	public int max1(int i, int j, int k) {
		int max = 0;
		if(i>j) {
			max = i;
		}else if(j>k) {
			max=j;
		}else if(k>i){
			max=k;
			
		}
		return max;
	}
}
