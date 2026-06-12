package Week2.Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            String st = strs[i];
            char[] arr = st.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(mp.containsKey(sorted)){
                mp.get(sorted).add(st);
            }
            else{
                mp.put(sorted,new ArrayList<>());
                mp.get(sorted).add(st);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(var e : mp.entrySet()){
            ans.add(e.getValue());
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    
}
