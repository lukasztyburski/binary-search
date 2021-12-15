import java.util.List;

public class BinarySearch<T extends Comparable> {

    private final List<T> sortedList;

    public BinarySearch(List<T> sortedList) {
        this.sortedList = sortedList;
    }

    public int indexOf(T element) {
        int low = 0;
        int high = sortedList.size() - 1;

        return searchElement(element, low, high);
    }

    private int searchElement(T searchedElement, int low, int high) throws ValueNotFoundException {
        if (low > high) {
            throw new ValueNotFoundException("List do not contain searched value.");
        }

        int middle = (low + high) / 2;
        T currentElement = sortedList.get(middle);

        int comparisonResult = currentElement.compareTo(searchedElement);

        if (comparisonResult == 0) {
            return middle;
        } else if (comparisonResult > 0) {
            high = middle - 1;
            return searchElement(searchedElement, low, high);
        } else {
            low = middle + 1;
            return searchElement(searchedElement, low, high);
        }
    }
}
