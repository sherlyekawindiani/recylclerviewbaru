package com.sherlyeka.recylclerviewbaru

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.recycler_view_template, parent, false)) {

        private var imgView: ImageView? = null
        private var textTitle: TextView? = null
        private var textSubTitle: TextView? = null

        init {
            textTitle       = itemView.findViewById(R.id.text_title)
            textSubTitle   = itemView.findViewById(R.id.text_sub_title)

        }
    fun  bind(data: SocialMedia){
        textTitle?.text = data.txtTitle
       textSubTitle?.text = data.txtSubTitle

    }
}