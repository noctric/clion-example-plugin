package de.michael.run

import com.intellij.execution.configurations.CommandLineState
import com.intellij.execution.process.ProcessHandler
import com.intellij.openapi.project.Project
import com.intellij.xdebugger.XDebugSession
import com.jetbrains.cidr.execution.debugger.CidrDebugProcess
import com.jetbrains.cidr.execution.testing.CidrLauncher

class ExampleLauncher : CidrLauncher() {
    override fun createDebugProcess(p0: CommandLineState, p1: XDebugSession): CidrDebugProcess {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createProcess(p0: CommandLineState): ProcessHandler {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getProject(): Project {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}