package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {
    Turtle zofka = new Turtle();

    public void nakresliPrasatko() {
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

    public void nakresliObrazec3(int size) {
        for (int i = 0; i < 72; i++) {
            zofka.move(size);
            zofka.turnRight(2.5);
            if (i % 6 == 0) {
                zofka.turnLeft(90);
                zofka.move(size*6);
                zofka.turnRight(180);
                zofka.move(size*6);
                zofka.turnLeft(90);
            }
            zofka.turnRight(2.5);
        }
    }

    public void nakresliSlunicko() {
        zofka.setLocation(100, 100);
        nakresliObrazec3(3);

    }
    public void nakresliPrasatko2() {
        zofka.move(50);
        zofka.turnLeft(135);
        zofka.move(35);
        zofka.turnLeft(90);
        zofka.move(35);
        zofka.turnRight(20);
        zofka.move(15);
        zofka.turnLeft(180);
        zofka.move(15);
        zofka.turnLeft(135);
        zofka.move(15);
        zofka.turnRight(180);
        zofka.move(15);
        zofka.turnRight(70);
        zofka.move(75);
        zofka.turnRight(70);
        zofka.move(15);
        zofka.turnRight(180);
        zofka.move(15);
        zofka.turnLeft(135);
        zofka.move(15);
        zofka.turnLeft(180);
        zofka.move(15);
        zofka.turnLeft(25);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(75);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(150);
        zofka.penDown();
    }

    public void nakresliDomecek() {

        zofka.move(79);
        zofka.turnLeft(45);
        zofka.move(40);
        zofka.turnLeft(45);
        zofka.turnLeft(45);
        zofka.move(40);
        zofka.turnLeft(45);
        zofka.turnLeft(90);
        zofka.move(53);
        zofka.turnRight(180);
        zofka.move(53);
        zofka.turnLeft(90);
        zofka.move(79);
        zofka.turnLeft(90);
        zofka.move(53);
        zofka.penUp();
        zofka.move(79);
        zofka.turnLeft(90);
        zofka.penDown();
    }
    public void nakresliA() {
        zofka.turnRight(30);
        zofka.move(120);
        zofka.turnRight(120);
        zofka.move(60);
        zofka.turnRight(120);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnRight(60);
        zofka.move(60);
        zofka.turnLeft(60);
        zofka.penUp();
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.penDown();
    }
    public void nakresliN(){
        zofka.move(100);
        zofka.turnRight(145);
        zofka.move(120);
        zofka.turnLeft(145);
        zofka.move(100);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.penDown();
    }
    public void nakresliD(){
        zofka.move(100);
        zofka.turnRight(90);
        for (int i = 0; i <20 ; i++) {
            zofka.move(8);
            zofka.turnRight(9);
        }
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(90);
        zofka.turnLeft(90);
        zofka.penDown();
    }
    public void nakresliY(){
        zofka.move(70);
        zofka.turnLeft(45);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(45);
        zofka.move(70);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(90);
        zofka.turnRight(90);
        zofka.penDown();


    }





    public void main(String[] args) {
        zofka.setLocation(110, 200);
        //nakresliPrasatko();
        //nakreliObrazec1();
        //nakresliObrazec2();
        zofka.setLocation(750, 100);
        //nakresliObrazec3(5);
        nakresliSlunicko();
        zofka.setLocation(200, 300);
        for (int i = 0; i < 5; i++) {
            nakresliDomecek();
        }
        zofka.setLocation(200, 500);
        nakresliDomecek();
        zofka.setLocation(300, 500);
        nakresliPrasatko2();
        zofka.setLocation(500, 500);
        zofka.turnLeft(90);
        nakresliDomecek();
        zofka.setLocation(200, 700);
        nakresliA();
        nakresliN();
        nakresliD();
        nakresliY();







    }


}
