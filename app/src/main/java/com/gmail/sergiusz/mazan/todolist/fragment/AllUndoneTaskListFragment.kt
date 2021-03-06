package com.gmail.sergiusz.mazan.todolist.fragment

import android.arch.lifecycle.Observer
import android.os.Bundle

class AllUndoneTaskListFragment : UndoneTaskListFragment() {
    override fun isInProject(): Boolean {
        return false
    }

    override fun setObservers(savedInstanceState: Bundle?) {
        model.allUndoneTasks.observe(this, Observer { item ->
            item?.let {
                adapter.submitList(item)
            }
        })
    }

    override fun isDateVisible(): Boolean {
        return true
    }
}