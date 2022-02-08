package com.github.carlosmartinezfti.tabswitcherextreme2.services

import com.intellij.openapi.project.Project
import com.github.carlosmartinezfti.tabswitcherextreme2.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
