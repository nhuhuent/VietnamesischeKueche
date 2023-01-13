package com.example.vietnamesichekche;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

public class Search_Filter_Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    private FilterNameAdapter filterNameAdapter;
    private SearchView searchView;
    List<FilterName> list = new ArrayList<>();
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_filter);

        //getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_HOME);
        //getSupportActionBar().setCustomView(R.layout.activity_search_filter);

        // back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.recyclerView_filter);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        // getListName() call
        filterNameAdapter = new FilterNameAdapter(getListName(), new InterfaceClickItemFilter() {
            @Override
            public void onClickItemFilter(FilterName filterName) {
                onClickGoToDetail(filterName);
            }
        });

        recyclerView.setAdapter(filterNameAdapter);

        // Filter: sepatator line between dishes
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);
    }

    // onClick on FilterListe and change on another activity
    private void onClickGoToDetail (@NonNull FilterName filterName) {
        switch (filterName.getDeutschName()) {
            case "Gebrochener Reis mit gegrilltem Kotelett":
                intent = new Intent(this, Reis_ComTam_Activity.class);
                break;
            case "Geschwenktes Rindfleisch":
                intent = new Intent(this, Reis_BoLucLac_Activity.class);
                break;
            case "Vegetarische Sauersuppe":
                intent = new Intent(this, Reis_Vege_CanhChuaNamChay_Activity.class);
                break;
            case "Gekochtes Huhn mit Reis":
                intent = new Intent(this, Reis_ComGaLuoc_Activity.class);
                break;
            case "Grillente mit Reis":
                intent = new Intent(this, Reis_ComVitQuay_Activity.class);
                break;
            case "Gebratenes Hühnchen mit Zitronengras":
                intent = new Intent(this, Reis_GaXaoSaOt_Activity.class);
                break;
            case "Gebratener Reis mit Ei, Garnele und Gemüse":
                intent = new Intent(this, Reis_ComChienDuongChau_Activity.class);
                break;
            case "Vegetarische Tofu in Tomatensauce":
                intent = new Intent(this, Reis_Vege_DauHuSotCa_Activity.class);
                break;

            case "Rindernudelsuppe":
                intent = new Intent(this, Nudeln_PhoBo_Activity.class);
                break;
            case "Reisbandnudel Suppe mit Schweinefleisch und Garnele":
                intent = new Intent(this, Nudeln_HuTieuTomThit_Activity.class);
                break;
            case "Hühner Glasnudelsuppe":
                intent = new Intent(this, Nudeln_MienGa_Activity.class);
                break;
            case "Quang Nudel":
                intent = new Intent(this, Nudeln_MiQuang_Activity.class);
                break;
            case "Hue Rindersuppe":
                intent = new Intent(this, Nudeln_BunBoHue_Activity.class);
                break;
            case "Reisnudeln mit gegrilltem Schweinefleisch":
                intent = new Intent(this, Nudeln_BunThitNuong_Activity.class);
                break;
            case "Vegetarische Glasnudelsuppe":
                intent = new Intent(this, Nudeln_Vege_MienChayRauCu_Activity.class);
                break;
            case "Vegetarische gebratene Glasnudeln":
                intent = new Intent(this, Nudeln_Vege_MienChayXao_Activity.class);
                break;

            case "Vietnamesiches Schweinefleisch-Baguette":
                intent = new Intent(this, Spezialitaet_BanhMiThitHeoNuong_Activity.class);
                break;
            case "Vietnamesische Pfannkuchen":
                intent = new Intent(this, Spezialitaet_BanhXeo_Activity.class);
                break;
            case "Vietnamesische Sommerrollen":
                intent = new Intent(this, Spezialitaet_GoiCuon_Activity.class);
                break;
            case "Vietnamesisches Gulasch":
                intent = new Intent(this, Spezialitaet_BoKho_Activity.class);
                break;
            case "Meeresfrüchte Fondue":
                intent = new Intent(this, Spezialitaet_LauHaiSan_Activity.class);
                break;
            case "Vietnamesische Frühlingsrollen":
                intent = new Intent(this, Spezialitaet_ChaGio_Activity.class);
                break;
            case "Vegetarische Frühlingsrollen":
                intent = new Intent(this, Spezialitaet_Vege_ChaGioChay_Activity.class);
                break;
            case "Vegetarische Sommerrollen":
                intent = new Intent(this, Spezialitaet_Vege_GoiCuonChay_Activity.class);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + filterName.getDeutschName());
        }
        intent.putExtra("chooseActivity", 1);

        startActivity(intent);
    }

    // FilterName with 3 parameter
    private List<FilterName> getListName() {
        // add Reis Gerichte on search page
        list.add(new FilterName(R.drawable.reis_comtam, "Gebrochener Reis mit gegrilltem Kotelett", "(Cơm Tấm)"));
        list.add(new FilterName(R.drawable.reis_boluclac, "Geschwenktes Rindfleisch", "(Bò Lúc Lắc)"));
        list.add(new FilterName(R.drawable.reis_canhchuanamchay, "Vegetarische Sauersuppe", "(Canh Chua Nấm Chay)"));
        list.add(new FilterName(R.drawable.reis_comgaluoc, "Gekochtes Huhn mit Reis", "(Cơm Gà Luộc)"));
        list.add(new FilterName(R.drawable.reis_comvitquay, "Grillente mit Reis", "(Cơm Vịt Quay)"));
        list.add(new FilterName(R.drawable.reis_gaxaosaot, "Gebratenes Hühnchen mit Zitronengras", "(Gà Xào Sả Ớt)"));
        list.add(new FilterName(R.drawable.reis_comchienduongchau, "Gebratener Reis mit Ei, Garnele und Gemüse", "(Cơm Chiên Dương Châu)"));
        list.add(new FilterName(R.drawable.reis_dauhusotca, "Vegetarische Tofu in Tomatensauce", "(Đậu Hũ Sốt Cà)"));

        // add Nudeln Gerichte on search page
        list.add(new FilterName(R.drawable.nudeln_phobo, "Rindernudelsuppe", "(Phở Bò)"));
        list.add(new FilterName(R.drawable.nudeln_hutieutomthit, "Reisbandnudel Suppe mit Schweinefleisch und Garnele", "(Hủ Tiếu Tôm Thịt)"));
        list.add(new FilterName(R.drawable.nudeln_mienga, "Hühner Glasnudelsuppe", "(Miến Gà)"));
        list.add(new FilterName(R.drawable.nudeln_miquang, "Quang Nudel", "(Mì Quảng)"));
        list.add(new FilterName(R.drawable.nudeln_bunbohue, "Hue Rindersuppe", "(Bún Bò Huế)"));
        list.add(new FilterName(R.drawable.nudeln_bunthitnuong, "Reisnudeln mit gegrilltem Schweinefleisch", "(Bún Thịt Nướng)"));
        list.add(new FilterName(R.drawable.nudeln_mienchayraucu, "Vegetarische Glasnudelsuppe", "(Miến Chay Rau Củ)"));
        list.add(new FilterName(R.drawable.nudeln_mienchayxao, "Vegetarische gebratene Glasnudeln", "(Miến Chay Xào)"));

        // add Spezialitaet Gerichte on search page
        list.add(new FilterName(R.drawable.spezialitaet_banhmithitheonuong, "Vietnamesiches Schweinefleisch-Baguette", "(Bánh Mì Thịt Heo Nướng)"));
        list.add(new FilterName(R.drawable.spezialitaet_banhxeo, "Vietnamesische Pfannkuchen", "(Bánh Xèo)"));
        list.add(new FilterName(R.drawable.spezialitaet_goicuon, "Vietnamesische Sommerrollen", "(Gỏi Cuốn)"));
        list.add(new FilterName(R.drawable.spezialitaet_bokho, "Vietnamesisches Gulasch", "(Bò kKho)"));
        list.add(new FilterName(R.drawable.spezialitaet_lauhaisan, "Meeresfrüchte Fondue", "(Lẩu Hải Sản)"));
        list.add(new FilterName(R.drawable.spezialitaet_chagio, "Vietnamesische Frühlingsrollen", "(Chả Giò)"));
        list.add(new FilterName(R.drawable.spezialitaet_chagiochay, "Vegetarische Frühlingsrollen", "(Chả Giò Chay)"));
        list.add(new FilterName(R.drawable.spezialitaet_goicuonchay, "Vegetarische Sommerrollen", "(Gỏi Cuốn Chay)"));

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