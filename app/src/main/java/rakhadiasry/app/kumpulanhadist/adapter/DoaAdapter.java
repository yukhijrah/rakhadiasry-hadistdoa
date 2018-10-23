package rakhadiasry.app.kumpulanhadist.adapter;
/**
 * Created by Rakha Diasry on 23/10/2018.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import rakhadiasry.app.kumpulanhadist.R;
import rakhadiasry.app.kumpulanhadist.model.Doa;
import rakhadiasry.app.kumpulanhadist.viewholder.

import java.util.List;


public class DoaAdapter extends RecyclerView.Adapter<DoaHolder> {

    private List<Doa> doas;

    public DoaAdapter(List<Doa> doas){
        this.doas = doas;
    }

    @Override
    public DoaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DoaHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doa,parent, false));
    }

    @Override
    public void onBindViewHolder(DoaHolder holder, int position) {
        holder.txtNamaDoa.setText(doas.get(position).getNama());
        holder.txtArtiDoa.setText(doas.get(position).getArti());
    }

    @Override
    public int getItemCount() {
        return doas.size();
    }
}
