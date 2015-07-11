package text.com.example.sample01;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	
	Button mButton[];
	
	int mib[]={
		R.id.button_0,R.id.button_1,R.id.button_2,R.id.button_3,
		R.id.button_4,R.id.button_5,R.id.button_6,R.id.button_7,
		R.id.button_8,R.id.button_9,R.id.button_AC,R.id.button_Hiku,
		R.id.button_Ikoru,R.id.button_Kake,R.id.button_Paseto,R.id.button_SeHu,
		R.id.button_Syousuu,R.id.button_Tasu,R.id.button_Waru
	};
	

	
	private final int Key_01 = 0;
	
	TextView mTextView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mTextView =(TextView)findViewByld(R.id.display);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
}
