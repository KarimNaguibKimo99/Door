package com.example.android.door;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDoor(View view) {
        ImageView imageView =  findViewById(R.id.before_image_view);
        TextView textView =  findViewById(R.id.status_text_view);
        if (imageView.getTag() == "door_after") {
            imageView.setImageResource(R.drawable.before);
            imageView.setTag("door_before");
            textView.setText("the door is closed");
        } else {
            imageView.setImageResource(R.drawable.after);
            imageView.setTag("door_after");
            textView.setText("the door is opened");
        }
    }
        public void openWhiteDoor (View view) {
            ImageView imageView1 =  findViewById(R.id.before_image_view);
            TextView textView1 =  findViewById(R.id.status_text_view);
            if (imageView1.getTag() == "door_after") {
                imageView1.setImageResource(R.drawable.before_whitecdoor);
                imageView1.setTag("door_before");
                textView1.setText("the door is closed");
            } else {
                imageView1.setImageResource(R.drawable.after_whitedoor);
                imageView1.setTag("door_after");
                textView1.setText("the door is opened");
            }
        }
            public void openRedDoor (View view) {
                ImageView imageView2 =  findViewById(R.id.before_image_view);
                TextView textView2 = findViewById(R.id.status_text_view);
                if (imageView2.getTag() == "door_after") {
                    imageView2.setImageResource(R.drawable.before_reddoor);
                    imageView2.setTag("door_before");
                    textView2.setText("the door is closed");
                } else {
                    imageView2.setImageResource(R.drawable.after_reddoor);
                    imageView2.setTag("door_after");
                    textView2.setText("the door is opened");
                }
            }
                public void openBlackDoor (View view){
                    ImageView imageView3 =  findViewById(R.id.before_image_view);
                    TextView textView3 =  findViewById(R.id.status_text_view);
                    if (imageView3.getTag() == "door_after") {
                        imageView3.setImageResource(R.drawable.before_blackdoor);
                        imageView3.setTag("door_before");
                        textView3.setText("the door is closed");
                    } else {
                        imageView3.setImageResource(R.drawable.after_blackdoor);
                        imageView3.setTag("door_after");
                        textView3.setText("the door is opened");
                    }

                }
            }
