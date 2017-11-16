package gyyx;  
      
import java.util.HashMap;
import java.util.Map;  

public class gyyx {  
      
	public static int lengthOfLongestSubstring(String s) {  
            Map<Character,Integer> map=new HashMap<Character,Integer>();  
            int maxLength=0;  
            int now=0;  
            for(int i=0;i<s.length();i++){  
                //System.out.println(now);  
                //System.out.println(map);  
                if(map.containsKey(s.charAt(i))){  
                    //System.out.println("now:"+now);  
                    now=Math.max(map.get(s.charAt(i))+1,now);  
                    if((i-now+1)>maxLength){  
                        maxLength=i-now+1;  
                          
                    }  
                }else{  
                    if((i-now+1)>maxLength){  
                        maxLength=i-now+1;  
                    }  
                }  
                map.put(s.charAt(i), i);  
            }  
            return maxLength;  
        }  
        public static void main(String[] args) {  
            // TODO Auto-generated method stub  
            String str1="abcba";  
            System.out.println(lengthOfLongestSubstring(str1));  
            
            String str2="aaaa";  
            System.out.println(lengthOfLongestSubstring(str2));  
            
            String str3=" ";  
            System.out.println(lengthOfLongestSubstring(str3));  
            
            String str4="qwerttyd";  
            System.out.println(lengthOfLongestSubstring(str4));  
            
            String str5="mnbvcxzlkjhgfdsaa";  
            System.out.println(lengthOfLongestSubstring(str5));  
              
        }

      
    }  