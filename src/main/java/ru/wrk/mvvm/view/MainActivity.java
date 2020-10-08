package ru.wrk.mvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import ru.wrk.mvvm.R;
import ru.wrk.mvvm.databinding.ActivityMainBinding;
import ru.wrk.mvvm.viewmodel.UserViewModel;

public class MainActivity extends AppCompatActivity {
    UserViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new UserViewModel();
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setViewModel(new UserViewModel());

    }
}