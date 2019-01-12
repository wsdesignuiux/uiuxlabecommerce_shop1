package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.wolfsoft.uiuxlabecommerce_screen1.R;

import java.util.ArrayList;

import Model.Item_Activity2_Model;


/**
 * Created by wolfsoft3 on 30/8/18.
 */

public class Item_Comment_Activity2_Adapter extends RecyclerView.Adapter<Item_Comment_Activity2_Adapter.ViewHolder> {


    Context context;
    private ArrayList<Item_Activity2_Model> modelArrayList;

    public Item_Comment_Activity2_Adapter(Context context, ArrayList<Item_Activity2_Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment_activity2, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        holder.image.setImageResource(modelArrayList.get(position).getImage());
        holder.name.setText(modelArrayList.get(position).getStyle_name());


    }



    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView name;

        public ViewHolder(View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);

        }
    }
}
