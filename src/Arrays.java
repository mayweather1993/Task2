/**
 * Created by Zver on 20.04.2017.
 */

import java.io.BufferedReader;
        import java.io.InputStreamReader;

public class Arrays {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter number" + " " + (i + 1));
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);

        }
        System.out.print("Initial array:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+ (i==list.length-1 ? "" : ","));

        }
        for (int i=list.length-1;i>=0;i--){
            for ( int g = 0; g < i; g++){
                if (list[g] > list[g+1]){
                    int t=list[g];
                    list[g]=list[g+1];
                    list[g+1]=t;

                }
            }
        }

        System.out.println(" ");
        System.out.print("Sorted array:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+ (i == list.length-1 ? "." : ","));

        }
    }
}