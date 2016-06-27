package arkins.works.concurrency.sandbox;

import net.openhft.chronicle.map.*;

import java.util.Map;

public class MultiThreadTest {
    public Map<String, Integer> map;

    public MultiThreadTest() {
        map = ChronicleMapBuilder.of(String.class, Integer.class).create();
    }

    public static void main(String args[]) {
        MultiThreadTest mt = new MultiThreadTest();
        mt.map.put("A", 1);

        Incrementer t1 = new Incrementer(mt.map);
        Incrementer t2 = new Incrementer(mt.map);
        Incrementer t3 = new Incrementer(mt.map);
        Incrementer t4 = new Incrementer(mt.map);
        Incrementer t5 = new Incrementer(mt.map);
        Incrementer t6 = new Incrementer(mt.map);
        Incrementer t7 = new Incrementer(mt.map);
        Incrementer t8 = new Incrementer(mt.map);
        Incrementer t9 = new Incrementer(mt.map);

        t1.run();
        t2.run();
        t3.run();
        t4.run();
        t5.run();
        t6.run();
        t7.run();
        t8.run();
        t9.run();
    }
}