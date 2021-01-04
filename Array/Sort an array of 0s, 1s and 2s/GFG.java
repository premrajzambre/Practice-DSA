// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    
 // } Driver Code Ends


//User function template for Java

public static void sort012(int arr[], int n){
    // code here 
    int zero = 0;
        int one = 0;
        int two = 0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                zero++;
            }
            else if(arr[i]==1)
            {
                one++;
            }
            else{
                two++;
            }
        }

        int i = 0;
        while(i < arr.length)
        {
            if(i < zero)
            {
                arr[i]=0;
            }
            else if(i < zero+one)
            {
                arr[i]=1;
            }
            else{
                arr[i]=2;
            }
            i++;
        }
}

// { Driver Code Starts.

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Driver Code Ends