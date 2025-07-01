package com.proyek.nusantara.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.proyek.nusantara.PopupItem;
import com.proyek.nusantara.R;

import java.util.List;

public class PopupPagerAdapter extends RecyclerView.Adapter<PopupPagerAdapter.ViewHolder> {
    private final List<PopupItem> items;
    private final Context context;

    public PopupPagerAdapter(Context context, List<PopupItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_popup_page, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PopupItem item = items.get(position);
        Glide.with(context)
                .load(item.getImageUrl())
                .placeholder(R.drawable.ic_nusantara2)
                .error(R.drawable.background)
                .into(holder.imgPopup);
        holder.txtPopup.setText(item.getText());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPopup;
        TextView txtPopup;
        ViewHolder(View itemView) {
            super(itemView);
            imgPopup = itemView.findViewById(R.id.imgPopup);
            txtPopup = itemView.findViewById(R.id.txtPopup);
        }
    }
}