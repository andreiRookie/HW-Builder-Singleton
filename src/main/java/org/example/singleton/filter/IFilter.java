package org.example.singleton.filter;

import java.util.List;

public interface IFilter<T> {
    List<T> filterOut(List<T> source);
}
