package com.example.lenovo.test04.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.lenovo.test04.R
import com.example.lenovo.test04.model.BaseBean
import com.example.lenovo.test04.presenter.IMain2Presenter
import com.example.lenovo.test04.presenter.Main2Presenter
import com.lzy.okgo.OkGo
import com.lzy.okgo.callback.AbsCallback
import com.lzy.okgo.model.Response

class Main2Activity : AppCompatActivity(), Main2View {
    private var main2Presenter: Main2Presenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        main2Presenter = IMain2Presenter(this)
        initData()
    }

    private fun initData() {
        OkGo.get<BaseBean>("").tag(this)
                .execute(object : AbsCallback<BaseBean>() {
                    override fun onSuccess(response: Response<BaseBean>) {

                    }

                    @Throws(Throwable::class)
                    override fun convertResponse(response: okhttp3.Response): BaseBean? {
                        return null
                    }
                })
    }
}
