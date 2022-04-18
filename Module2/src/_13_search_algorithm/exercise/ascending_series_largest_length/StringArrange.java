package _13_search_algorithm.exercise.ascending_series_largest_length;

import java.util.Iterator;
import java.util.LinkedList;

public class StringArrange {
    private String input;
    LinkedList<Character> list = new LinkedList<>();
    LinkedList<Character> max = new LinkedList<>();

    public StringArrange() {
    }

    public StringArrange(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getShortString() {
        for (int index = 0; index < input.length(); index++) {
            if (isNotContinuous(index)) {
                list.clear();
            }
            list.add(input.charAt(index));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        return concatChar(max);
    }

    private boolean isNotContinuous(int index) {
        if (list.size() > 1) {
            if (input.charAt(index) <= list.getLast()) {
                return list.contains(input.charAt(index));
            }
        }
        return false;
    }

    private String concatChar(LinkedList<Character> list) {
        StringBuilder result = new StringBuilder();
        Iterator<Character> iterator = list.iterator();
        while (iterator.hasNext()) {
            result.append(iterator.next());
        }
        return result.toString();
    }
}

