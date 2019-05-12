package com.gmail.sergiusz.mazan.todolist

import android.arch.lifecycle.Observer

class TodayTaskListFragment : TaskListFragment() {

    override fun isDateVisible(): Boolean {
        return false
    }

    override fun setObservers() {
        model.todayTasks.observe(this, Observer { item ->
            item?.let {
                adapter.submitList(item)
            }
        })
    }
}