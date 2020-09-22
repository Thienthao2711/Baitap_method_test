package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Baitap_4 {
    @Test
    public void shouldAnswerWithTrue() {
        int mangA[] = {1, 2, 3, 4};
        int mangB[] = {9, 5, 6};
        int Expectedtong = 30;
        Assert.assertEquals(tongmangAvaB(mangA,mangB),Expectedtong);
        System.out.println("in ra tong :" + tongmangAvaB(mangA, mangB));
        if(tongmangAvaB(mangA,mangB)==Expectedtong){
            System.out.println(" Result : Pass");
        }
        else System.out.println(" Result : Fail ");

    }

    public int tongmangAvaB(int mangA[], int mangB[]) {
        int tongA = 0;
        int tongB = 0;
        for (int i = 0; i < mangA.length; i++) {
            tongA += mangA[i];
        }
        for (int j = 0; j < mangB.length; j++) {
            tongB += mangB[j];
        }
        int tong = tongA + tongB;
        return tong;
    }

}