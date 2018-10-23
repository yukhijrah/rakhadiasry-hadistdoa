package rakhadiasry.app.kumpulanhadist.viewholder;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import rakhadiasry.app.kumpulanhadist.adapter.DoaAdapter;
import rakhadiasry.app.kumpulanhadist.model.Doa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rakha Diasry on 04/10/2018.
 */

public class MainActivity extends AppCompatActivity {

    private List<Doa> doas = new ArrayList<>();
    private RecyclerView lstDoa;

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstDoa = (RecyclerView) findViewById(R.id.lst_doa);

        LinearLayoutManager linear = new LinearLayoutManager(this);
        lstDoa.setLayoutManager(linear);

        doaCollections();

        DoaAdapter adapter = new DoaAdapter(doas);
        lstDoa.setAdapter(adapter);
    }

    private void doaCollections(){
        doas.add(new Doa("Masuk Masjid", "arti dari doa masjid", "surah"));
        doas.add(new Doa("Makan", "arti dari doa Makan", "surah"));
        doas.add(new Doa("Keluar Rumah", "arti dari doa Keluar Rumah", "surah"));
        doas.add(new Doa("Bercermin", "arti dari doa Bercermin", "surah"));
        doas.add(new Doa("Wudhu", "arti dari doa Wudhu", "surah"));
        doas.add(new Doa("Keluar Masjid", "arti dari doa Keluar Masjid", "surah"));
        doas.add(new Doa("Selesai Makan", "arti dari doa Selesai Makan", "surah"));
        doas.add(new Doa("Tidur", "arti dari doa Tidur", "surah"));
        doas.add(new Doa("Bangun Tidur", "arti dari doa Bangun Tidur", "surah"));
        doas.add(new Doa("Mulai Belajar", "arti dari doa Mulai Belajar", "surah"));
        doas.add(new Doa("Selesai Belajar", "arti dari doa Selesai Belajar", "surah"));

    }

}