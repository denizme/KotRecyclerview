package base.project.model

/**
 * Created by Mehmet Deniz on 2019-06-15.
 * All rights reserved.
 */

data class ContentModel(val content: String) : BaseModel {
    override val type: Int
        get() = BaseModel.TYPE_CONTENT
}