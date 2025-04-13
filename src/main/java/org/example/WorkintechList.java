package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<T extends Comparable<T>> extends ArrayList<T> {

    @Override
    public boolean add(T element) {
        if (!this.contains(element)) {
            boolean result = super.add(element);
            this.sort();
            return result;
        }
        return false;
    }

    @Override
    public void add(int index, T element) {
        if (!this.contains(element)) {
            super.add(index, element);
            this.sort();
        }
    }

    @Override
    public boolean addAll(java.util.Collection<? extends T> c) {
        boolean changed = false;
        for (T item : c) {
            if (!this.contains(item)) {
                super.add(item);
                changed = true;
            }
        }
        if (changed) {
            this.sort();
        }
        return changed;
    }

    public void sort() {
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object o) {
        boolean result = super.remove(o);
        if (result) {
            this.sort();
        }
        return result;
    }
}
