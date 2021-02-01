package com.absinthe.libchecker.ui.fragment

import rikka.material.app.AppBar
import rikka.material.widget.BorderViewDelegate

/**
 * <pre>
 * author : Absinthe
 * time : 2020/08/28
 * </pre>
 */
interface IListController {
    fun onReturnTop()
    fun getAppBar(): AppBar?
    fun getBorderViewDelegate(): BorderViewDelegate?
    fun scheduleAppbarRaisingStatus()
}