import java.util.Arrays;

public class Theatre {

    private String[][] seatMap;

    public String[][] getSeatMap() {
        return seatMap;
    }

    public Theatre() {
        seatMap = new String[10][10];


        for(int x = 0; x < 10; x ++) {
            for (int y = 0; y < 10; y++) {
                seatMap[x][y] = Integer.toString(x + 1) + "." + Integer.toString(y + 1);
            }
        }
    }

        public static void main(String[] args){
            System.out.print("test");
            Theatre t = new Theatre();

            System.out.print("test");
            System.out.println(Arrays.deepToString(t.getSeatMap()));
        }

    }




