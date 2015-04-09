import java.util.ArrayList;
import java.util.List;

public class ModelFinder {

    private float timeFindList;

    private float timeFindMap;

    private List<Integer> indexsList;

    private List<Integer> indexsMap;

    public ModelFinder() {
        indexsList = new ArrayList<Integer>();
    }

    public Float getTimeFindList() {
        return timeFindList;
    }

    public void setTimeFindList(float timeFindList) {
        this.timeFindList = timeFindList;
    }

    public Float getTimeFindMap() {
        return timeFindMap;
    }

    public void setTimeFindMap(float timeFindMap) {
        this.timeFindMap = timeFindMap;
    }

    public void addIndexList(Integer index) {
        indexsList.add(index);
    }

    public List<Integer> getIndexsList() {
        return this.indexsList;
    }

    public void addIndexMap(Integer index) {
        indexsMap.add(index);
    }

    public List<Integer> getIndexsMap() {
        return this.indexsMap;
    }
}
