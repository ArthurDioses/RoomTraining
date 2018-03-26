package com.example.adiosesr.projecttraining;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.example.adiosesr.projecttraining.database.AppDataBase;
import com.example.adiosesr.projecttraining.entity.Status;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    public static final String TAG =MainActivity.class.getName() ;
    @BindView(R.id.btnAddStatus)
    Button btnAddStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnAddStatus)
    public void btnAddStatus()
    {
        Status status = new Status();
        status.setDescStatus("Completado");

        AppDataBase.getAppDataBase(this).statusDao().addStatus(status);

        List<Status> statusList = AppDataBase.getAppDataBase(this).statusDao().getAllStatus();

        for (Status status1: statusList) {

            Log.d(TAG,"Por linea: "+ status1.getDescStatus());
        }
    }
}
