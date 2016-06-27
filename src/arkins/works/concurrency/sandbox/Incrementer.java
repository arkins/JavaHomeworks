package arkins.works.concurrency.sandbox;

import java.util.Map;

/**
 * Created by kin.siu on 28/06/2016.
 */
public class Incrementer extends Thread {
    private Map<String, Integer> map;
    public Incrementer(Map<String, Integer> map) {
       this.map = map;
    }

    public void run() {
        for (int i = 0; i<10000; i++) {
            double d1 = Math.random();
            //if (d1 > 0.3 && d1 <0.5) {
                Integer temp = map.get("A");
                temp = temp + 1;
                map.put("A", temp);
                try {
                    Thread.sleep(Math.round(Math.random() * 10));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //System.out.println(this.getThreadGroup().getName() + " (after): " + temp);
                Integer temp1 = map.get("A");
                if (temp.compareTo(temp1) != 0) {
                    System.out.println("something is wrong");
                }
            //}
        }
    }
}
