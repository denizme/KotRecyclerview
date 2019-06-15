package base.project.adapter.viewholder

import android.view.View
import android.widget.TextView
import base.project.model.BaseModel
import base.project.R
import base.project.adapter.BaseViewHolder
import base.project.model.DescriptionModel

/**
 * Created by Mehmet Deniz on 2019-06-15.
 * All rights reserved.
 */

class DescriptionViewHolder(view: View) : BaseViewHolder(view) {

    var tv_desc = view.findViewById<TextView>(R.id.tv_desc)

    override fun bindView(items: BaseModel, position: Int) {
        var item = items as DescriptionModel
        tv_desc.text = item.description
    }
}