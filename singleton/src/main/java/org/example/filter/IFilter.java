package org.example.filter;

import java.util.List;

public interface IFilter<T> {
    List<T> filterOut(List<T> source);
}
