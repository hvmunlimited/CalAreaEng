package com.tpsoft.android.calculate;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CircleActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.circle);
		
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
					Double Area = Math.PI*Math.pow(r1, 2); // pi*r^2
					Double girth = 2*Math.PI*r1;			//  2*pi*r
					if(r1 <=1000){
					tv.setText("Area :" + Area +"\nCircumference:" + girth);
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
