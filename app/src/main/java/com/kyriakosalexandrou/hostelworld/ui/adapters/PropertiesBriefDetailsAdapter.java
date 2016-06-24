package com.kyriakosalexandrou.hostelworld.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kyriakosalexandrou.hostelworld.ImageUtil;
import com.kyriakosalexandrou.hostelworld.R;
import com.kyriakosalexandrou.hostelworld.models.city.PropertyBriefDetails;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kyriakos on 23/06/2016.
 */
public class PropertiesBriefDetailsAdapter extends BaseAdapter {
    private List<PropertyBriefDetails> mProperties = new ArrayList<>();
    private Context mContext;

    public PropertiesBriefDetailsAdapter(Context context, List<PropertyBriefDetails> property) {
        mContext = context;
        mProperties = property;
    }

    @Override
    public int getCount() {
        return mProperties.size();
    }

    @Override
    public PropertyBriefDetails getItem(int position) {
        return mProperties.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_properties_brief_details, null);
            viewHolder = new ViewHolder();
            bindViews(convertView, viewHolder);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        PropertyBriefDetails property = mProperties.get(position);
        setViewsValues(viewHolder, property);

        return convertView;
    }

    private void bindViews(View convertView, ViewHolder viewHolder) {
        viewHolder.thumbnail = (ImageView) convertView.findViewById(R.id.thumbnail);
        viewHolder.name = (TextView) convertView.findViewById(R.id.name);
        viewHolder.type = (TextView) convertView.findViewById(R.id.type);
        viewHolder.overallRating = (TextView) convertView.findViewById(R.id.overall_rating);
    }

    private void setViewsValues(ViewHolder viewHolder, PropertyBriefDetails property) {
        viewHolder.name.setText(property.getName());
        viewHolder.type.setText(property.getType());

        Integer overall = property.getOverallRating().getOverall();
        setOverallRating(viewHolder, overall);
        loadImage(viewHolder.thumbnail, property);
    }

    private void setOverallRating(ViewHolder viewHolder, Integer overall) {
        if(overall != null){
            viewHolder.overallRating.setText(String.valueOf(overall));
        } else{
            viewHolder.overallRating.setText(R.string.non_disclosure);
        }
    }

    private void loadImage(ImageView into, PropertyBriefDetails propertyBriefDetails) {
        String completeImageUrl = ImageUtil.loadFirstImage(propertyBriefDetails.getImages());
        Picasso.with(mContext).load(completeImageUrl).into(into);
    }

    private class ViewHolder {
        TextView name;
        TextView type;
        TextView overallRating;
        ImageView thumbnail;
    }
}