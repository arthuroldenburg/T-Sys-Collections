import java.util.ArrayList;
import java.util.Arrays;

public class DataAnalysis<T> {
    private ArrayList<T> data;

    public DataAnalysis(){
        data = new ArrayList<>();
    }

    public void add(T item){
        data.add(item);
    }

    public void addMany(T[] items){
        data.addAll(Arrays.asList(items));
    }

    public void remove(T item){
        data.remove(item);
    }

    public void removeMany(T[] items){
        data.removeAll(Arrays.asList(items));
    }

    public void displayData(){
        for(T item : data){
            System.out.println(item);
        }
    }

    public void displayTypeOfData() {
        for(T item : data){
            System.out.println(item.getClass().getSimpleName());
        }
    }
}
