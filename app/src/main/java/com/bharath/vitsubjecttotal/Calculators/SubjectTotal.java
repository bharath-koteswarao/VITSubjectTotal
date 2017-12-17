package com.bharath.vitsubjecttotal.Calculators;

import android.widget.EditText;

/**
 * Created by bk on 12-07-2017 17:58 17:58.
 */

public class SubjectTotal {
    public int calculateT(EditText cat1, EditText cat2, EditText fat, EditText das) {
        int c1, c2, f, da;
        if ((cat1.getText().toString()).equals("")) {
            c1 = 0;
        } else {
            c1 = Integer.parseInt(cat1.getText().toString());
        }
        if ((cat2.getText().toString()).equals("")) {
            c2 = 0;
        } else {
            c2 = Integer.parseInt(cat2.getText().toString());
        }
        if ((fat.getText().toString()).equals("")) {
            f = 0;
        } else {
            f = Integer.parseInt(fat.getText().toString());
        }
        if ((das.getText().toString()).equals("")) {
            da = 0;
        } else {
            da = Integer.parseInt(das.getText().toString());
        }

        return (int) Math.floor(((c1 + c2) * 0.3) + da + (f * 0.4));
    }

    public int calculateTP(EditText cat1, EditText cat2, EditText fat, EditText das, EditText projectMarks, EditText theoryCredits) {
        int c1, c2, f, da, tcredits, project;
        if ((cat1.getText().toString()).equals("")) {
            c1 = 0;
        } else {
            c1 = Integer.parseInt(cat1.getText().toString());
        }
        if ((cat2.getText().toString()).equals("")) {
            c2 = 0;
        } else {
            c2 = Integer.parseInt(cat2.getText().toString());
        }
        if ((fat.getText().toString()).equals("")) {
            f = 0;
        } else {
            f = Integer.parseInt(fat.getText().toString());
        }
        if ((das.getText().toString()).equals("")) {
            da = 0;
        } else {
            da = Integer.parseInt(das.getText().toString());
        }
        if ((theoryCredits.getText().toString()).equals("")) {
            tcredits = 0;
        } else {
            tcredits = Integer.parseInt(theoryCredits.getText().toString());
        }
        if ((projectMarks.getText().toString()).equals("")) {
            project = 0;
        } else {
            project = Integer.parseInt(projectMarks.getText().toString());
        }

        return (int) Math.ceil(((tcredits - 1) * (((c1 + c2) * 0.3) + da + 0.4 * f) + project) / (tcredits));
    }

    public int calculateTL(EditText cat1, EditText cat2, EditText fat, EditText das, EditText totalCredits, EditText labTotal) {
        int c1, c2, f, da, tcredits, lab;
        if ((cat1.getText().toString()).equals("")) {
            c1 = 0;
        } else {
            c1 = Integer.parseInt(cat1.getText().toString());
        }
        if ((cat2.getText().toString()).equals("")) {
            c2 = 0;
        } else {
            c2 = Integer.parseInt(cat2.getText().toString());
        }
        if ((fat.getText().toString()).equals("")) {
            f = 0;
        } else {
            f = Integer.parseInt(fat.getText().toString());
        }
        if ((das.getText().toString()).equals("")) {
            da = 0;
        } else {
            da = Integer.parseInt(das.getText().toString());
        }
        if ((totalCredits.getText().toString()).equals("")) {
            tcredits = 0;
        } else {
            tcredits = Integer.parseInt(totalCredits.getText().toString());
        }
        if ((labTotal.getText().toString()).equals("")) {
            lab = 0;
        } else {
            lab = Integer.parseInt(labTotal.getText().toString());
        }

        return (int) Math.ceil(((tcredits - 1) * (((c1 + c2) * 0.3) + da + 0.4 * f) + lab) / (tcredits));

    }

    public int calculateTPL(EditText cat1, EditText cat2, EditText fat, EditText das, EditText theoryCredits, EditText projectMarks, EditText labMarks) {
        int c1, c2, f, da, tcredits, project, lab;
        if ((cat1.getText().toString()).equals("")) {
            c1 = 0;
        } else {
            c1 = Integer.parseInt(cat1.getText().toString());
        }
        if ((cat2.getText().toString()).equals("")) {
            c2 = 0;
        } else {
            c2 = Integer.parseInt(cat2.getText().toString());
        }
        if ((fat.getText().toString()).equals("")) {
            f = 0;
        } else {
            f = Integer.parseInt(fat.getText().toString());
        }
        if ((das.getText().toString()).equals("")) {
            da = 0;
        } else {
            da = Integer.parseInt(das.getText().toString());
        }
        if ((theoryCredits.getText().toString()).equals("")) {
            tcredits = 0;
        } else {
            tcredits = Integer.parseInt(theoryCredits.getText().toString());
        }
        if ((projectMarks.getText().toString()).equals("")) {
            project = 0;
        } else {
            project = Integer.parseInt(projectMarks.getText().toString());
        }
        if ((labMarks.getText().toString()).equals("")) {
            lab = 0;
        } else {
            lab = Integer.parseInt(labMarks.getText().toString());
        }

        return (int) Math.ceil(((tcredits - 2) * (((c1 + c2) * 0.3) + da + 0.4 * f) + project + lab) / (tcredits));

    }
}
