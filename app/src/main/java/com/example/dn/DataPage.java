package com.example.dn;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import java.io.FileInputStream;

public class DataPage extends ActionBarActivity {


    FileInputStream fis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_page);

        /*String[] list = fileList();
        if(list.length != 0){
            System.out.println("THERE ARE " + list.length + " FILES");
        for(String x : list) {
            Bitmap bitty = null;
            try {
                 fis = openFileInput(x);

                byte[] r = x.getBytes();

                Bitmap bitmap = BitmapFactory.decodeFile("/path/images.jpg");
                ByteArrayOutputStream blob = new ByteArrayOutputStream();
                bitmap.compress(CompressFormat.PNG, 0 /*ignored for PNG, blob);
                byte[] bitmapdata = blob.toByteArray();
//if bitmapdata is the byte array then getting bitmap goes like this

                bitty = BitmapFactory.decodeByteArray(r, 0, r.length);

                fis.close();


            } catch (Exception e) {
                e.printStackTrace();
            }



            ImageView iv = new ImageView(this);
            iv.setImageBitmap(bitty);
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.relative1);

            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);

            rl.addView(iv, lp);
        }
        }
        else{
            System.out.println("THERE ARE NO FILES");
        }*/
    }
}
