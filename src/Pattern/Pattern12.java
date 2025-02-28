package Pattern;

public class Pattern12 {
    public static void main(String[] args) {
         traingle(4,0);
    }
    static void traingle(int row, int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("* ");
            traingle(row,col+1);
        }else{
            System.out.println(" ");
            traingle(row-1,0);
        }
    }
}
