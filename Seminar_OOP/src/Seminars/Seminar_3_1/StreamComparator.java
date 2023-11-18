package Seminars.Seminar_3_1;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
        int resultOfComparing = Integer.compare(o1.getStudyGroupList().size(), (o2.getStudyGroupList().size()));
        if (resultOfComparing == 0) {
            return resultOfComparing;
        } else {
            return resultOfComparing;
        }
    }
}
