package se.eda095.plumpkortspel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
<<<<<<< HEAD
**////***
=======
	
	public static void main (String args[]){
		System.out.println("test2hej");
	}

	public void test() {
		
	}

	
	public static int getNbr(String a){
		return 2;
	}
>>>>>>> 8873b94e5b93a9ae6b60da12e37d4105d781edf7
}
