import java.util.Arrays;

public class Seatmap {

    private String[][] seatMap;


    public String[][] getSeatMap() {
        return seatMap;
    }

    public Seatmap() {
        seatMap = new String[9][9];


        for(int x = 0; x < 9; x ++) {
            for (int y = 0; y < 9; y++) {
                seatMap[x][y] = Integer.toString(x + 1) + "." + Integer.toString(y + 1);
            }
        }


    }

        public void Showseatmap(){

            System.out.println("Screen" + '\n' + "___________________________________" + '\n');
            for (int i = 0; i < getSeatMap().length; i++) {
                for (int j = 0; j < getSeatMap()[i].length; j++) {
                    System.out.print(getSeatMap()[i][j] + " ");
                }
                System.out.println();
            }
        }


    }




