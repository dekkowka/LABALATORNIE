package LABA11;

import java.util.*;

public class SpeedTest {
    private static final int ELEMENTS_COUNT = 100000;
    private static final int ELEMENTS_COUNT2 = 10000;
    public static void main(String[] args) {
        HashSet<Integer> hashSet  = new HashSet <>();
        SortedSet<Integer> sortedSet = new SortedSet<Integer>() {
            @Override
            public Comparator<? super Integer> comparator() {
                return null;
            }

            @Override
            public SortedSet<Integer> subSet(Integer fromElement, Integer toElement) {
                return null;
            }

            @Override
            public SortedSet<Integer> headSet(Integer toElement) {
                return null;
            }

            @Override
            public SortedSet<Integer> tailSet(Integer fromElement) {
                return null;
            }

            @Override
            public Integer first() {
                return null;
            }

            @Override
            public Integer last() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        } ; {
        };
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Время выполнения операции добавление элемента в начало HashSet: " + getInsertionTimeAtStartHashSet(hashSet) + " мс");
        System.out.println("Время выполнения операции удаление элемента в начале HashSet: " + getDeletionTimeAtStartHashSet(hashSet) + " мс");
        System.out.println("Время выполнения операции добавление элемента в конец HashSet: " + getInsertionTimeAtEndHashSet(hashSet) + " мс");
        System.out.println();
        System.out.println("Время выполнения операции добавление элемента в начало sortedSet: " + getInsertionTimeAtStartSortedSet(sortedSet) + " мс");
        System.out.println("Время выполнения операции удаление элемента в начале sortedSet: " + getDeletionTimeAtStartSortedSet(sortedSet) + " мс");
        System.out.println("Время выполнения операции добавление элемента в конец sortedSet: " + getInsertionTimeAtEndSortedSet(sortedSet) + " мс");
        System.out.println("Время выполнения операции удаление элемента в конце sortedSet: " + getDeletionTimeAtEndSortedSet(sortedSet) + " мс");

        System.out.println();
        System.out.println("Время выполнения операции добавление элемента в начало ArrayList: " + getInsertionTimeAtStart(arrayList) + " мс");
        System.out.println("Время выполнения операции удаление элемента в начале ArrayList: " + getDeletionTimeAtStart(arrayList) + " мс");
        System.out.println("Время выполнения операции добавление элемента в конец ArrayList: " + getInsertionTimeAtEnd(arrayList) + " мс");
        System.out.println("Время выполнения операции удаление элемента в конце ArrayList: " + getDeletionTimeAtEnd(arrayList) + " мс");
        System.out.println("Время выполнения операции добавление элемента в середину ArrayList: " + getInsertionTimeAtMiddle(arrayList) + " мс");
        System.out.println("Время выполнения операции удаление элемента в середине ArrayList: " + getDeletionTimeAtMiddle(arrayList) + " мс");
        System.out.println("Время получения элемента по индексу ArrayList: " + getSearchTime(arrayList) + " мс");
    }

    public static long getInsertionTimeAtStartHashSet(HashSet<Integer> hashSet) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            hashSet.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getInsertionTimeAtEndHashSet(HashSet<Integer> hashSet) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            hashSet.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
    public static long getInsertionTimeAtStartSortedSet(SortedSet<Integer> sortedSet) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            sortedSet.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getInsertionTimeAtEndSortedSet(SortedSet<Integer> sortedSet) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            sortedSet.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getInsertionTimeAtStart(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getInsertionTimeAtEnd(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getInsertionTimeAtMiddle(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.add(list.size() / 2, i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getDeletionTimeAtStartHashSet(HashSet<Integer> hashSet) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            hashSet.remove(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }


    public static long getDeletionTimeAtStart(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.remove(0);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getDeletionTimeAtEnd(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.remove(list.size() - 1);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getDeletionTimeAtMiddle(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.remove(list.size() / 2);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getSearchTime(List<Integer> list) {
        for(int i = 0; i < ELEMENTS_COUNT2; i++) {
            list.add(i);
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT2; i++) {
            list.get(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long getSearchTimeSortedSet(SortedSet<Integer> sortedSet) {
        for(int i = 0; i < ELEMENTS_COUNT2; i++) {
            sortedSet.add(i);
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT2; i++) {
            sortedSet.stream().peek(null);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    public static long getDeletionTimeAtStartSortedSet(SortedSet<Integer> sortedSet) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            sortedSet.remove(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getDeletionTimeAtEndSortedSet(SortedSet<Integer> sortedSet) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            sortedSet.remove(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}


