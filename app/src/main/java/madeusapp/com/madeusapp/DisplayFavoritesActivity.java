package madeusapp.com.madeusapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DisplayFavoritesActivity extends AppCompatActivity {
    private List<Place> PlaceList = new ArrayList<>();
    private RecyclerView recyclerView;
    private CustomAdapter mAdapter;
    Firebase ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Firebase.setAndroidContext(this);
        ref = new Firebase("https:madeupapp.firebaseio.com/");
        setContentView(R.layout.activity_display_favorites);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new CustomAdapter(PlaceList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareHotelsData();
    }

    private void prepareHotelsData() {
        ref.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Map<String, Object> newPlace = (Map<String,Object>)dataSnapshot.getValue();
                String name1 = String.valueOf(newPlace.get("Name"));
                String vicinity1 = String.valueOf(newPlace.get("Vicinity"));
                System.out.println("Message: " + newPlace.get("name"));
                System.out.println("Name: " + newPlace.get("vicinity"));

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                Map<String, Object> newPlace = (Map<String,Object>)dataSnapshot.getValue();
                String name1 = String.valueOf(newPlace.get("Name"));
                String vicinity1 = String.valueOf(newPlace.get("Vicinity"));
                System.out.println("Message: " + newPlace.get("name"));
                System.out.println("Name: " + newPlace.get("vicinity"));


            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

  /*      ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                    Place favPlace = new Place();
                dataSnapshot.getValue();

                System.out.println(dataSnapshot.getValue());
                    favPlace.setName(dataSnapshot.child("Place").getValue().toString());
                   favPlace.setVicinity(dataSnapshot.child("Place").getValue().toString());
//                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
//                    //Getting the data from snapshot
//                    Place place = postSnapshot.getValue(Place.class);
//                    String name = place.getName();
//                    String vicinity = place.getVicinity();
//                    Place favPlace = new Place();
//                    favPlace.setName(name);
//                    favPlace.setVicinity(vicinity);
                    PlaceList.add(favPlace);
                }


            @Override
            public void onCancelled(FirebaseError firebaseError) {
            System.out.println("The read failed: " + firebaseError.getMessage());
            }
        });
*/
    }
}
