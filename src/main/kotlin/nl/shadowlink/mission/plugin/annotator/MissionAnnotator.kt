package nl.shadowlink.mission.plugin.annotator

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import nl.shadowlink.mission.plugin.psi.StringElement

class MissionAnnotator: Annotator {

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if(element is StringElement) {
            element.annotate(holder)
        }
    }
}