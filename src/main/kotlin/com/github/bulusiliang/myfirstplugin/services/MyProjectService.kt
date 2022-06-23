package com.github.bulusiliang.myfirstplugin.services

import com.intellij.openapi.project.Project
import com.github.bulusiliang.myfirstplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
