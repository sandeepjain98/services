package com.mycompany.test;


 public class PingPong {

  public void checkAvailability(int numOfplayers,int input[][] ) {

  //  public static void main(String args[]) {
        int timeTableForADay[] = new int[24];
        int numOfSingles = 0;
        int numOfDoubles = 0;
        
//        int input[][] = {
//                { 9, 14 },
//                { 15, 17 },
//                { 12, 13},
//                { 16, 18},
//                { 10, 15},
//                { 14, 16},
//                { 9, 13},
//                { 9, 15}
//        };
//          int numOfplayers = 8;

        for (int i = 0; i < numOfplayers; i++) {
            int startOfHour = input[i][0];
            int endOfHour = input[i][1];
            fillTheTime(timeTableForADay, startOfHour, endOfHour);
        }

        for (int t = 0; t < timeTableForADay.length; t++) {
            if (timeTableForADay[t] >= 4) {
                ++numOfDoubles;
            } else if (timeTableForADay[t] > 1 && timeTableForADay[t] < 4) {
                ++numOfSingles;
            }


        }
        System.out.println("Number Of Singles:" + numOfSingles);
        System.out.println("Number Of Duobles:" + numOfDoubles);
    }

    static void fillTheTime(int timeTableForADay[], int start, int end) {

        for (int k = start; k < end; k++) {
            ++timeTableForADay[k - 1];
        }
    }


}
