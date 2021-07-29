package com.vaca.myapplication

import android.app.Dialog
import android.content.Context
import android.view.View
import android.view.WindowManager
import java.lang.Exception


object Ca {

    var dialog:Dialog?=null

    /** * * @param context 上下文 * @param resource 资源 layout布局 * @param dialogStyle 弹出样式 * @param gravity 方向 * @param width 宽 * @param height 高 * @param animation 动画  */
    fun customDialog(
        context: Context?, resource: Int,
        dialogStyle: Int,
        gravity: Int,
        width: Int,
        height: Int,
        animation: Int
    ) {
        try {
            dialog?.dismiss()
        }catch (e:Exception){

        }

        val view: View = View.inflate(context, resource, null)
        dialog = context?.let { Dialog(it, dialogStyle) }
        dialog?.setContentView(view)
        val layoutParams: WindowManager.LayoutParams? = dialog?.getWindow()?.getAttributes()
        if (layoutParams != null) {
            layoutParams.width = width
        }
        if (layoutParams != null) {
            layoutParams.height = height
        }
        //        layoutParams.y = 180;//距离顶部的距离
      dialog?.apply {
          window?.attributes = layoutParams
          window?.setGravity(gravity)
          window?.setWindowAnimations(animation)
          show()
      }



    }

    fun fuck(){
        dialog?.dismiss()
    }
}