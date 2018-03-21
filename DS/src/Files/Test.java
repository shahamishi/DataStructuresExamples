package Files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ashah on 9/3/17.
 */
public class Test {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String args[]) throws Exception {
        // read the string filename
        String filename;
        filename = scan.nextLine();

        List<String> lines = readLines(filename);
        File file = processLines(lines,filename);

    }

    private static List<String> readLines(String filename){
        List<String> lines = new ArrayList<String>();
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = br.readLine()) !=null){
                lines.add(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return lines;
    }

    private static File processLines(List<String> lines,String filename){
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        String wordWithGif;
        String word;
        try{
            fileWriter = new FileWriter("gifs_"+filename);
            bufferedWriter  = new BufferedWriter(fileWriter);
            for(String line: lines){
                if(line.contains("gif") || line.contains("GIF")){
                    wordWithGif = line.split("\\s")[6];
                    word = wordWithGif.substring(wordWithGif.lastIndexOf("/")+1, wordWithGif.length());
                    bufferedWriter.write(word);
                    bufferedWriter.newLine();
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(bufferedWriter != null)
                    bufferedWriter.close();
                if(fileWriter != null)
                    fileWriter.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return new File("gifs_"+filename);
    }

}
