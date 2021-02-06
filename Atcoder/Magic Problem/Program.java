import java.util.*;
public class Program
{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int D = sc.nextInt();
        int arr[][] = new int[N][2];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<2;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<N;i++)
        {
            if((arr[i][0] < S) && (arr[i][1]>D))
            {
                System.out.println("Yes");
                System.exit(0);
            }
        }

        System.out.println("No");
	}
}