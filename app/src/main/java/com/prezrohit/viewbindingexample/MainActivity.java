package com.prezrohit.viewbindingexample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prezrohit.viewbindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

	// Make this a member to enable its use in the whole Activity
	private ActivityMainBinding binding;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		binding = ActivityMainBinding.inflate(getLayoutInflater());
		setContentView(binding.getRoot());

		binding.textView1.setText("ViewBinding");
		binding.textView2.setText("is cool");

		binding.button.setOnClickListener(v -> {
			getSupportFragmentManager()
					.beginTransaction()
					.add(R.id.fragment_container, new FragmentExample())
					.addToBackStack(null)
					.commit();
		});
	}
}