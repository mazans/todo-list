package com.gmail.sergiusz.mazan.todolist.fragment

import android.arch.lifecycle.Observer
import android.os.Bundle

class TodayTaskListFragment : UndoneTaskListFragment() {

    override fun isInProject(): Boolean {
        return false
    }

    override fun isDateVisible(): Boolean {
        return false
    }

    override fun setObservers(savedInstanceState: Bundle?) {
        model.todayTasks.observe(this, Observer { item ->
            item?.let {
                adapter.submitList(item)
            }
        })
    }
}