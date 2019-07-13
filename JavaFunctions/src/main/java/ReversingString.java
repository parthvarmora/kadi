import org.junit.Test;

public class ReversingString {


    //reversing a string
    String reversingString(String str){

        if(str==null || str.isEmpty())
            return null;

        String reverseString = " ";

        for(int i=str.length()-1;i>=0;i--){
            reverseString=reverseString+str.charAt(i);
        }
        return reverseString;
    }


    //reversing string words
    String reversingStringWord(String str){

        if(str==null || str.isEmpty())
            return null;

        String reverseString = " ";
        String[] stringArr=str.split(" ");

        for(int i=stringArr.length-1;i>=0;i--){
            reverseString=reverseString+stringArr[i]+" ";
        }
        return reverseString;


    }

    @Test
    public void testAbovefunctions(){
        String str1= "parth";
        System.out.println("reverse string: "+reversingString(str1));

        String str2= "I am not rockstar";
        System.out.println("reverse string: "+reversingStringWord(str2));

    }

}
