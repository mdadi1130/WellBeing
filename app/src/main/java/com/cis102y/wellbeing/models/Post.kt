package com.cis102y.wellbeing.models

import com.google.firebase.firestore.ServerTimestamp
import java.util.Date

data class Post(
    var authorName: String = "",
    var text: String = "",
    @ServerTimestamp
    var createdTimestamp: Date? = null,
    var likeCount: Int = 0,
    var commentCount: Int = 0
)
