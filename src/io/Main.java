package io;

/**
 * Created by emakarov on 27.01.2016.
 */

import java.io.*;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by emakarov on 27.01.2016.
 */
public class Main {
    public static void main(String[] args) {
        // put your code here
        //try {
        BufferedReader br;
        BufferedWriter bw;
        String temp;

        //FileReader fr = new FileReader("./test1.txt");
        //FileWriter wr = new FileWriter("./test2.txt");

        //bw = new BufferedWriter(wr);
        //br = new BufferedReader(fr);

        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, String> store = new HashMap<Integer, String>();
        // Map<Integer, String> keys = new HashMap<Integer, String>();
        // Map<String, Integer> count = new HashMap<String, Integer>();

        try {
            String word1 = "";
            int key=1;
            while ((temp = br.readLine()) != null) {
                while (!temp.isEmpty()) {
                    int pos1 = temp.indexOf("\t");
                    if (pos1 > 0) {word1 = temp.substring(0, pos1);temp="";}
                    if (!store.containsValue(word1)) {
                        store.put(key,word1);
                        key = key + 1;
                    }



                }

                }
            for (int i = 1; i <= store.size(); i++) {
                    System.out.println(store.get(i)+ "\n");
                    bw.write(store.get(i)+ "\n");
                    bw.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    } /*catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}

