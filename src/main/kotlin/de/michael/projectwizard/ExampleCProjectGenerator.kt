package de.michael.projectwizard

import com.intellij.openapi.vfs.VirtualFile
import com.jetbrains.cidr.cpp.cmake.projectWizard.generators.CMakeAbstractCProjectGenerator

class ExampleCProjectGenerator: CMakeAbstractCProjectGenerator() {
    override fun getName(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createSourceFiles(p0: String, p1: VirtualFile): Array<VirtualFile> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCMakeFileContent(p0: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}