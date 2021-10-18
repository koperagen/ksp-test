package org.jetbrains.dataframe.ksp

import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.*

class DataFrameSymbolProcessor : SymbolProcessor {
    override fun process(resolver: Resolver): List<KSAnnotated> {
        val dataSchemaAnnotation = resolver.getKSNameFromString("org.jetbrains.dataframe.annotations.DataSchema")
        val symbols = resolver.getSymbolsWithAnnotation(dataSchemaAnnotation.asString())

        return emptyList()
    }
}
