package org.example.singleton.filter;

import java.util.List;

interface IFilter<T> {
    List<T> filterOut(List<T> source);
}
