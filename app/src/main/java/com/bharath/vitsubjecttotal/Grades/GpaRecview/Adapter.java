package com.bharath.vitsubjecttotal.Grades.GpaRecview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import com.bharath.vitsubjecttotal.R;
import com.jaredrummler.materialspinner.MaterialSpinner;

import java.util.List;

/**
 * Created by bk on 21-12-2017 23:20.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {
    List<GpaListItem> listdata;
    Context context;
    LayoutInflater inflater;

    public Adapter(Context context, List<GpaListItem> listdata) {
        this.listdata = listdata;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.gpa_recview_list_item, parent, false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        String[] grades = {"S", "A", "B", "C", "D", "E", "F", "N"};
        MaterialSpinner grade = holder.gradeSpinner;
        grade.setItems(grades);
        grade.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {
                Toast.makeText(context, "" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {
        EditText creditsEt;
        MaterialSpinner gradeSpinner;

        public Holder(View itemView) {
            super(itemView);
            creditsEt = (EditText) itemView.findViewById(R.id.gpaCreditsEt);
            gradeSpinner = (MaterialSpinner) itemView.findViewById(R.id.gradeSpinner);
        }

        @Override
        public void onClick(View view) {
            // todo Implement the data change reflector here
        }
    }
}
