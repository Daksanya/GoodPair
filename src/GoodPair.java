import java.util.Scanner;

public class GoodPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int b= sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(goodPair(array,n,b));
    }
    static int goodPair(int array[],int n,int b){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
              if(array[i]+array[j]==b){
                  return 1;

              }
            }
        }
        return 0;
    }
}
