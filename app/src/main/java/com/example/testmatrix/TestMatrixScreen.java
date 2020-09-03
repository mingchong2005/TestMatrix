package com.example.testmatrix;

import android.util.Log;

public class TestMatrixScreen {

	native void MatrixScreenShowGroupname(String groupname);
	native void MatrixScreenShowOneScreen(char screen_buffer[]);
	
	public void matrix_screen_show_groupname(String groupname) {
		Log.i("TestMatrixActivity", "groupname" + groupname);
		MatrixScreenShowGroupname(groupname);  
	}

	public void matrix_screen_show_one_screen(char screen_buffer[]) {
		Log.i("TestMatrixActivity", "screen_buffer" + screen_buffer);
		MatrixScreenShowOneScreen(screen_buffer);  
	}
	static {
		System.loadLibrary("TestMatrixScreen");
	}
}
