package arkins.works.concurrency.sandbox;

/**
 * Created by kin.siu on 28/06/2016.
 */
public class DataModel {
    private int valueCount;
    private String key;

    public DataModel(String key, int valueCount) {
        this.key = key;
        this.valueCount = valueCount;
    }

    public void increaseCount() {
        valueCount = valueCount + 1;
    }


}
