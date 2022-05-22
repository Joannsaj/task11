package com.company;

enum TrafficLight{
    RED,GREEN,YELLOW
}
class Simulator{
    TrafficLight color = TrafficLight.RED;

    public void changeColor(){
        switch (color){
            case RED:
            color = TrafficLight.GREEN;
            break;
            case YELLOW:
            color = TrafficLight.RED;
            break;
            case GREEN:
            color = TrafficLight.YELLOW;
            break;
        }
    }
    public String toString(){return " "+ color;}
}
public class Task5 {
    public static void main(String[] args) {
        Simulator t1 = new Simulator();
        for (int i=0; i<9; i++){
            System.out.println(t1);
            t1.changeColor();
        }
    }
}
