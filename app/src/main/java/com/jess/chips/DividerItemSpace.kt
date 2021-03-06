package com.jess.chips

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * RecyclerView 간격
 * @property orientation
 */
class DividerItemSpace(
//        private val orientation: Int? = VERTICAL,
        private val space: Int
) : RecyclerView.ItemDecoration() {

//    companion object {
//        const val HORIZONTAL = LinearLayoutManager.HORIZONTAL
//        const val VERTICAL = LinearLayoutManager.VERTICAL
//    }

    init {
//        checkValid()
    }

//    private fun checkValid() {
//        require(!(orientation != HORIZONTAL && orientation != VERTICAL)) { "invalid orientation" }
//    }

    override fun getItemOffsets(
            outRect: Rect,
            view: View,
            parent: RecyclerView,
            state: RecyclerView.State
    ) {


        val maxCount = parent.adapter?.itemCount ?: 0
        val position = parent.getChildAdapterPosition(view)

        if (position < maxCount) {
//            if (orientation == VERTICAL) {
//                outRect.set(0, 0, 0, space)
//            } else {
            outRect.set(0, 0, space, 0)
//            }
        }
    }
}