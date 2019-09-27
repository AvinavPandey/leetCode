package leetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import org.apache.commons.lang.ArrayUtils;

/**
 * @author PANDEAV
 *
 */
public class LongestCommonPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException  
    { 
		String arr[] =  {"flower","flow", "flight"};
        //Enter data using BufferReader 
       //BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
        
        
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.longestCommonPrefix(arr);
        System.out.println("The result is : " + result);
        
    }
	
	
	public String longestCommonPrefix(String[] strs) {
	    if (strs.length == 0) return "";
	    String prefix = strs[0];
	    for (int i = 1; i < strs.length; i++)
	        while (strs[i].indexOf(prefix) != 0) {
	            prefix = prefix.substring(0, prefix.length() - 1);
	            if (prefix.isEmpty()) return "";
	        }        
	    return prefix;
	}
	
	
	/*
	 * public String longestCommonPrefix(String[] strs) {
	 * 
	 * String prefix = ""; String prefix1 = ""; int smallestString = 0;
	 * 
	 * if(null!= strs && strs.length !=0) { if(null != strs[0] && strs.length > 1 )
	 * { smallestString = strs[0].length(); // Find the length of smallest string in
	 * the array for (int i = 0; i < strs.length; i++) { smallestString =
	 * Math.min(strs[i].length(), smallestString); }
	 * 
	 * for (int i = 0; i < strs.length; i++) { if(i==0) { for (int j = 0; j <
	 * smallestString; j++) { if(strs[i].charAt(j) == strs[i+1].charAt(j)) { prefix
	 * = prefix + strs[i].charAt(j); } } }if( i>0 && prefix != "") { if(prefix !="")
	 * { for (int j = 0; j < Math.min(smallestString, prefix.length()); j++) {
	 * if(prefix.charAt(j) == strs[i].charAt(j)) { prefix1 = prefix1 +
	 * prefix.charAt(j); } } prefix = prefix1; prefix1 ="";
	 * 
	 * }else { String arr[] = new String[strs.length-1]; for(int j=1; j<
	 * strs.length; j++) { arr[j-1] = strs[j]; } return longestCommonPrefix(arr); }
	 * } }
	 * 
	 * 
	 * }else { return strs[0];
	 * 
	 * }
	 * 
	 * }else { return "";
	 * 
	 * } return prefix; }
	 */	
}
