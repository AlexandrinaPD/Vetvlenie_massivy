public class TaskMassfour {
    public static void main(String[] args) {
        int[][] score = new int[3][4];
        score[0][0] = 10;
        score[0][1] = 11;
        score[0][2] = 12;
        score[0][3] = 13;
        score[1][0] = 20;
        score[1][1] = 21;
        score[1][2] = 22;
        score[1][3] = 23;
        score[2][0] = 30;
        score[2][1] = 31;
        score[2][2] = 32;
        score[2][3] = 33;

        int[] result = new int[3];
        result [0] = score[0][0] + score[0][1] + score[0][2] + score[0][3];
        result [1] = score[1][0] + score[1][1] + score[1][2] + score[1][3];
        result [2] = score[2][0] + score[2][1] + score[2][2] + score[2][3];

    }
}
