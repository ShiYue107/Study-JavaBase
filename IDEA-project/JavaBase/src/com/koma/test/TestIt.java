package com.koma.test;

import javafx.beans.value.ChangeListener;

/**
 * @author 锋
 * @version 1.0
 * description:
 */
public class TestIt {
    public static void main ( String[] args ) {
        int[] myArray = {1, 2, 3, 4, 5};
        ChangeIt.doIt( myArray );
        for(int j=0; j<myArray.length; j++) {
            System.out.print(myArray[j] + " ");
        }
    }
}
class ChangeIt {
    static void doIt( int[] z ) {
        z = null ;
    }
}