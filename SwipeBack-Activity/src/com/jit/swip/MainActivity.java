package com.jit.swip;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/**
 * 来自博客：http://my.oschina.net/jack1900/blog/295343
 */
public class MainActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void jump(View view) {
		startActivity(new Intent(this, SecondActivity.class));
	}

}
