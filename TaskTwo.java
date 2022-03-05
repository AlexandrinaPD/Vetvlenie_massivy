public class TaskTwo {
    public static void main(String[] args) {
        int j = 1;
        for (int i = 0; i <= 100 ; i++) {
            j = j*i;
            if (j > 1000){
                System.out.println(j);
                break;
            }
        }
    }
}
