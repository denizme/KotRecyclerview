package base.project.adapter.viewholder

import android.view.View
import android.widget.TextView
import base.project.model.BaseModel
import base.project.R
import base.project.adapter.BaseViewHolder
import base.project.model.ContentModel
import base.project.model.TitleModel

/**
 * Created by Mehmet Deniz on 2019-06-15.
 * All rights reserved.
 */

class ContentViewHolder(view: View) : BaseViewHolder(view) {

    var tv_content = view.findViewById<TextView>(R.id.tv_content)

    override fun bindView(items: BaseModel, position: Int) {
        var item = items as ContentModel
        tv_content.text = item.content
    }
}