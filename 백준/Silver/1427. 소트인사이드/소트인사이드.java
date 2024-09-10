import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strSort = reader.readLine().split("");
        Integer[] arrAList = new Integer[strSort.length];
        for(int i =0;i<strSort.length;i++) arrAList[i] = Integer.parseInt(strSort[i]);
        Arrays.sort(arrAList, Collections.reverseOrder());
        for(int i =0;i<strSort.length;i++) System.out.print(arrAList[i]);
    }
}