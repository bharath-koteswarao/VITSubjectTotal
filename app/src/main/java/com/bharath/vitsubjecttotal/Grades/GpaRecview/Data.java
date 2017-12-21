package com.bharath.vitsubjecttotal.Grades.GpaRecview;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bk on 21-12-2017 23:20.
 */

public class Data {
    Context context;
    char[] grades = {'S', 'A', 'B', 'C', 'D', 'E', 'F', 'N'};
    List<GpaListItem> list;

    public Data(Context context) {
        this.context = context;
        list = new ArrayList<>();
    }
    public List<GpaListItem> getList() {
        return null;
    }
}
