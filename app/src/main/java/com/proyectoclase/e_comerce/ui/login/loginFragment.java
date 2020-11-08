package com.proyectoclase.e_comerce.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.snackbar.Snackbar;
import com.proyectoclase.e_comerce.MainActivity;
import com.proyectoclase.e_comerce.R;
import com.proyectoclase.e_comerce.ui.forgotPassword.forgotPasswordFragment;
import com.proyectoclase.e_comerce.ui.home.HomeFragment;
import com.proyectoclase.e_comerce.ui.register.registerFragment;

public class loginFragment extends Fragment {

    Button btnLogin;
    TextView txtForgotPass,txtRegister,txtMail,txtPass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_login, container, false);
        btnLogin = root.findViewById(R.id.btnlogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtMail.getText().toString().isEmpty() && txtPass.getText().toString().isEmpty()){
                    Snackbar.make(view,"Debe llenar todos los campos",Snackbar.LENGTH_LONG).show();
                }
                else{

                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);
                }
            }
        });
        txtForgotPass = root.findViewById(R.id.txtforgotpass);
        txtForgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment newFragment;
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                newFragment = new forgotPasswordFragment();
                transaction.replace(R.id.nav_host_outside_fragment, newFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        txtRegister = root.findViewById(R.id.txtregister);
        txtRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment newFragment;
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                newFragment = new registerFragment();
                transaction.replace(R.id.nav_host_outside_fragment, newFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        txtMail = root.findViewById(R.id.txtmail);
        txtPass = root.findViewById(R.id.txtpass);
        return root;
    }
}
