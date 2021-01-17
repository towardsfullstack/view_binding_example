package com.prezrohit.viewbindingexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.prezrohit.viewbindingexample.databinding.FragmentExampleBinding;

public class FragmentExample extends Fragment {

	private FragmentExampleBinding binding;

	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		binding = FragmentExampleBinding.inflate(inflater, container, false);

		binding.textView4.setText("ViewBinding");
		binding.textView5.setText("in Fragment");

		return binding.getRoot();
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();

		binding = null;
	}
}