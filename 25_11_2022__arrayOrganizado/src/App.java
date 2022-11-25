import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner input = new Scanner(System.in);
        int i;
        int N = input.nextInt();
          int [] nums = new int[N];
            for (i = 0; i < N; i++)
            {
                nums[i] = input.nextInt();
            }
             //TODO: mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares 
       int j = 0;
      for (i = 0; i < nums.length; i++) {
        if (nums[i] %2 == 0){
          nums[i] = nums[i] ^ nums[j] ^ (nums[j] = nums[i]);
          j++;
        }
      }
  
      for(i=0; i< nums.length; i++){
        System.out.println(nums[i]);
      }

      for (var entry : nums) {
      
      }
    }
}