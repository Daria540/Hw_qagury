public class Conflict {
    public static void main(String args[]){
        int[] col = {1,0,3};
        for (int i : col){
            for (int a=0; a<i; a++){
                System.out.print("Бар");
            }
            System.out.println();
        }
    }
}
