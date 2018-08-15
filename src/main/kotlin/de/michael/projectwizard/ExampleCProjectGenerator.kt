package de.michael.projectwizard

import com.intellij.openapi.vfs.VirtualFile
import com.jetbrains.cidr.cpp.cmake.projectWizard.generators.CMakeAbstractCProjectGenerator
import com.jetbrains.cidr.cpp.cmake.projectWizard.generators.settings.ui.CMakeSettingsPanel

class ExampleCProjectGenerator: CMakeAbstractCProjectGenerator() {

    override fun getName(): String = "Custom C Project Generator"

    override fun createSourceFiles(projectName: String, projectDir: VirtualFile): Array<VirtualFile> {
        val content = "your file content here!"
        val filename = "myFile.c"

        val vf = createProjectFileWithContent(projectDir, filename, content)

        return arrayOf(vf)
    }

    override fun getCMakeFileContent(projectName: String): String {
        return "cmake_minimum_required(VERSION 3.11)\n" +
                "project($projectName C)\n" +
                "\n" +
                "set(CMAKE_C_STANDARD 11)"
    }

    /**
     * create custom UI of your project wizard here
     */
    override fun createSettingsPanel(): CMakeSettingsPanel {
        return super.createSettingsPanel()
    }
}