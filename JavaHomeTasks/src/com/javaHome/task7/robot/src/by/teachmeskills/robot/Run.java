package com.javaHome.task7.robot.src.by.teachmeskills.robot;

import com.javaHome.task7.robot.src.by.teachmeskills.robot.hands.SamsungHand;
import com.javaHome.task7.robot.src.by.teachmeskills.robot.hands.SonyHand;
import com.javaHome.task7.robot.src.by.teachmeskills.robot.hands.ToshibaHand;
import com.javaHome.task7.robot.src.by.teachmeskills.robot.heads.SamsungHead;
import com.javaHome.task7.robot.src.by.teachmeskills.robot.heads.SonyHead;
import com.javaHome.task7.robot.src.by.teachmeskills.robot.heads.ToshibaHead;
import com.javaHome.task7.robot.src.by.teachmeskills.robot.legs.SamsungLeg;
import com.javaHome.task7.robot.src.by.teachmeskills.robot.legs.SonyLeg;
import com.javaHome.task7.robot.src.by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        Robot robot1 = new Robot(new SonyHead(1), new SamsungHand(2), new ToshibaLeg(3));
        robot1.action();
        Robot robot2 = new Robot(new ToshibaHead(5), new SonyHand(3), new SamsungLeg(1));
        robot2.action();
        Robot robot3 = new Robot(new SamsungHead(0), new ToshibaHand(7), new SonyLeg(1));
        robot3.action();


    }
}
