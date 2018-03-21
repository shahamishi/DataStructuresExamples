package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ashah on 9/3/17.
 */
public class test {

    public static void main(String[] args){
        String string = "/images/something.gif";
       String result = string.substring(string.lastIndexOf("/")+1,string.length());
        System.out.print(result);
    }
//    String[] result=  missingWords("a b c d e f a b c","a c");
//              for(int i=0;i<result.length;i++){
//                  System.out.println(result[i]);
//              }
//    }

    static String[] missingWords(String s, String t) {
        String[] wordsOfS = s.split("\\s");
        String[] wordsOfT = t.split("\\s");
        List<String> listOfWordsFromT = Arrays.asList(wordsOfT);
        List<String> listOfWordsFromS = Arrays.asList(wordsOfS);

        int size = wordsOfS.length - wordsOfT.length ;
        String[] missingWords = new String[size];
        int counter=0;

        int indexInS=0;
        int prevIndex=0;
        for(int i=0;i<wordsOfT.length;i++){
            indexInS = listOfWordsFromS.indexOf(wordsOfT[i]);
            for(int j=prevIndex;j<indexInS;j++){
                missingWords[counter++]=listOfWordsFromS.get(j);
            }
            prevIndex=indexInS+1;
        }
        for(int j=prevIndex;j<wordsOfS.length;j++){
            missingWords[counter++]=listOfWordsFromS.get(j);
        }
        return missingWords;

    }

    static int[] oddNumbers(int l, int r) {
        int size=0;
        boolean isLeftOdd = l%2 == 0 ? true : false;
        boolean isRightOdd = r%2 == 0 ? true: false;

        if((r-l)%2 == 0 && isLeftOdd && isRightOdd){
            size = (r-l)/2;
        }else if((r-l)%2 == 0 && ((isLeftOdd && !isRightOdd) || (!isLeftOdd && isRightOdd))){
            size = (r-l)/2;
        }else{
            size = (r-l)/2 +1;
        }

        int[] resultArray = new int[size];


//        List<Integer> aList = Arrays.asList(Integer.valueOf(resultArray));
        int resultCounter=0;
        int counter=l;
        while(counter <=r){
            if(counter%2 ==1){
                resultArray[resultCounter] = counter;
                resultCounter++;
                counter+=2;

            }else{
                counter+=1;
            }
        }
//        resultArray.length();
        return resultArray;

    }
}
