package ru.wrk.mvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import ru.wrk.mvvm.R;
import ru.wrk.mvvm.databinding.ActivityMainBinding;
import ru.wrk.mvvm.databinding.ActivityProfileBinding;
import ru.wrk.mvvm.model.User;
import ru.wrk.mvvm.viewmodel.UserViewModel;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_profile);
        int id = getIntent().getIntExtra("id",0);
        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String password = getIntent().getStringExtra("password");

        User user = new User(id,name,email,password);

        ActivityProfileBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_profile);
        binding.setModel(new UserViewModel());
    }
}