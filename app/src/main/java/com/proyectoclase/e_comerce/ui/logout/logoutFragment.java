package com.proyectoclase.e_comerce.ui.logout;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.proyectoclase.e_comerce.MainActivity;
import com.proyectoclase.e_comerce.OutSideActivity;

public class logoutFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intent intent = new Intent(getActivity(), OutSideActivity.class);
        startActivity(intent);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
