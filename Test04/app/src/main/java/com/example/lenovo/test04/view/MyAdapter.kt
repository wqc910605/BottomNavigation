package com.example.lenovo.test04.view

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.example.lenovo.test04.model.MyBean

class MyAdapter:BaseQuickAdapter<MyBean, BaseViewHolder>{
    constructor(layoutResId:Int, data:MutableList<MyBean>?):super(layoutResId, data)

    override fun convert(helper: BaseViewHolder?, item: MyBean?) {

    }

}


