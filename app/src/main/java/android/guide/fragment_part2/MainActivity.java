package android.guide.fragment_part2;
//   todo 0 this project show you how to make an advanced coding fragment

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
//    do this for best practice
    public MainActivity() {
        super(R.layout.activity_main);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        check if the app has opened for the first time(i.e activity life cycle = on create)
        if (savedInstanceState == null) {
//        todo 6 : link fragment with container in the MainActivity
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, FragmentA.class, null)
                    .commit();
        }
    }
}