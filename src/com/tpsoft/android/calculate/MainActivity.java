
package com.tpsoft.android.calculate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	Integer[] arrImg = {
            R.drawable.ic_circle,
            R.drawable.ic_sphere,
            R.drawable.ic_triangle,
            R.drawable.ic_square,
            R.drawable.ic_trapezoid,
            R.drawable.ic_cylinder,
            R.drawable.ic_cone
            };
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main);
		

		final ListView   lv1 = (ListView) findViewById(R.id.listView1);
		 lv1.setAdapter(new ImageAdapter(this));
		lv1.setOnItemClickListener(new OnItemClickListener() {
		   public void onItemClick(AdapterView<?> a, View v, int position,
		     long id) {
			   lv1.getItemIdAtPosition(position);
			  
			   switch (position) {
			case 0:
					Intent intenCicle = new Intent(MainActivity.this, CircleActivity.class);
					startActivity(intenCicle);
				break;
			case 1:
				Intent intenSphere = new Intent(MainActivity.this, SphereActivity.class);
				startActivity(intenSphere);
				break;
			case 2:
				Intent intenTriangle = new Intent(MainActivity.this,TriangleActivity.class);
				startActivity(intenTriangle);
				break;
			case 3:
				Intent intenSquare = new Intent(MainActivity.this,SquareActivity.class);
				startActivity(intenSquare);
				break;
			case 4:
				Intent intenTrapezoid = new Intent(MainActivity.this,TrapezoidActivity.class);
				startActivity(intenTrapezoid);
				break;	
			case 5:
				Intent intenCylindrical = new Intent(MainActivity.this,CylindricalActivity.class);
				startActivity(intenCylindrical);
				break;
			case 6:
				Intent intenCone = new Intent(MainActivity.this, ConeActivity.class);
				startActivity(intenCone);
				break;
			default:
				break;
			}
		   }
		 });
	}
	
	   public class ImageAdapter extends BaseAdapter 
       {
           private Context context;
    
           public ImageAdapter(Context c) 
           {
                   // TODO Auto-generated method stub
               context = c;
           }
    
           public int getCount() {
                   // TODO Auto-generated method stub
               return arrImg.length;
           }
    
           public Object getItem(int position) {
                   // TODO Auto-generated method stub
               return position;
           }
    
           public long getItemId(int position) {
                   // TODO Auto-generated method stub
               return position;
           }

      public View getView(int position, View convertView, ViewGroup parent) {
          LayoutInflater inflater = (LayoutInflater) context
                  .getSystemService(Context.LAYOUT_INFLATER_SERVICE); 
                    if (convertView == null) {
                          convertView = inflater.inflate(R.layout.main_column, null); 
                    }
                                                  
                                  // ColImage
                    ImageView imageView = (ImageView) convertView.findViewById(R.id.ColImage);
                    imageView.getLayoutParams().height = 80;
                    imageView.getLayoutParams().width = 80;
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    imageView.setImageResource(arrImg[position]);
                                  
                    // ColPosition
                    TextView txtPosition = (TextView) convertView.findViewById(R.id.ColPosition);
                    txtPosition.setPadding(10,0,0,0);
                    TextView txtPicName = (TextView) convertView.findViewById(R.id.ColPosition);
                    txtPicName.setPadding(10, 0, 0, 0);
        
                    switch (position) {
              		case 0:txtPicName.setText("Circle\naera,circumfernce");
              		break;
              		case 1:txtPicName.setText("Sphere\ncapacity,surface");
              		break;
              		case 2:txtPicName.setText("Trangle\narea");
              		break;
              		case 3:txtPicName.setText("Square\narea");
              		break;
              		case 4:txtPicName.setText("Trapezoid\narea");  // Trapezoid
              		break;
              		case 5:txtPicName.setText("Cylindrical\nvolume");  
              		break;
              		case 6:txtPicName.setText("Cone\nvolume");
              		break;
              		default:  txtPicName.setText("Another");
              		break;
              }
              
              return convertView;
                      
      }

   } 
}
	
	
	
	

			


	