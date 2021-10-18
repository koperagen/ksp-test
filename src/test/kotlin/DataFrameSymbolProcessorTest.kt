package org.jetbrains.dataframe.ksp

import com.tschuchort.compiletesting.SourceFile
import io.kotest.assertions.asClue
import io.kotest.inspectors.forOne
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import io.kotest.matchers.string.shouldStartWith
import org.jetbrains.kotlin.codegen.state.ReceiverTypeAndTypeParameters
import kotlin.test.Test

class DataFrameSymbolProcessorTest {

    @Test
    fun example() {
        val result = KspCompilationTestRunner.compile(
            TestCompilationParameters(
            sources = listOf(annotations, dataColumn, dataFrame, dataRow, SourceFile.kotlin("MySources.kt", """
                import org.jetbrains.dataframe.annotations.*
                import org.jetbrains.dataframe.columns.*
                import org.jetbrains.dataframe.*

                @DataSchema(isOpen = false)
                interface Hello {
                    val name: String
                }

        
            """.trimIndent()))
        ))
        result.successfulCompilation shouldBe true
    }
}
