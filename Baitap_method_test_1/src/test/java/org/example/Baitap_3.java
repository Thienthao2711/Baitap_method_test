package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Baitap_3 {
    @Test
    public void shouldAnswerWithTrue() {
        int manga[] = {1, 2, 3, 4,5,6,7,8};
        int actual =0;
        boolean expeted= true;
        Assert.assertEquals(Kiemtrasonguyento(actual),expeted);



    }

    public boolean Kiemtrasonguyento(int actual){
        if(actual<2){
            return false;
        }

for (int i=2; i < Math.sqrt(actual);i++){
    if(actual%i==0){
        return false;
    }

}
return true;

    }

}
