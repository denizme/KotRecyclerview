package base.project.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import base.project.model.BaseModel

/**
 * Created by Mehmet Deniz on 2019-06-15.
 * All rights reserved.
 */

abstract class BaseViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    abstract fun bindView(baseModel: BaseModel, position: Int)
}