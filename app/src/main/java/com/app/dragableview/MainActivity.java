package com.app.dragableview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.app.dragable_views.DraggableViewMain;
import com.app.dragable_views.OnViewSelection;

public class MainActivity extends AppCompatActivity implements OnViewSelection {

    private ImageView imgFacebook, imgGoogle, imgLinkedIn;
    private RelativeLayout rlDestination;
    private DraggableViewMain draggableViewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        draggableViewMain = new DraggableViewMain(this, rlDestination);
        draggableViewMain.addView(imgFacebook);
        draggableViewMain.addView(imgGoogle);
        draggableViewMain.addView(imgLinkedIn);
    }

    private void initView() {
        imgFacebook = (ImageView) findViewById(R.id.imgFacebook);
        imgGoogle = (ImageView) findViewById(R.id.imgGoogle);
        imgLinkedIn = (ImageView) findViewById(R.id.imgLinkedIn);

        rlDestination = (RelativeLayout) findViewById(R.id.rlDestination);
    }

    @Override
    public int viewSelectedPosition(int position) {

        if (position == 0) {
            //do after view one dragged
            Toast.makeText(this, "Login with Facebook", Toast.LENGTH_SHORT).show();
        } else if (position == 1) {
            //do after view two dragged
            Toast.makeText(this, "Login with Google", Toast.LENGTH_SHORT).show();
        } else if (position == 2) {
            //do after view three dragged
            Toast.makeText(this, "Login with LinkedIn", Toast.LENGTH_SHORT).show();
        }
        return position;
    }
}
