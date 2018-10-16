package javapractice.javapractice;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class CountOfCharacterInString 
{
    public static void main( String[] args )
    {
    	Map<Character, Integer> map= new HashMap<Character, Integer>();
    	String data = "texxt";
    	char[] arr=data.toCharArray();
    	for(char c:arr) {
    		Integer count = map.get(c);
    		if(count != null) {
    			++count;
    		}else {
    			count = 1;
    		}
    		map.put(c, count);
    	}
    	for(Character ch:map.keySet()) {
    		if(map.get(ch) >1) {
    			System.out.println(ch);
    		}
    	}
        //System.out.println( map );
    }
}
