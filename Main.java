package maxLength;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {0,1,1,1,0,1,0,1,0,1,0,0},
                {1,1,0,0,0,0,0,0,1,1,1,0},
                {1,1,1,1,1,1,1,1,0,1,1,0},
                {1,1,1,1,1,1,1,1,0,1,0,0},
                {1,1,0,1,1,0,1,0,1,0,0,1},
                {1,1,0,1,1,0,0,0,0,0,1,1},
                {0,0,1,0,0,1,1,1,1,0,1,1},
                {1,1,1,1,1,0,1,0,1,0,0,1},
                {1,0,0,1,0,1,1,0,1,1,1,1},
                {1,1,1,1,1,1,0,0,1,1,1,1},
                {0,1,0,1,0,1,0,1,1,1,1,1},
                {0,0,0,0,0,1,0,0,0,1,1,1},
        };
        System.out.println(Main.maxLength(matrix));


    }
    public static int maxLength(int [][] array) {
        int count = 0;
        int count2 = 0;
        int max = 0;
        int maxtemp;
        int maxtemp2;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++) {
                if(array[i][j] == 1){
                    count++;
                }else if(array[i][j] == 0){
                    count = 0;
                }
                maxtemp = count;
                if(max < maxtemp){
                    max = maxtemp;
                }
            }
            count = 0;
        }

        for (int i = 0; i < array.length; ++i){
            for (int j = 0; j < array[i].length; ++j){
                if(array[i][j] == 1){
                    count2++;
                }else if(array[i][j] == 0){
                    count2 = 0;
                }
                maxtemp2 = count2;
                if(max < maxtemp2){
                    max = maxtemp2;
                }
            }
        }
        return max;

    }
}
