package Assignment;

import java.util.Scanner;

public class IsAnagram {

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
       else{
            char[] str1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();
            //Arrays.sort(str1Array);   //if i use this method then we don't need to create a sortArray method only i need to check boath String are equal or not 
            //Arrays.sort(str2Array);  // str1Array.equals(str2Array) if both String are equals then return true or else return false 
           
            str1Array=sortArray(str1Array);
            str2Array=sortArray(str2Array);  
            for (int i = 0; i < str1Array.length; i++) {
                if (str1Array[i] != str2Array[i]) {
                    return false;
                }
            }
            return true;
        }
       
    }
    private static char[] sortArray(char[] str1Array) {
        for(int i=0;i<str1Array.length;i++){
            for(int j=i+1;j<str1Array.length;j++){
                if(str1Array[i]>str1Array[j]){
                char temp=str1Array[i];
                str1Array[i]=str1Array[j];
                str1Array[j]=temp;
                }
            }
        }
        return str1Array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine().toLowerCase();    
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine().toLowerCase();
        System.out.println(isAnagram(str1, str2));
        sc.close();
        
    }

}
