package base.project.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import base.project.model.BaseModel
import base.project.R
import base.project.adapter.viewholder.ContentViewHolder
import base.project.adapter.viewholder.DescriptionViewHolder
import base.project.adapter.viewholder.SpotImageViewHolder
import base.project.adapter.viewholder.TitleViewHolder

/**
 * Created by Mehmet Deniz on 2019-06-15.
 * All rights reserved.
 */


class AppRecyclerviewAdapter(var items: MutableList<BaseModel>) :
    RecyclerView.Adapter<BaseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {

        var layoutInflater = LayoutInflater.from(parent.context)

        return when (viewType) {

            BaseModel.TYPE_TITLE -> {
                TitleViewHolder(
                    layoutInflater.inflate(
                        R.layout.item_title,
                        parent,
                        false
                    )
                )
            }

            BaseModel.TYPE_DESCRIPTION -> {
                DescriptionViewHolder(
                    layoutInflater.inflate(
                        R.layout.item_description,
                        parent,
                        false
                    )
                )
            }

            BaseModel.TYPE_SPOT_IMAGE -> {
                SpotImageViewHolder(
                    layoutInflater.inflate(
                        R.layout.item_spot_image,
                        parent,
                        false
                    )
                )
            }

            BaseModel.TYPE_CONTENT -> {
                ContentViewHolder(
                    layoutInflater.inflate(
                        R.layout.item_content,
                        parent,
                        false
                    )
                )
            }

            else -> {
                throw IllegalArgumentException("Invalid view type")
            }
        }
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {

        when (items[position].type) {

            BaseModel.TYPE_TITLE -> {
                (holder as TitleViewHolder).bindView(items[position], position)
            }

            BaseModel.TYPE_DESCRIPTION -> {
                (holder as DescriptionViewHolder).bindView(items[position], position)
            }

            BaseModel.TYPE_SPOT_IMAGE -> {
                (holder as SpotImageViewHolder).bindView(items[position], position)
            }

            BaseModel.TYPE_CONTENT -> {
                (holder as ContentViewHolder).bindView(items[position], position)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].type
    }

}