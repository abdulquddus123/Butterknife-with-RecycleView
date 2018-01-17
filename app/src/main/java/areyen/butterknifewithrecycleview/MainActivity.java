package areyen.butterknifewithrecycleview;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.provider.ContactsContract.*;

public class MainActivity extends AppCompatActivity {
 @BindView(R.id.recyclerview)
 RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        List<Data> data = new ArrayList<>();
        for (int i = 0; i < 15; i++){
            data.add(new Data("ButterKnife Annotations", R.drawable.delaroystudios));
        }
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

       }
}
