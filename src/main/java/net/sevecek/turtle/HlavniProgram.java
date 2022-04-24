package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {
    Turtle zofka = new Turtle();

    public void nakresliPrasatko() {
        zofka.setLocation(110, 200);
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

    public void nakreliObrazec1() {
        zofka.setLocation(350, 100);
        for (int i = 0; i < 8; i++) {
            zofka.move(50);
            zofka.turnRight(45);
        }
    }
    public void nakresliObrazec2() {
        zofka.setLocation(550, 100);
        for (int i = 0; i < 72; i++) {
            zofka.move(6);
            zofka.turnRight(5);
        }
    }
    public void nakresliObrazec3() {
        zofka.setLocation(750, 100);
        for (int i = 0; i < 72; i++) {
            zofka.move(5);
            zofka.turnRight(2.5);
            if(i % 6 == 0) {
                zofka.turnLeft(90);
                zofka.move(30);
                zofka.turnRight(180);
                zofka.move(30);
                zofka.turnLeft(90);
            }
            zofka.turnRight(2.5);

        }
    }



    public void main(String[] args) {
        nakresliPrasatko();
        nakreliObrazec1();
        nakresliObrazec2();
        nakresliObrazec3();



    }


}
