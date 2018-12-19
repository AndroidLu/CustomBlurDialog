package com.muaedu.basis.cutomblurdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.Toast;

public class SampleDialogFragment extends BlurDialogFragment {

    public static SampleDialogFragment newInstance() {
        return new SampleDialogFragment();
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Blur dialog");
        builder.setMessage("Do you know?");
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getContext(),"点击as  ",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getContext(),"点击ew  ",Toast.LENGTH_SHORT).show();
            }
        });
        return builder.create();
    }

    @Override
    protected boolean isDimmingEnable() {
        return true;
    }

    @Override
    protected boolean isActionBarBlurred() {
        return true;
    }

    @Override
    protected float getDownScaleFactor() {
        return 4;
    }

    @Override
    protected int getBlurRadius() {
        return 2;
    }
}
