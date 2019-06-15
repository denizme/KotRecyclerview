package base.project.model

/**
 * Created by Mehmet Deniz on 2019-06-15.
 * All rights reserved.
 */

interface BaseModel {
    val type: Int

    companion object {

        const val TYPE_TITLE = 1
        const val TYPE_DESCRIPTION = 2
        const val TYPE_SPOT_IMAGE = 3
        const val TYPE_CONTENT = 4
    }
}