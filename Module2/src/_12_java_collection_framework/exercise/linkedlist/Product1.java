package _12_java_collection_framework.exercise.linkedlist;

import java.util.Comparator;

public class Product1 implements Comparator<ProductManagement> {
    @Override
    public int compare(ProductManagement o1, ProductManagement o2) {
        if (o1.getPrice() < o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() < o2.getPrice()) {
            return -1;
        }
        return 0;
    }
}

