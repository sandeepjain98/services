package com.mycompany.test;

import org.junit.*;


public class PingPongTest {

   @Test
   public void checkScenarioOne()
   {
       PingPong pingPong=new PingPong();
         int input[][] = { {9, 11},  {12, 14},{13, 15},  {11, 18}, {14, 18}, {10, 14}, {15, 18}};
         int numOfplayers = 7;
       pingPong.checkAvailability(numOfplayers,input);
       int x=1;
   }
    @Test
    public void checkScenarioTwo()
    {
        PingPong pingPong=new PingPong();
        int input[][] = { { 9, 10 },
                {  9 ,12 },
                { 13 ,15 },
                { 10, 18 }
        };
        int numOfplayers = 4;
        pingPong.checkAvailability(numOfplayers,input);
    }
    @Test
    public void checkScenarioThree()
    {
        PingPong pingPong=new PingPong();
        int input[][] = {
                { 9,10 },
                { 9,12 },
                { 14,15 },
                { 16,18 },
                { 14,18 },
                { 10,13 },
                { 15,18 },
                { 10,14 },
                { 9 ,13 }
        };
        int numOfplayers = 9;
        pingPong.checkAvailability(numOfplayers,input);
    }
    @Test
    public void checkScenarioFour()
    {
        PingPong pingPong=new PingPong();
        int input[][] = {
                { 9, 14 },
                { 15, 17 },
                { 12, 13},
                { 16, 18},
                { 10, 15},
                { 14, 16},
                { 9, 13},
                { 9, 15}
        };
        int numOfplayers = 8;
        pingPong.checkAvailability(numOfplayers,input);
    }
}
