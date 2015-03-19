ackage test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PriorityList {

    private List<ListEntry> priorityList = new ArrayList<ListEntry>();

    public List<Double> getList(){
        List<Double> returnValue = new ArrayList<Double>();

        Collections.sort(priorityList, new EntryComparator());
        for (ListEntry entry : priorityList){
            returnValue.add(entry.value);
        }
        return returnValue;
    }

    class ListEntry{
        int priority;
        double value;

        ListEntry(int priority, double value){
            this.priority = priority;
            this.value = value;
        }
    }

    class EntryComparator implements Comparator<ListEntry>{

        @Override
        public int compare(ListEntry e1, ListEntry e2) {
            return e2.priority - e1.priority;
        }

    }
}
