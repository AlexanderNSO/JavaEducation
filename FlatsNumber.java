package com.Javarush;

import java.util.Scanner;

public class FlatsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("количество этажей = ");
        int floorsCount = sc.nextInt();
        System.out.print("количество подъездов = ");
        int entranceCount = sc.nextInt();
        System.out.print("Номер квартиры = ");
        int flatNumber = sc.nextInt();

        int flatsOnFloorCount = 4;
        int flatsInEntranceCount = flatsOnFloorCount * floorsCount;

        if (flatNumber <= (flatsInEntranceCount * entranceCount))
        {
            int entranceNumber = (int)Math.ceil((double)flatNumber / flatsInEntranceCount);
            int floorNumber = (((flatNumber - 1) % flatsInEntranceCount) / flatsOnFloorCount + 1);

            System.out.println("Подъезд = " + entranceNumber);
            System.out.println("Этаж =  " + floorNumber);


            if (flatNumber % flatsOnFloorCount == 0)
            {
                System.out.println("Квартира ближняя справа ");
            }
            else if (flatNumber % flatsOnFloorCount == 1)
            {
                System.out.println("Квартира ближняя слева");
            }
            else if (flatNumber % flatsOnFloorCount == 2)
            {
                System.out.println("Квартира дальняя слева");
            }
            else
            {
                System.out.println("Квартира дальняя справа");
            }
        }
        else
        {
            System.out.println("Квартиры нет в этом доме");
        }
    }
}
