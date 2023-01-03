
//Find Duplicate characters in a string


//Problem Link:
//https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/



import java.util.HashMap;

public class Q3_DuplicateCharactersString {
    //TC: O(n) SC:O(k) k=no of unique characters
    public static void printDuplicate(String s){
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(HashMap.Entry<Character,Integer> e: map.entrySet()){
            if(e.getValue()>1){
                System.out.println(e.getKey()+", count="+e.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String str = "test string";
        printDuplicate(str);
    }
}
