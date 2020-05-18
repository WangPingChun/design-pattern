package com.net4w.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        final List<College> colleges = new ArrayList<>();
        colleges.add(new ComputerCollege());
        colleges.add(new InfoCollege());

        final OutPutImpl outPut = new OutPutImpl(colleges);
        outPut.printCollege();
    }
}
