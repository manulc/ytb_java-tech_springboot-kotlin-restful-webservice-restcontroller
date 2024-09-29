package com.mlorenzo.spring.kotlin.restful.dto

/* Una clase de Kotlin de tipo Data genera automáticamente los métodos getter y setter de las propiedades
   y, además, también genera los métodos toString, hashCode y equals.
   Nota: Genera los métodos getter y setter para aquellas propiedades declaradas con var(propiedades mutables) y solo
   los métodos getter para aquellas propiedades declarada con val(propiedades inmutables). */
data class User(val id: Int, val nane: String, val salary: Double)