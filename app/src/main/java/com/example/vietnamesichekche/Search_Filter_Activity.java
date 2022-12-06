package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

public class Search_Filter_Activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FilterNameAdapter filterNameAdapter;
    private SearchView searchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_filter);

        // back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView =(RecyclerView) findViewById(R.id.recyclerView_filter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        // getListName() call
        filterNameAdapter = new FilterNameAdapter(getListName());
        recyclerView.setAdapter(filterNameAdapter);

        // sepatator line between dishes
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);
    }


    // FilterName with 3 parameter
    private List<FilterName> getListName() {
        List<FilterName> list = new ArrayList<>();

        // add Reis Gerichte
        list.add(new FilterName(R.drawable.reis_comtam, "Gebrochener Reis mit gegrilltem Kotelett", "(Cơm Tấm)"));
        list.add(new FilterName(R.drawable.reis_boluclac, "Geschwenktes Rindfleisch", "(Bò Lúc Lắc)"));
        list.add(new FilterName(R.drawable.reis_canhchuanamchay, "Vegetarische Sauersuppe", "(Canh Chua Nấm Chay)"));
        list.add(new FilterName(R.drawable.reis_comgaluoc, "Gekochtes Huhn mit Reis", "(Cơm Gà Luộc)"));
        list.add(new FilterName(R.drawable.reis_comvitquay, "Grillente mit Reis", "(Cơm Vịt Quay)"));
        list.add(new FilterName(R.drawable.reis_dauhurimtom, "Gebratene Tofu mit Garnele", "(Đậu Hũ Rim Tôm)"));
        list.add(new FilterName(R.drawable.reis_gaxaosaot, "Gebratenes Hühnchen mit Zitronengras", "(Gà Xào Sả Ớt"));
        list.add(new FilterName(R.drawable.reis_comchienduongchau, "Gebratener Reis mit Ei, Garnele und Gemüse", "(Cơm Chiên Dương Châu)"));
        list.add(new FilterName(R.drawable.reis_dauhusotca, "Tofu in Tomatensauce", "(Đậu Hũ Sốt Cà)"));

        // add Nudeln Gerichte
        list.add(new FilterName(R.drawable.nudeln_phobo, "Rindernudelsuppe", "(Phở bò)"));
        list.add(new FilterName(R.drawable.nudeln_hutieutomthit, "Reisbandnudel Suppe mit Schweinefleisch und Garnele", "(Hủ tiếu tôm thịt)"));
        list.add(new FilterName(R.drawable.nudeln_mienga, "Hühner Glasnudelsuppet", "(Miến gà)"));
        list.add(new FilterName(R.drawable.nudeln_miquang, "Quang Nudel", "(Mì Quảng)"));
        list.add(new FilterName(R.drawable.nudeln_bunbohue, "Hue Rindersuppe", "(Bún bò Huế)"));
        list.add(new FilterName(R.drawable.nudeln_bunthitnuong, "Reisnudeln mit gegrilltem Schweinefleisch", "(Bún thịt nướng)"));
        list.add(new FilterName(R.drawable.nudeln_mixaobo, "Gebratene Nudeln mit Rind", "(Mì xào bò)"));
        list.add(new FilterName(R.drawable.nudeln_mienchayraucu, "Vegetarische gebratene Glasnudeln", "(Miến chay rau củ)"));
        list.add(new FilterName(R.drawable.nudeln_mienchayxao, "Vegetarische gebratene Glasnudeln", "(Miến chay xào)"));

        /* add Spezialitaet Gerichte
            to do later */

        /* add Vegetarisch Gerichte
            to do later */

        return list;
    }

    // add search in Actionbar on Activity
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        // make search to the left
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setMaxWidth(Integer.MAX_VALUE);

        // getFilter() call when we execute action on searchView
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                filterNameAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterNameAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }

    // onBackPressed von Android
    @Override
    public void onBackPressed() {
        if(!searchView.isIconified()){
            searchView.setIconified(true);
            return;
        }
        super.onBackPressed();
    }
}