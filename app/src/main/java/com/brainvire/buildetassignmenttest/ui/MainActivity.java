package com.brainvire.buildetassignmenttest.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.brainvire.buildetassignmenttest.R;
import com.brainvire.buildetassignmenttest.adapter.BuilderItemAdapter;
import com.brainvire.buildetassignmenttest.viewModel.UserViewModel;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private BuilderItemAdapter builderItemAdapter;
    private UserViewModel userViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        builderItemAdapter = new BuilderItemAdapter();
        recyclerView.setAdapter(builderItemAdapter);

        userViewModel = new UserViewModel();
        userViewModel.getUsers();
    }
}