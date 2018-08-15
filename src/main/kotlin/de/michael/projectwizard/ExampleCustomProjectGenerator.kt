package de.michael.projectwizard

import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.IconLoader
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.DirectoryProjectGeneratorBase
import javax.swing.Icon

class ExampleCustomProjectGenerator : DirectoryProjectGeneratorBase<CustomProjectSettings>() {
    override fun generateProject(project: Project, projectDir: VirtualFile, projectSettings: CustomProjectSettings, module: Module) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getName(): String = "Custom Project"

    override fun getLogo(): Icon? = IconLoader.findIcon("/Icons/favorite.png")

}

data class CustomProjectSettings(val setting1: String, val setting2: String)