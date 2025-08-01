package Queue;
import java.util.*;
import java.io.*;
public class basic {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        StringBuilder sb = new StringBuilder();
	        
	        while (t-- > 0) {
	            int n = sc.nextInt();
	            int[] a = new int[n];
	            for (int i = 0; i < n; i++) 
	                a[i] = sc.nextInt();
	            
	            // Compute prefix minimums and their cumulative sum
	            long baseSum = 0;
	            int[] prefixMin = new int[n];
	            long[] suffixSum = new long[n]; // Sum of prefix minimums from position i to n-1
	            
	            prefixMin[0] = a[0];
	            for (int i = 1; i < n; i++) {
	                prefixMin[i] = Math.min(prefixMin[i-1], a[i]);
	            }
	            
	            // Calculate base sum and suffix sums
	            suffixSum[n-1] = prefixMin[n-1];
	            baseSum += prefixMin[n-1];
	            
	            for (int i = n-2; i >= 0; i--) {
	                suffixSum[i] = suffixSum[i+1] + prefixMin[i];
	                baseSum += prefixMin[i];
	            }
	            
	            long best = baseSum;
	            
	            // For each operation, calculate the new sum in O(1)
	            for (int i = 0; i < n - 1; i++) {
	                long newSum = 0;
	                
	                // Sum of unchanged prefix minimums (0 to i-1)
	                if (i > 0) {
	                    newSum += suffixSum[0] - suffixSum[i];
	                }
	                
	                // After operation: a[i] = a[i] + a[i+1], a[i+1] = 0
	                int newAi = a[i] + a[i+1];
	                int newMinAtI = (i > 0) ? Math.min(prefixMin[i-1], newAi) : newAi;
	                
	                // Add contribution from position i
	                newSum += newMinAtI;
	                
	                // For positions i+1 to n-1, the minimum will be min(newMinAtI, 0) = 0 if newMinAtI > 0
	                int minFromIPlus1 = Math.min(newMinAtI, 0);
	                newSum += (long)minFromIPlus1 * (n - i - 1);
	                
	                best = Math.min(best, newSum);
	            }
	            
	            sb.append(best).append("\n");
	        }
	        System.out.print(sb);
	    }
	}