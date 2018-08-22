package de.michael.projectwizard

import com.intellij.openapi.module.ModuleType
import com.intellij.testFramework.LightProjectDescriptor
import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase
import com.intellij.ultimate.UltimateVerifier
import com.jetbrains.cidr.cpp.CPPModuleType
import de.michael.runAsWriteAction

/**
 * simple way of testing plugins
 */
class ProjectGeneration : LightPlatformCodeInsightFixtureTestCase() {
    override fun getProjectDescriptor(): LightProjectDescriptor = object : LightProjectDescriptor() {
        override fun getModuleType(): ModuleType<*> {
            // commonly used module type for C/CPP projects
            return CPPModuleType(UltimateVerifier.getInstance())
        }
    }

    override fun getTestDataPath(): String = "./testdata"



    fun `test source file generation of custom cmake C project generator`() {
        // utility function
        runAsWriteAction {
            ExampleCProjectGenerator().createSourceFiles(project.name, project.baseDir)
        }

        val createdSourceFile = project.baseDir.findChild("myFile.c")

        // throws exception if the file was not found
        myFixture.configureByFile(createdSourceFile!!.path)

        // compare it to the source file we have in our test data directory
        myFixture.checkResultByFile("SourceFile.c", true)
    }
}