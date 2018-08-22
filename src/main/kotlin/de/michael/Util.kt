package de.michael

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.application.ReadAction
import java.io.IOException

fun runAsWriteAction(action: () -> Any?) {
    ReadAction.run<IOException> {
        ApplicationManager.getApplication().runWriteAction {
            action.invoke()
        }
    }
}