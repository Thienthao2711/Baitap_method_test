package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Baitap_1 {

    @Test
    public void shouldAnswerWithTrue() {
        // Given: gia tri pre-condition
        int arrNumber[] = {1, 1, 2, 3, 5, 7, 6, 8, 1, 2};
        int numberActual = 3;
        int numberExpected = 1;
        // Then : so sanh ket qua thuc te voi qua trinh mong muon.
        Assert.assertEquals(Demphantunhapvao(arrNumber, numberActual), numberExpected);
        if(Demphantunhapvao(arrNumber,numberActual)==numberExpected){
            System.out.println(" Result : Pass");
        }
       else System.out.println("Result: Fail");


    }
//When: kiem tra gia tri duoc input vao co trong mang khong va so lan xuat hien
    public int Demphantunhapvao(int arrNumber[], int numberActual) {
        int dem = 0;
        for (int i : arrNumber) {
            if (i == numberActual)
            dem++;
        }
        return dem;

    }


}
