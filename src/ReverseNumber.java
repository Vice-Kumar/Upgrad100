import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[2*n];
        for(int i =0; i < 2*n; i++)
           nums[i] = sc.nextInt();
           int reverse = 0;
        for(int i=0; i < 2*n; i++) {
            reverse = 0;
            while (nums[i] != 0) {
                reverse = reverse * 10 + nums[i] % 10;
                nums[i] = nums[i] / 10;
            }
            nums[i] = reverse;
        }
        for(int i=0; i < 2*n; i+=2)
            nums[i] =nums[i+1]+nums[i];
        for(int i=0; i < 2*n; i++) {
            reverse = 0;
            while (nums[i] != 0) {
                reverse = reverse * 10 + nums[i] % 10;
                nums[i] = nums[i] / 10;
            }
            nums[i] = reverse;
        }
        for(int i=0; i<2*n; i+=2)
            System.out.println(nums[i]);
    }
}
