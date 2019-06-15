package base.project.adapter.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import base.project.model.BaseModel
import base.project.R
import base.project.adapter.BaseViewHolder
import base.project.model.SpotImageModel
import base.project.model.TitleModel
import com.bumptech.glide.Glide

/**
 * Created by Mehmet Deniz on 2019-06-15.
 * All rights reserved.
 */

class SpotImageViewHolder(var view: View) : BaseViewHolder(view) {

    var img_spot = view.findViewById<ImageView>(R.id.img_spot)

    override fun bindView(items: BaseModel, position: Int) {
        var item = items as SpotImageModel
        Glide.with(view.context).load(item.imageUrl).into(img_spot)
    }
}