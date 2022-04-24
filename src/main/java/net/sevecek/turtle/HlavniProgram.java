package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {
    Turtle zofka = new Turtle();
    public void nakresliPrasatko(){
        zofka.setLocation(110,110);
        zofka.move(100);
        zofka.turnLeft(135);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.turnRight(20);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnLeft(135);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(70);
        zofka.move(150);
        zofka.turnRight(70);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnLeft(135);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnLeft(25);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(150);
        zofka.penDown();
    }
    public void nakreliObrazec1(){
zofka.setLocation(400, 200);
        for (int i = 0; i < 8; i++) {
            zofka.move(80);
            zofka.turnRight(45);
        }

    }



    public void main(String[] args) {
        //nakresliPrasatko();
        nakreliObrazec1();


    }


}
