package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Baitap_2 {
    @Test
    public void shouldAnswerWithTrue() {
//Given: gia trị pre-condition
       int n=5;
       boolean expectd=true;
//Then: so sanh ket qua thuc te va mong muon
       Assert.assertEquals(SNT(n),expectd);
       if(SNT(n)==expectd){
           System.out.println(" Result : Pass");
       }
       else System.out.println(" Result : Fail");
//When : kiem tra gia tri cua nhap vao
    }
    public static boolean SNT(int n) {
        if(n==0||n==1)
            return false;


        for (int i=2;i<=n-1;i++){

            if(n%i==0)
                return false;

        }

        return true;
    }
}
