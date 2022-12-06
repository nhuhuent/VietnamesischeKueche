package com.example.vietnamesichekche;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import de.hdodenhof.circleimageview.CircleImageView;

// 1. class FilterNameAdapter create ; 3. extends RecyclerView.Adapter
public class FilterNameAdapter extends RecyclerView.Adapter<FilterNameAdapter.FilterNameViewHolder>{

    private List<FilterName> mListFilterName;

    public FilterNameAdapter (List<FilterName> mListFilterName) {
        this.mListFilterName = mListFilterName;
    }

    @NonNull
    @Override
    public FilterNameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_search_filter, parent, false);
        return new FilterNameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilterNameViewHolder holder, int position) {
        FilterName filterName = mListFilterName.get(position);
        if (filterName== null){
            return;
        }
        holder.imgGerichteName.setImageResource(filterName.getImage());
        holder.textViewDeutschName.setText(filterName.getDeutschName());
        holder.textViewVietnamName.setText(filterName.getVietnamName());
    }

    @Override
    public int getItemCount() {
        if(mListFilterName !=null){
            return mListFilterName.size();
        }
        return 0;
    }
    // 2. class GerichteNameViewHolder create
    public class FilterNameViewHolder extends RecyclerView.ViewHolder {

        private CircleImageView imgGerichteName;
        private TextView textViewDeutschName;
        private TextView textViewVietnamName;

        public FilterNameViewHolder(@NonNull View itemView) {
            super(itemView);
            imgGerichteName= itemView.findViewById(R.id.img_recipe);
            textViewDeutschName = itemView.findViewById(R.id.deutsch_name);
            textViewVietnamName = itemView.findViewById(R.id.vietnam_name);
        }
    }
}
