package com.example.p_viewpage2_three_page;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class SliderRecyclerViewPager extends RecyclerView.Adapter<SliderRecyclerViewPager.SliderViewHolder> {
    private List<SliderItem> mData; //int圖片類別
    private ViewPager2 viewPager2; //viewPager2


    public SliderRecyclerViewPager(List<SliderItem> mData, ViewPager2 viewPager2) {
        this.mData = mData;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_page,parent,false);
        SliderViewHolder sliderViewHolder = new SliderViewHolder(view);
        return sliderViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, int position) {
        holder.setImage(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class SliderViewHolder extends RecyclerView.ViewHolder{
        private RoundedImageView roundedImageView;
        public SliderViewHolder(@NonNull View itemView) {
            super(itemView);

            roundedImageView = itemView.findViewById(R.id.item_image_view);

        }

        /*6.設定圖片
         * @param SliderItem sliderItem => int圖片類別
         * */
        void setImage(SliderItem sliderItem){
            roundedImageView.setImageResource(sliderItem.getImg());
        }


    }
}