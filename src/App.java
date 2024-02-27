import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        String[] arr = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        for(int i =0; i< arr.length;i++){
            if(arr[i].equals(a)){
                System.out.println(i+1);
            }
        }
        
        sc.close();
    }
}
