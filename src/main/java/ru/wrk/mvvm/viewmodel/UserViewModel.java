package ru.wrk.mvvm.viewmodel;

import android.content.Intent;
import android.view.View;

import androidx.databinding.ObservableField;

import java.util.Observable;

import ru.wrk.mvvm.model.User;
import ru.wrk.mvvm.view.ProfileActivity;

public class UserViewModel extends User {
    public ObservableField<String> login;
    public ObservableField<String> password;

    public UserViewModel()
    {
        login = new ObservableField();
        password = new ObservableField();
    }

    public void onClick(View view) {
        User user;
        if (login.get().contains("@"))
        {
            user = new User(1, "Имя не известно",login.get(),password.get());
        }
        else
        {
            user = new User( 1, "Email не известен" ,login.get(),password.get());
        }
        Intent Intent = new Intent(view.getContext(), ProfileActivity.class );
        Intent.putExtra("id",user.id);
        Intent.putExtra("name",user.name);
        Intent.putExtra("email",user.email);
        Intent.putExtra("password",user.password);
        view.getContext().startActivity(Intent);

    }
}
