package com.example.owedding.data.rules

object Validator {
    fun validateFirstName(fName: String) :Boolean {
        return (fName.isNullOrEmpty() || fName.length>=2)

    }

    fun validateLastName(lName: String) :Boolean {
        return (!lName.isNullOrEmpty() && lName.length>=2)

    }

    fun validateEmail(email: String) :Boolean {
        return (!email.isNullOrEmpty())

    }

    fun validatePassword(password: String) :Boolean {
        return (!password.isNullOrEmpty() && password.length>=4)

    }

    }


