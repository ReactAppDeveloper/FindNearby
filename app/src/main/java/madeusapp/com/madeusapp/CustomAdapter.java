package madeusapp.com.madeusapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Harshita on 01/04/2016.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    private List<Place> placesList;
    private LayoutInflater layoutInflater;

    public CustomAdapter(List<Place> placesList){
        this.placesList = placesList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.hotel_list_row,parent,false);
//        CardView itemCardView = (CardView)layoutInflater.inflate(R.layout.list_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Place place = placesList.get(position);
        holder.name.setText(place.getName());
        holder.vicinity.setText(place.getVicinity());
    }

    @Override
    public int getItemCount() {
        return placesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView name,vicinity;

        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.Name);
            vicinity = (TextView) itemView.findViewById(R.id.Vicinity);
        }
    }
}
