package com.tpsoft.android.calculate;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SphereActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sphere);
		
		// Edit 
		final EditText et = (EditText) findViewById(R.id.EditTextHigh);
		// Button 
		final Button btn = (Button) findViewById(R.id.btnCalculateCicle1);
		// Text View
		final TextView tv = (TextView) findViewById(R.id.CicletextView1);
		// Perform form action on click
		
	 	btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				String str = et.getText().toString();
				try{
					Double r1 = Double.parseDouble(str);
					Double Volume = (4/3)*Math.PI*Math.pow(r1, 3);
					Double Surface = 4*Math.PI*Math.pow(r1, 2);
					if(r1 <=1000){
					tv.setText("Volume of the sphere :" + Volume +"\nSurface area of the sphere :" + Surface);
					}else{
					tv.setText("You Can Input Maximum 1000");
						}		
					}catch (NumberFormatException ex) { 
						et.setText("Error");
					}	
			}
		});
	}
}
