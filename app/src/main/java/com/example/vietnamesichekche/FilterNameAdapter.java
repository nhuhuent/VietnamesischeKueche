package com.example.vietnamesichekche;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

// 1. class FilterNameAdapter create ; 3. extends RecyclerView.Adapter
public class FilterNameAdapter extends RecyclerView.Adapter<FilterNameAdapter.ViewHolder> implements Filterable {

    private List<FilterName> mListFilterName;
    private final List<FilterName> mListFilterNameOld;
    private InterfaceClickItemFilter interfaceClickItemFilter;

    public FilterNameAdapter(List<FilterName> mListFilterName, InterfaceClickItemFilter interfaceClickItemFilter) {
        this.mListFilterName = mListFilterName;
        this.mListFilterNameOld = mListFilterName;
        this.interfaceClickItemFilter = interfaceClickItemFilter;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // bring layout "item_filter" in View
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_filter, parent, false);
        return new ViewHolder(view);
    }

    // add Data on ViewHolder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FilterName filterName = mListFilterName.get(position);
        if (filterName== null){
            return;
        }
        holder.imgGerichteName.setImageResource(filterName.getImage());
        holder.textViewDeutschName.setText(filterName.getDeutschName());
        holder.textViewVietnamName.setText(filterName.getVietnamName());

        holder.layoutItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                interfaceClickItemFilter.onClickItemFilter(filterName);
            }
        });
    }

    @Override
    public int getItemCount() {
        if(mListFilterName !=null){
            return mListFilterName.size();
        }
        return 0;
    }

    // 2. class ViewHolder create to get Data
    public class ViewHolder extends RecyclerView.ViewHolder {
        private RelativeLayout layoutItem;
        private CircleImageView imgGerichteName;
        private final TextView textViewDeutschName;
        private final TextView textViewVietnamName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            layoutItem= itemView.findViewById(R.id.layout_item);
            imgGerichteName= itemView.findViewById(R.id.img_recipe);
            textViewDeutschName = itemView.findViewById(R.id.deutsch_name);
            textViewVietnamName = itemView.findViewById(R.id.vietnam_name);
        }
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {

                // keyword search on SearchView
                String strSearch = charSequence.toString();

                // if search-keyword empty
                if(strSearch.isEmpty()){
                    mListFilterName = mListFilterNameOld;
                }else{
                    List<FilterName> list = new ArrayList<>();
                    for (FilterName filterName : mListFilterNameOld){
                        // Name of the dish contains the character they are looking for, we add it to this 'list'
                        if (filterName.getDeutschName().toLowerCase().contains(strSearch.toLowerCase())){
                            list.add(filterName);
                        }
                    }
                    mListFilterName = list;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = mListFilterName;

                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                mListFilterName = (List<FilterName>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }
}
