package base.project.adapter.viewholder

import android.view.View
import android.widget.TextView
import base.project.model.BaseModel
import base.project.R
import base.project.adapter.BaseViewHolder
import base.project.model.TitleModel

/**
 * Created by Mehmet Deniz on 2019-06-15.
 * All rights reserved.
 */

class TitleViewHolder(view: View) : BaseViewHolder(view) {

    var tv_title = view.findViewById<TextView>(R.id.tv_title)

    override fun bindView(items: BaseModel, position: Int) {
        var item = items as TitleModel
        tv_title.text = item.title
    }
}