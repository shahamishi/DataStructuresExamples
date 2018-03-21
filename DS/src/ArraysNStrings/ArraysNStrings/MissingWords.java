package ArraysNStrings.ArraysNStrings;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ashah on 9/3/17.
 */
public class MissingWords {

    public static void main(String[] args){
       String[] result=  missingWords("amishi hi abc","");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
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
            listOfWordsFromS.indexOf(wordsOfT[i]);
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
}
