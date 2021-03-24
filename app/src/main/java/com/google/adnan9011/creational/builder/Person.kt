package com.google.adnan9011.creational.builder

class Person(builder: Builder) {
    class Builder(
        // Necessary
        private var name: String
    ) {

        /*
         * Optional
         */
        private var family = ""
        private var age = 0

        /*
         * Functions
         */
        fun getPersonName() = name

        fun setPersonFamily(family: String): Builder {
            this.family = family
            return this
        }
        fun getPersonFamily() = family

        fun setPersonAge(age: Int): Builder {
            this.age = age
            return this
        }
        fun getPersonAge() = age

        // Create Function
        fun create() = Person(this)
    }

    private val name = builder.getPersonName()
    private val family = builder.getPersonFamily()
    private val age = builder.getPersonAge()

    override fun toString() : String {
        return "full name is ${name} ${family}  and ${age} years old"
    }
}