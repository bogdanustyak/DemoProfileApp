package com.test.testprofileproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by bogdan on 8/30/16.
 */

public class ImagesAdapter extends RecyclerView.Adapter<ImagesAdapter.RecyclerViewHolders> {

    private Context context;
    private List<Image> images;

    public ImagesAdapter(Context context, List<Image> images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(context).inflate(R.layout.cell_image, null);
        return new RecyclerViewHolders(layoutView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        Image image = images.get(position);
        holder.ivPhoto.setImageResource(image.getImageResource());

        if (!TextUtils.isEmpty(image.getCount())) {
            holder.tvCount.setText(image.getCount());
        } else {
            holder.tvCount.setText("");
        }
    }

    @Override
    public int getItemCount() {
        if (images != null) {
            return images.size();
        }
        return 0;
    }

    static class RecyclerViewHolders extends RecyclerView.ViewHolder {

        TextView tvCount;
        ImageView ivPhoto;

        public RecyclerViewHolders(View itemView) {
            super(itemView);
            tvCount = (TextView) itemView.findViewById(R.id.tv_count);
            ivPhoto = (ImageView) itemView.findViewById(R.id.iv_photo);
        }
    }

}
