public class Pyramid{
    public static void main(String []args){
        int rows = 5;
        int i,j;
        for (i=1;i<=rows;i++){
            for (j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}