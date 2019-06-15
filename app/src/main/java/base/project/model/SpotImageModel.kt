package base.project.model

/**
 * Created by Mehmet Deniz on 2019-06-15.
 * All rights reserved.
 */

data class SpotImageModel(var imageUrl: String) : BaseModel {
    override val type: Int
        get() = BaseModel.TYPE_SPOT_IMAGE
}