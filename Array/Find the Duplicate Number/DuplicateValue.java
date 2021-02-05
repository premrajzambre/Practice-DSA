import java.util.Scanner;
public class DuplicateValue
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int repeatnum;
        int nums[] = new int[n+1];
        for(int i=0; i<nums.length; i++)
        {
            nums[i]=sc.nextInt();
        }
        repeatnum = findDuplicate(nums);
        System.out.println(repeatnum);
    }

    public static int findDuplicate(int[] nums) {
        
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    return nums[i];
                }
                else
                    continue;
            }
        }
        return 0;
    }
}